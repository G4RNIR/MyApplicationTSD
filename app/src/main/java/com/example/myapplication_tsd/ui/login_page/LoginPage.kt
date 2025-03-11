package com.example.myapplication_tsd.ui.login_page


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainPage(viewModel: LoginViewModel, modifier: Modifier = Modifier) {
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

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
            value = login,
            onValueChange = { login = it },
            label = { Text("Логин") }, // Метка для TextField
            modifier = Modifier
                .fillMaxWidth() // Растягивает поле на всю ширину
                .padding(start = 16.dp, end = 16.dp) // Отступ между полями


        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Пароль") }, // Метка для TextField
            modifier = Modifier
                .fillMaxWidth() // Растягивает поле на всю ширину
                .padding(start = 16.dp, end = 16.dp) // Отступ между полями


        )

        Button(
            onClick = {
                viewModel.loginUser(login, password) { responseMessage ->
                    message = responseMessage
                }
            }, // Пока пустая обработка нажатия
            modifier = Modifier
                .fillMaxWidth() // Растягивает кнопку на всю ширину
                .padding(start = 16.dp, end = 16.dp, top = 10.dp),
            shape = MaterialTheme.shapes.small
        ) {
            Text(text = "Войти")
        }
                Text(text = message, color = if (message == "Успешный вход") Color.Green else Color.Red)
    }
}

//@Preview(
//    showBackground = true,
//    uiMode = Configuration.UI_MODE_NIGHT_YES // Включает темный режим в превью
//)
//@Composable
//fun LoginPagePreview(){
//    AppTheme(darkTheme = true){
//        MainPage()
//    }
//}