package com.dreamhomes.dreamhomes.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dreamhomes.dreamhomes.presentation.ui.HomeScreen
import com.dreamhomes.dreamhomes.presentation.ui.InquiryDetailsScreen

@Composable
fun HomeNavGraph() {

    val navController = rememberNavController() // This is a NavHostController
    val context = LocalContext.current

    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen() }
        composable("details/{id}") { backStackEntry ->
            val id = backStackEntry.arguments?.getString("id")?.toInt()
            if (id != null) InquiryDetailsScreen(id)
        }
    }
}

