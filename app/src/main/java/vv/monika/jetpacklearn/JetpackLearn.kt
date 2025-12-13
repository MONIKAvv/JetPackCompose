package vv.monika.jetpacklearn

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// new file for jetpack compose
//function name should be small at first position
//but composiable function should start with capital letter

@Composable  // ui show
fun Greeting(name: String , age: Int, color: Color) {

    Text("$name $age ${color.toString()}")

}