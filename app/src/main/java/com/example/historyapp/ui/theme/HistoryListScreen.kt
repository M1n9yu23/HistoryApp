package com.example.historyapp.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.historyapp.viewmodel.HistoryViewModel

@Composable
fun YearEventsScreen(
    decade: String,
    viewModel: HistoryViewModel = viewModel(),
    onNavigateBack: () -> Unit,
    onNavigateHome: () -> Unit,
    onEventClick: (String?) -> Unit
) {
    LaunchedEffect(decade) {
        viewModel.fetchHistoriesByDecade(decade)
    }

    val histories by viewModel.histories.collectAsState()

    Scaffold(
        topBar = {
            TopBar(
                title = "$decade",
                onNavigateBack = onNavigateBack,
                onNavigateHome = onNavigateHome
            )
        },
        containerColor = Color(0xFFFAF3E3)
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(histories) { history ->
                Card(
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFF5E9DA)),
                    elevation = CardDefaults.cardElevation(4.dp),
                    modifier = Modifier.fillMaxWidth(),
                    onClick = { onEventClick(history.detailDesc) }
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = history.year,
                            style = MaterialTheme.typography.headlineSmall.copy(
                                color = Color(0xFF6B4226),
                                shadow = Shadow(Color.Gray, offset = Offset(1f, 1f), blurRadius = 2f)
                            )
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = history.description,
                            style = MaterialTheme.typography.bodyLarge.copy(
                                color = Color.Black
                            )
                        )
                    }
                }
            }
        }
    }
}