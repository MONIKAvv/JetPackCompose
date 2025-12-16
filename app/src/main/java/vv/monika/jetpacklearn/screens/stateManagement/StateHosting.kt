package vv.monika.jetpacklearn.screens.stateManagement

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RecomposeUI() {

    var count by rememberSaveable { mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        TextThatRecompose(
            count,
            { count++ },
            { count-- })
        Spacer(modifier = Modifier.height(16.dp))
        CardThatRecompose(
            count,
            { count++ },
            { count-- }
        )
    }

}

@Composable
fun TextThatRecompose(
    count: Int, increment: () -> Unit,
    decrement: () -> Unit
) {

    Text(
        "$count",
        fontSize = 24.sp
    )

    Spacer(modifier = Modifier.height(20.dp))

    Row() {
        Button(
            onClick = { increment() }
        ) {
            Text("Increase")
        }
        Spacer(modifier = Modifier.width(16.dp))
        Button(
            onClick = { decrement() }
        ) {
            Text("Decrease")
        }
    }

}

@Composable
fun CardThatRecompose(
    count: Int,
    increment: () -> Unit,
    decrement: () -> Unit
) {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            "Count: $count",
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row() {
            Button(
                onClick = { increment() }
            ) {
                Text("Increase")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(
                onClick = { decrement() }
            ) {
                Text("Decrease")
            }
        }
    }

}
