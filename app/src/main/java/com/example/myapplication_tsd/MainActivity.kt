package com.example.myapplication_tsd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.AppTheme
import com.example.myapplication_tsd.ui.login_page.LoginViewModel
import com.example.myapplication_tsd.ui.login_page.MainPage
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel // Импортируем функцию для работы с ViewModel в Compose


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {

                val loginViewModel: LoginViewModel = viewModel()

                // Передаем его в MainPage
                MainPage(viewModel = loginViewModel)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}