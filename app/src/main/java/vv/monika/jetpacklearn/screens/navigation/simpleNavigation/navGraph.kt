package vv.monika.jetpacklearn.screens.navigation.simpleNavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph(modifier: Modifier = Modifier) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Home
    ) {

        composable < Routes.Home>{
            HomeScreen(navController)
        }

        composable < Routes.Profile>{
            ProfileScreen(navController)
        }


    }

}