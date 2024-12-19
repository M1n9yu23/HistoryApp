package com.example.historyapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.historyapp.R

@Composable
fun HomeScreen(onNavigateToDecade: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // 배경 이미지
        Image(
            painter = painterResource(id = R.drawable.home_background),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )

        // 배경 위의 투명 오버레이
        /*Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.5f))
        )*/

        // 제목과 버튼 영역
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.padding(top = 150.dp).fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "시간의 발자취",
                    style = MaterialTheme.typography.headlineLarge.copy(
                        color = Color(0xFF4B2E20),
                        shadow = Shadow(Color.Black, offset = Offset(2f, 2f), blurRadius = 6f)
                    )
                )
                Text(
                    text = "과거로의 시간 여행",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        color = Color(0xFF4B2E20),
                        fontWeight = FontWeight.Medium
                    )
                )

            }
            Column(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_explore),
                    contentDescription = "Explore Icon",
                    modifier = Modifier
                        .size(200.dp)
                        .padding(bottom = 16.dp)
                )
            }

            Button(
                onClick = { onNavigateToDecade() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6B4226),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(12.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 64.dp)
            ) {
                Text(
                    text = "탐험 시작",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}