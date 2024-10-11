package com.example.crisis_of_japan

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun HomeFragment(navController: NavHostController) {
    Column {
        Button(onClick = { navController.navigate("touitsuFragment") }) {
            Text("統一教会")
        }
        Button(onClick = { navController.navigate("touitsuFragment") }) {
            Text("創価学会")
        }
        Button(onClick = { navController.navigate("nihonKaigiFragment") }) {
            Text("日本会議")
        }
        Button(onClick = { navController.navigate("seiwakaiFragment") }) {
            Text("清和政策研究会")
        }
        Button(onClick = { navController.navigate("vaccineFragment") }) {
            Text("ワクチン")
        }
        Button(onClick = { navController.navigate("uraganeFragment") }) {
            Text("裏金議員")
        }
        Button(onClick = { navController.navigate("jiminFragment") }) {
            Text("自民党献金企業")
        }
        Button(onClick = { navController.navigate("lawFragment") }) {
            Text("法の破壊者")
        }
        Button(onClick = { navController.navigate("territoryFragment") }) {
            Text("領土問題")
        }
        Button(onClick = { navController.navigate("baikokuFragment") }) {
            Text("売国法案")
        }
        Button(onClick = { navController.navigate("liarFragment") }) {
            Text("嘘吐き")
        }
        Button(onClick = { navController.navigate("sleepFragment") }) {
            Text("国会睡眠議員")
        }
        Button(onClick = { navController.navigate("otherFragment") }) {
            Text("その他売国奴")
        }
        Button(onClick = { navController.navigate("otherFragment") }) {
            Text("お勧めの情報源")
        }
    }
}