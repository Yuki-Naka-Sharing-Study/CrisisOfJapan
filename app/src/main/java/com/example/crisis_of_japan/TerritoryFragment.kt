package com.example.crisis_of_japan

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun TerritoryFragment(navController: NavHostController) {

    Column {
        Text("領土問題")

        Button(onClick = { navController.navigate("home") }) {
            Text("ホーム画面に戻る")
        }
    }
}