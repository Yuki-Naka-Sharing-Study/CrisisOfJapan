package com.example.crisis_of_japan

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun SecondFragment(navController: NavHostController) {

    Column {
        Text("This is Second Fragment")

        Button(onClick = { navController.navigate("home") }) {
            Text("Go to Home Fragment")
        }
    }
}
