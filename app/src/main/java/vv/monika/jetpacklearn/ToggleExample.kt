package vv.monika.jetpacklearn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ToggleExample(modifier: Modifier = Modifier) {
    var isChecked by remember { mutableStateOf(false) }
    Row (Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
        Checkbox(checked = isChecked, // this reads
            onCheckedChange = {isChecked = it} // writes
        )

        Text(if (isChecked) "Checked" else "unChecked")
    }

    
}
@Composable
@Preview(showSystemUi = true)
fun Toggle(modifier: Modifier = Modifier) {
    ToggleExample()
    
}