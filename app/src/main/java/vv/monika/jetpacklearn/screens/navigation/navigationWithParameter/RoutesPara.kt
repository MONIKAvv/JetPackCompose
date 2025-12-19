package vv.monika.jetpacklearn.screens.navigation.navigationWithParameter

import kotlinx.serialization.Serializable

@Serializable
sealed class RoutesPara {
    @Serializable
    object Login: RoutesPara()

    @Serializable
    data class Welcome(val userName: String): RoutesPara()
}