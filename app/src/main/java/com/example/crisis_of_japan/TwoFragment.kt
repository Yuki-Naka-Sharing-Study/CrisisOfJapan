package com.example.crisis_of_japan

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class TwoFragment : androidx.fragment.app.Fragment(R.layout.fragment_two) {
    @Composable
    fun Screen2() {
        Text(text = "This is Fragment 2")
    }
}