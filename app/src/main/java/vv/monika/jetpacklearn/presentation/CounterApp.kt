package vv.monika.jetpacklearn.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.TextToolbarStatus
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
//@Preview(showBackground = true, showSystemUi = true)
fun Counter(
    viewModel: UserViewModel = viewModel()
) {
//    var count = 0
//    var count by remember { mutableStateOf(0) }  //it will get removed since we already done in viewmodel

    val name by viewModel.name.collectAsState()

    Scaffold(

    ) {
        Column(modifier = Modifier.padding(it)) {
//            Text("Count: ${viewModel.name}")
            Text("Name: $name")

            Button(
                onClick = { viewModel.changeName()}
            ) {
                Text("Change Name")
            }
        }
    }
    
}

/*
 if = hai kahi then we can access there values through . like count.value

 here by called delegate keyword
 */