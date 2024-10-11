package com.example.crisis_of_japan

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun OtherFragment(navController: NavHostController) {

    Column {
        Text("その他売国奴・国賊")

        Button(onClick = { navController.navigate("home") }) {
            Text("ホーム画面に戻る")
        }
    }
}