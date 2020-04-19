package com.example.coronago

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.coronago.dao.CountryDao
import com.example.coronago.dao.DistrictDao
import com.example.coronago.dao.PatientDao
import com.example.coronago.dao.StateDao
import com.example.coronago.model.Country
import com.example.coronago.model.District
import com.example.coronago.model.Patient
import com.example.coronago.model.State
import com.example.coronago.repo.DistrictRepo

@Database(
    entities = [Patient::class, Country::class, District::class, State::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getCountryDao(): CountryDao
    abstract fun getDistrictDao(): DistrictDao
    abstract fun getStateDao(): StateDao
    abstract fun getPatientDao(): PatientDao

    companion object {
        lateinit var appDatabase: AppDatabase

        fun getAppDatabase(context: Context): AppDatabase {
            if (appDatabase == null) {
                appDatabase = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java, "corona-tracker-db"
                )
                    .addMigrations().allowMainThreadQueries()
                    .build()
            }
            return appDatabase
        }
    }

}