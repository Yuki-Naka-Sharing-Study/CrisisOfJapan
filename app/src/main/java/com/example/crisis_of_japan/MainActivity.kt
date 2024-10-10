package com.example.crisis_of_japan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController, startDestination = "home") {
                composable("home") { HomeScreen(navController) }
                composable("oneFragment") { OneFragment() }
                composable("twoFragment") { TwoFragment() }
            }
        }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        Button(onClick = { navController.navigate("oneFragment") }) {
            Text("Screen 1")
        }
        Button(onClick = { navController.navigate("twoFragment") }) {
            Text("Screen 2")
        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen(navController = rememberNavController())
}
