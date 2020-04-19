package com.example.coronago.cache

import androidx.lifecycle.LiveData
import com.example.coronago.AppDatabase
import com.example.coronago.dao.CountryDao
import com.example.coronago.model.Country

class CountryCache(appDatabase: AppDatabase) {

    private val countryDao: CountryDao = appDatabase.getCountryDao()

    fun insert(country: Country) {
        countryDao.insert(country)
    }

    fun insertCountries(Countries: List<Country>) {
        countryDao.insertAll(Countries)
    }

    fun update(country: Country) {
        countryDao.update(country)
    }

    fun delete(country: Country) {
        countryDao.delete(country)
    }

    fun getAllCountriesList() = countryDao.getAllCountries()

    fun getAllCountriesLiveData(): LiveData<List<Country>> = countryDao.getAllCountriesLD()

    fun getTotalNoOfCountries() = countryDao.getTotalNoOfCountriesLD()

}