package vv.monika.jetpacklearn.assignments.assnNavigation

import kotlinx.serialization.Serializable

@Serializable
sealed class navRoutes {

    @Serializable
    object First: navRoutes()

    @Serializable
    object Second: navRoutes()

}