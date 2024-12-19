package com.example.historyapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.historyapp.data.HistoryDatabase
import com.example.historyapp.data.HistoryRepository
import com.example.historyapp.model.History
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


/**
 * 데이터를 가져오고 UI에 전달하는 ViewModel
 */
class HistoryViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: HistoryRepository

    init {
        val dao = HistoryDatabase.getDatabase(application).historyDao()
        repository = HistoryRepository(dao)
    }

    private val _histories = MutableStateFlow<List<History>>(emptyList())
    val histories: StateFlow<List<History>> get() = _histories

    /** 특정 연대의 데이터를 가져오는 함수
     * @param: decade: 요청할 연대
     */
    fun fetchHistoriesByDecade(decade: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val data = repository.getHistoriesByDecade(decade)
            _histories.value = data
        }
    }
}