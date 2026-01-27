package vv.monika.jetpacklearn.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {


    var count by mutableStateOf(0)

    fun increment(){
        count++
    }
//    when screen open -> onCreate
}