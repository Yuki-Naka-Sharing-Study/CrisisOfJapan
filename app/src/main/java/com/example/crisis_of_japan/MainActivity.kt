package com.example.crisis_of_japan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // 画面遷移のためのNavHostFragmentを設定
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_home) as NavHostFragment
            val navController = navHostFragment.navController
            val appBarConfiguration = AppBarConfiguration(navController.graph)

            // Fragmentのナビゲーションを設定
            NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = (supportFragmentManager.findFragmentById(R.id.fragment_home) as NavHostFragment).navController
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}

