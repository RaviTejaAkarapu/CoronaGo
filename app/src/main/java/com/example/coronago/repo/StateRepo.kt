package com.example.coronago.repo

import androidx.lifecycle.LiveData
import com.example.coronago.cache.StateCache
import com.example.coronago.model.State
import com.example.coronago.remote.StateRemote
import javax.inject.Inject

class StateRepo @Inject constructor(
    private val stateRemote: StateRemote,
    private val stateCache: StateCache
) {
    //Cache data access methods
    fun insert(state: State) {
        stateCache.insert(state)
    }

    fun insertStates(States: List<State>) {
        stateCache.insertStates(States)
    }

    fun update(state: State) {
        stateCache.update(state)
    }

    fun delete(state: State) {
        stateCache.delete(state)
    }

    fun getAllStatesList() = stateCache.getAllStatesList()

    fun getAllStatesLiveData(): LiveData<List<State>> = stateCache.getAllStatesLiveData()

    fun getTotalNoOfStates() = stateCache.getTotalNoOfStates()

    //Remote data access methods
    fun fetchStateWiseData() = stateRemote.fetchStateWiseData()

}