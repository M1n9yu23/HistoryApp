package com.example.historyapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.historyapp.ui.theme.TopBar


@Composable
fun DecadeScreen(onDecadeClick: (String) -> Unit,
                 onNavigateBack: () -> Unit,
                 onNavigateHome: () -> Unit
) {
    val decades = listOf(
        "1800년대", "1810년대", "1820년대", "1830년대", "1840년대",
        "1850년대", "1860년대", "1870년대", "1880년대", "1890년대",
        "1900년대", "1910년대", "1920년대", "1930년대", "1940년대",
        "1950년대", "1960년대", "1970년대", "1980년대", "1990년대",
        "2000년대", "2010년대", "2020년대"
    )

    Scaffold(
        topBar = {
            TopBar(
                title = "연대",
                onNavigateBack = onNavigateBack,
                onNavigateHome = onNavigateHome
            )
        },
        containerColor = Color(0xFFFAF3E3)
    ) { innerPadding ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(decades) { decade ->
                Card(
                    onClick = { onDecadeClick(decade) },
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE8D5B5)),
                    elevation = CardDefaults.cardElevation(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = decade,
                            style = MaterialTheme.typography.headlineSmall.copy(
                                color = Color(0xFF6B4226),
                                shadow = Shadow(Color.Black, offset = Offset(1f, 1f), blurRadius = 4f)
                            ),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}