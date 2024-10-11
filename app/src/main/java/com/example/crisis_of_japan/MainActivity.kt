package com.example.crisis_of_japan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }

    @Composable
    fun MainScreen() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "home") {
            composable("home") { HomeFragment(navController) }
            composable("touitsuFragment") { TouitsuFragment() }
            composable("soukaFragment") { SoukaFragment(navController) }
            composable("nihonKaigiFragment") { NihonKaigiFragment(navController) }
            composable("seiwakaiFragment") { SeiwakaiFragment(navController) }
            composable("vaccineFragment") { VaccineFragment(navController) }
            composable("uraganeFragment") { UraganeFragment(navController) }
            composable("jiminFragment") { JiminFragment(navController) }
            composable("lawFragment") { LawFragment(navController) }
            composable("territoryFragment") { TerritoryFragment(navController) }
            composable("baikokuFragment") { BaikokuFragment(navController) }
            composable("liarFragment") { LiarFragment(navController) }
            composable("sleepFragment") { SleepFragment(navController) }
            composable("otherFragment") { OtherFragment(navController) }
            composable("infoFragment") { InfoFragment(navController) }
        }
    }
}
