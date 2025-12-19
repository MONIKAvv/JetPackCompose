package vv.monika.jetpacklearn.assignments.assnNavigation

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
        startDestination = navRoutes.First
    ) {

        composable <navRoutes.First>{ FirstScreen(navController) }

        composable<navRoutes.Second> { SecondScreen(navController)  }

    }

}


