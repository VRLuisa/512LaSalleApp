package com.example.a512lasalleapp.ui.screens

import androidx.compose.material.icons.Icons
import com.example.a512lasalleapp.ui.utils.Logout
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.ui.theme._512LaSalleAppTheme

@Composable
fun ChangePwdScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(MaterialTheme.colorScheme.background)
    ) {
        // Header con imagen de fondo
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp))
                .height(270.dp)
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "Background Image",
                modifier = Modifier
                    .fillMaxSize()
                    .offset(y = 70.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Cambio de Contraseña",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    imageVector = Logout,
                    contentDescription = "Logout",
                    modifier = Modifier
                        .size(45.dp)
                        .clickable {
                            Log.i("HomeScreen", "Cerrando sesión")
                        },
                    tint = Color.White
                )
            }
        }
        // Body
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text("Cambiar Contraseña:", style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ChangePwdScreenPreview() {
    _512LaSalleAppTheme {
        ChangePwdScreen(innerPadding = PaddingValues(0.dp))
    }
}
