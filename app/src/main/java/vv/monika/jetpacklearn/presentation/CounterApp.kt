package vv.monika.jetpacklearn.presentation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.TextToolbarStatus
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun Counter(modifier: Modifier = Modifier) {
//    var count = 0
    var count by remember { mutableStateOf(0) }

    Text(count.toString())  //conversion, text accept string only
    Button(
//        onClick = { count = count + 1 }
        onClick = { count++}
    ) {
        Text("Increment")
    }
    
}

/*
 if = hai kahi then we can access there values through . like count.value

 here by called delegate keyword
 */