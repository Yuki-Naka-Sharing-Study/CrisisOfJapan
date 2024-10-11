package com.example.crisis_of_japan

import androidx.fragment.app.Fragment
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home) {
    @Composable
    fun HomeScreen() {
        Column {
            Button(onClick = { findNavController().navigate(R.id.action_homeFragment_to_screen1Fragment) }) {
                Text("Go to Screen 1")
            }
            Button(onClick = { findNavController().navigate(R.id.action_homeFragment_to_screen2Fragment) }) {
                Text("Go to Screen 2")
            }
        }
    }
}