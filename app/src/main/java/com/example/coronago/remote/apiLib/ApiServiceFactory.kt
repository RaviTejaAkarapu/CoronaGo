package com.example.coronago.remote.apiLib

import android.content.Context
import com.example.coronago.LocalStorage
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object ApiServiceFactory {
    private val logging: HttpLoggingInterceptor =
        HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    fun generateApiService(
        localStorage: LocalStorage,
        context: Context
    ): ApiService {
        return provideApiService(
            provideOkhttpClient(
                localStorage,
                context
            )
        )
    }

    private fun provideOkhttpClient(
        localStorage: LocalStorage,
        context: Context
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS) // TODO check authenticator
//            .addInterceptor(Interceptor { chain: Interceptor.Chain ->
//                val accessToken: String = localStorage.getAccessToken()
//                val requestBuilder = chain.request().newBuilder()
//                 TODO : Dont add header for login
//                var request = requestBuilder.build()
//                if (!request.url.toString().contains("account-service/auth")) {
//                    requestBuilder.addHeader("Authorization", "Bearer $accessToken")
//                }
//                request = requestBuilder.build()
//                chain.proceed(request)
//            })
            .build()
    }

    private fun provideApiService(okHttpClient: OkHttpClient): ApiService {
        val retrofit = Retrofit.Builder()
            .baseUrl("base url goes here")
            .client(okHttpClient)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()
        return retrofit.create(ApiService::class.java)
    }
}
