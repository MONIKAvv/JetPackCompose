package vv.monika.jetpacklearn.screens.navigation.navigationWithParameter

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import vv.monika.jetpacklearn.screens.WelcomeScreen

@Composable
fun NavGraphPara() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = RoutesPara.Login
    ){
        composable <RoutesPara.Login>{
            LoginScreen(navController)
        }


        composable <RoutesPara.Welcome>{ backStackEntry ->
            val args = backStackEntry.toRoute<RoutesPara.Welcome>()
            WelcomeScreen(
                userName = args.userName,
                navController = navController
            )
        }
    }

}

//intro 5.cohort,
