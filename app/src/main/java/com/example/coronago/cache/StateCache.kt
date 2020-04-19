package com.example.coronago.cache

import androidx.lifecycle.LiveData
import com.example.coronago.AppDatabase
import com.example.coronago.dao.StateDao
import com.example.coronago.model.State

class StateCache(appDatabase: AppDatabase) {

    private val stateDao: StateDao = appDatabase.getStateDao()

    fun insert(state: State) {
        stateDao.insert(state)
    }

    fun insertCountries(Countries: List<State>) {
        stateDao.insertAll(Countries)
    }

    fun update(state: State) {
        stateDao.update(state)
    }

    fun delete(state: State) {
        stateDao.delete(state)
    }

    fun getAllCountriesList() = stateDao.getAllStates()

    fun getAllCountriesLiveData(): LiveData<List<State>> = stateDao.getAllStatesLD()

    fun getTotalNoOfCountries() = stateDao.getTotalNoOfStatesLD()

}