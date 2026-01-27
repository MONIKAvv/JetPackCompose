package vv.monika.jetpacklearn.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class UserViewModel : ViewModel() {

    private val _name = MutableStateFlow("Monika")
    val name = _name.asStateFlow() //we have to write both to maintain security
//    this variable is clone of above which is immutable and above one is mutable , (_name underscore dala hai taki name same n ho )


    init {
        changeName()
//        hm chah rhe ki kuch chij phle se chale in viewmodel
//        screen banne ke sath ye block run karta hai
    }

    fun changeName(){
        _name.value = "Cohort 5.0"
    }

}