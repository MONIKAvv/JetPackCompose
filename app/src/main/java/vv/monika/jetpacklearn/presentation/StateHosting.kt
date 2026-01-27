package vv.monika.jetpacklearn.presentation

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Parent(

) {
    var text by remember { mutableStateOf("") }
    Child(text, onTextChange = {text = it})

}

@Composable
fun Child(
    text: String,
    onTextChange: (String) -> Unit,
) {
    TextField(value = text, onValueChange = onTextChange) // esse trigger kahte hai if () nhi h if rahega then call hota hai


}