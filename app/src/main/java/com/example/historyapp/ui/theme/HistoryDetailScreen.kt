package com.example.historyapp.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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

@Composable
fun HistoryDetailScreen(
    detailDesc: String,
    onNavigateBack: () -> Unit,
    onNavigateHome: () -> Unit
) {
    Scaffold(
        topBar = {
            TopBar(
                title = "사건 상세 정보",
                onNavigateBack = onNavigateBack,
                onNavigateHome = onNavigateHome
            )
        },
        containerColor = Color(0xFFFAF3E3)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "사건 상세 설명",
                style = MaterialTheme.typography.headlineSmall.copy(
                    color = Color(0xFF4B2E20),
                    shadow = Shadow(Color.Gray, offset = Offset(2f, 2f), blurRadius = 3f)
                ),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF5E9DA)),
                elevation = CardDefaults.cardElevation(8.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = detailDesc,
                    style = MaterialTheme.typography.bodyLarge.copy(color = Color.Black),
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Start
                )
            }
        }
    }
}
