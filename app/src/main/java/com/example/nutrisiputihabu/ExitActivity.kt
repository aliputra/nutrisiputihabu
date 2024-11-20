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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp


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

    val myFontFamily = FontFamily(
        Font(R.font.arial_rounded_mt_bold, FontWeight.Normal),
        Font(R.font.arial_rounded_mt_bold, FontWeight.Bold)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            ,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(R.drawable.dialogbox),
            contentDescription = "",
            contentScale = ContentScale.FillWidth
        )

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
        Image(

            modifier = Modifier
                .fillMaxHeight()
                .scale(3f)
                .align(Alignment.BottomCenter),
            painter = painterResource(R.drawable.exitbackground),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            alignment = Alignment.Center
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Spacer(modifier = Modifier.height(20.dp))


            Button(
                onClick = { /* Aksi untuk tombol Latihan */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 40.dp, end = 40.dp)
                    ,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "Yakin nih?",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                    fontFamily = myFontFamily,
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { /* Aksi untuk tombol Tanding */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp, start = 40.dp, end = 40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "Cek lagi deh",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontFamily = androidx.compose.ui.text.font.FontFamily.Monospace
                    )
                )
            }

            Spacer(modifier = Modifier.height(100.dp))
        }
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