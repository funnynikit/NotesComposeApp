package com.sample.notescomposeapp.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(postSplashScreen: ()->Unit) {

        LaunchedEffect(key1 = true)
        {
            delay(3000)
            postSplashScreen()
        }

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
}