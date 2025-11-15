package vv.monika.jetpacklearn

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun GoodTextFiled(text: String, onTextChange: (String)-> Unit) {
    TextField(
        value = text,
        onValueChange = onTextChange,
        label = {Text("Enter Text")}
    )

}


@Composable
fun ParentComposable(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }

    GoodTextFiled(text) {
        text = it
    }


}

