package com.example.crisis_of_japan

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun HomeFragment(navController: NavHostController) {
    Column {
        Button(onClick = { navController.navigate("firstFragment") }) {
            Text("Go to First Fragment")
        }
        Button(onClick = { navController.navigate("secondFragment") }) {
            Text("Go to Second Fragment")
        }
    }
}