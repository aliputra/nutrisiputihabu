package com.example.nutrisiputihabu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nutrisiputihabu.ui.theme.NutrisiputihabuTheme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextFieldColors
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.painterResource



class ExitActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NutrisiputihabuTheme {
                MainScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    NutrisiputihabuTheme {
        MainScreen()
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        
        Button(
            onClick = { /* Aksi untuk tombol Latihan */ },
            modifier = Modifier .fillMaxWidth().padding(top = 16.dp, start = 40.dp, end = 40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow,
                contentColor = Color.Black
            )
        ) {
            Text(text = "Yakin nih?",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace
                )
                )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = { /* Aksi untuk tombol Tanding */ },
            modifier = Modifier .fillMaxWidth().padding(top = 16.dp, start = 40.dp, end = 40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow,
                contentColor = Color.Black
            )
        ) {
            Text(text = "Cek lagi deh",
                style = TextStyle(
                    fontWeight = FontWeight.Bold ,
                    fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace
                )
                )
                   }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NutrisiputihabuTheme {
        MainScreen()
    }
}