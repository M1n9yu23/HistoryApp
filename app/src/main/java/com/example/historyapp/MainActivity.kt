package com.example.historyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.historyapp.ui.DecadeScreen
import com.example.historyapp.ui.HomeScreen
import com.example.historyapp.ui.theme.HistoryDetailScreen
import com.example.historyapp.ui.theme.YearEventsScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HistoryApp()
        }
    }
}

@Composable
fun HistoryApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(
                onNavigateToDecade = { navController.navigate(Screen.Decade.route) })
        }
        composable(Screen.Decade.route) {
            DecadeScreen(onDecadeClick = {
                decade ->
                navController.navigate(Screen.YearEvents.createRoute(decade)) },
                onNavigateBack = { navController.popBackStack()},
                onNavigateHome = { navController.navigate(Screen.Home.route)})
        }
        composable(Screen.YearEvents.route) { backStackEntry ->
            val decade = backStackEntry.arguments?.getString("decade") ?: ""
            YearEventsScreen(decade = decade,
                onNavigateBack = { navController.popBackStack() },
                onNavigateHome = {navController.navigate(Screen.Home.route)},
                onEventClick = { detailDesc ->
                    navController.navigate(Screen.Detail.createRoute(detailDesc))
                }
                )
        }
        composable(Screen.Detail.route) { backStackEntry ->
            val detailDesc = backStackEntry.arguments?.getString("detailDesc") ?: "설명이 없습니다."
            HistoryDetailScreen(
                detailDesc = detailDesc,
                onNavigateBack = { navController.popBackStack() },
                onNavigateHome = { navController.navigate(Screen.Home.route) }
            )
        }
    }
}
