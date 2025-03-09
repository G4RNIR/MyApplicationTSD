package com.example.myapplication_tsd.ui.login_page

import android.content.res.Configuration
import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.AppTheme
import com.example.compose.backgroundDark

@Composable
fun MainPage(modifier: Modifier = Modifier) {
    Text(
        text = "Вход",
        fontSize = 30.sp,
        modifier = modifier.padding(16.dp)
    )
    Column(
        modifier = Modifier
//            .background(color = backgroundDark)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Логин") }, // Метка для TextField
            modifier = Modifier
                .fillMaxWidth() // Растягивает поле на всю ширину
                .padding(start = 16.dp, end = 16.dp) // Отступ между полями


        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Пароль") }, // Метка для TextField
            modifier = Modifier
                .fillMaxWidth() // Растягивает поле на всю ширину
                .padding(start = 16.dp, end = 16.dp) // Отступ между полями


        )

        Button(
            onClick = {}, // Пока пустая обработка нажатия
            modifier = Modifier
                .fillMaxWidth() // Растягивает кнопку на всю ширину
                .padding(start = 16.dp, end = 16.dp, top = 10.dp),
            shape = MaterialTheme.shapes.small
        ) {
            Text(text = "Войти")
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES // Включает темный режим в превью
)
@Composable
fun LoginPagePreview(){
    AppTheme(darkTheme = true){
        MainPage()
    }
}