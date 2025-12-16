package vv.monika.jetpacklearn.screens.stateManagement

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun StateManagement() {
//    var count = remember {mutableStateOf(0) }
//    var count by remember {mutableStateOf(0) }
//    remember me data loss ho jata when recomposition performed like autorotation
    var count by rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        Text(
            "My Count: $count",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row() {
            Button(
                onClick = { count++ }
            ) {
                Text("Increase")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { count }
            ) {
                Text("Decrease")
            }
        }


    }

}


//stateHosting???, constraint layout in jetpack


//viewModel


