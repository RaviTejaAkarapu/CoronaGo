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

    fun insertStates(States: List<State>) {
        stateDao.insertAll(States)
    }

    fun update(state: State) {
        stateDao.update(state)
    }

    fun delete(state: State) {
        stateDao.delete(state)
    }

    fun getAllStatesList() = stateDao.getAllStates()

    fun getAllStatesLiveData(): LiveData<List<State>> = stateDao.getAllStatesLD()

    fun getTotalNoOfStates() = stateDao.getTotalNoOfStatesLD()

}