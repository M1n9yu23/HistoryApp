package com.example.historyapp.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


/**
 * AppBar를 위한 컴포저블
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    title: String,
    onNavigateBack: () -> Unit,
    onNavigateHome: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                style = MaterialTheme.typography
                    .headlineSmall
                    .copy(color = Color(0xFF4A3320))
            )
        },
        navigationIcon = {
            IconButton(onClick = onNavigateBack) {
                Icon(
                    Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color(0xFF4A3320)
                )
            }
        },
        actions = {
            IconButton(onClick = onNavigateHome) {
                Icon(
                    Icons.Default.Home,
                    contentDescription = "Home",
                    tint = Color(0xFF4A3320)
                )
            }
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color(0xFFE0C6A8)
        )
    )
}
