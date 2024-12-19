package com.example.historyapp.data

import com.example.historyapp.model.History


class HistoryRepository(private val dao: HistoryDao) {
    fun getHistoriesByDecade(decade: String): List<History> {
        return dao.getHistoriesByDecade(decade)
    }
}
