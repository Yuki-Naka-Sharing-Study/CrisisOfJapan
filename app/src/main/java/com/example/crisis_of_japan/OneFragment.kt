package com.example.crisis_of_japan

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class OneFragment : androidx.fragment.app.Fragment(R.layout.fragment_one) {
    @Composable
    fun Screen1() {
        Text(text = "This is Fragment 1")
    }
}