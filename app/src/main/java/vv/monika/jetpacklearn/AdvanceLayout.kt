package vv.monika.jetpacklearn

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColExample(modifier: Modifier = Modifier) {

    LazyColumn(){
        items (100){ index ->
            Text("Items $index", Modifier.padding(8.dp))
        }
    }
    
}

@Composable
@Preview(showSystemUi = true)
fun Preview(modifier: Modifier = Modifier){
    LazyColExample()
}