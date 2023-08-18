package com.sample.notescomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sample.notescomposeapp.Screens.DashboardScreen
import com.sample.notescomposeapp.Screens.LoginScreen
import com.sample.notescomposeapp.Screens.SplashScreen
import com.sample.notescomposeapp.ui.theme.NotesComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotesComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SplashScreen(postSplashScreen = {  navigateToLoginScreen()   })
                }
            }
        }
    }

    private fun navigateToLoginScreen()
    {
        setContent{
            LoginScreen(onLoginClicked = { username,password ->
                if(username == "nikit" && password == "123456")
                {
                    navigateToDashboardScreen()
                }
            })
        }
    }

    private fun navigateToDashboardScreen()
    {
        setContent {
            DashboardScreen()
        }
    }


}

