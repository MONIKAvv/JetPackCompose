package vv.monika.jetpacklearn.assignments.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginData : ViewModel(){
    var email by mutableStateOf("")
    var passWord by mutableStateOf("")
    var confirmPassword by mutableStateOf("")
    var isChecked by mutableStateOf(false)
}