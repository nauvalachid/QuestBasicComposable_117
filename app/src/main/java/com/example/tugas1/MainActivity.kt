package com.example.tugas1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.tugas1.ui.theme.Tugas1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tugas1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        BasicLayout (Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun BasicLayout(modifier: Modifier = Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "LOGIN",
            style = TextStyle(fontSize = 30.sp,
                fontWeight = FontWeight.Bold))
        Text(text = "Ini Adalah Halaman Login")
        Image(painter = painterResource(
            id = R.drawable.mu
        ),
            contentDescription = ""
        )
        Text(text = "Nama")
        Text(text = "Nauval Achid Rosady",
            style = TextStyle(fontSize = 13.sp,
                color = Color.Red, fontWeight = FontWeight.Bold))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas1Theme {
        BasicLayout()
    }
}