package vv.monika.jetpacklearn.screens.navigation.simpleNavigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {
    @Serializable
    object Home: Routes()
    @Serializable
    object Profile: Routes()


}