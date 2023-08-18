package com.sample.notescomposeapp.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(onLoginClicked :(String,String)-> Unit) {

        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Box(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.fillMaxSize().padding(start = 20.dp, end = 20.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                OutlinedTextField(
                    value = username,
                    onValueChange = { username = it },
                    label = { Text("Username") },
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                    singleLine = true
                )
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },
                    modifier = Modifier.fillMaxWidth().padding(5.dp),
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation()
                )
                Button(
                    onClick = { onLoginClicked(username, password) },
                    modifier = Modifier.fillMaxWidth().padding(start = 50.dp, top = 20.dp, end = 50.dp)
                ) {
                    Text("Login")
                }
            }

        }

}