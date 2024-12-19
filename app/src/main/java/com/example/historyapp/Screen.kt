package com.example.historyapp

/**
 * 네비게이션 경로를 관리하기 위한 sealed class.
 */
sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Decade : Screen("decade")
    object YearEvents : Screen("year_events/{decade}") {
        fun createRoute(decade: String) = "year_events/$decade"
    }
    object Detail : Screen("detail/{detailDesc}") {
        fun createRoute(detailDesc: String?) = "detail/$detailDesc"
    }
}