package com.example.coronago.repo

import androidx.lifecycle.LiveData
import com.example.coronago.cache.CountryCache
import com.example.coronago.model.Country
import com.example.coronago.remote.CountryRemote
import javax.inject.Inject

class CountryRepo @Inject constructor(
    private val countryRemote: CountryRemote,
    private val countryCache: CountryCache
) {
    //Cache data access methods
    fun insert(country: Country) {
        countryCache.insert(country)
    }

    fun insertCountries(Countries: List<Country>) {
        countryCache.insertCountries(Countries)
    }

    fun update(country: Country) {
        countryCache.update(country)
    }

    fun delete(country: Country) {
        countryCache.delete(country)
    }

    fun getAllCountriesList() = countryCache.getAllCountriesList()

    fun getAllCountriesLiveData(): LiveData<List<Country>> = countryCache.getAllCountriesLiveData()

    fun getTotalNoOfCountries() = countryCache.getTotalNoOfCountries()

    //Remote data access methods
    fun fetchDeceasedAndRecovered() = countryRemote.fetchDeceasedAndRecovered()

}