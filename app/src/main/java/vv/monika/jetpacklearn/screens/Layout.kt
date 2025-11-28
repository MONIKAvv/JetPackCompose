package vv.monika.jetpacklearn.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.LayoutScopeMarker
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun Layouts() {

    Row(horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxHeight()) {
        Text("Item 01")
        Text("Item 02")
        Text("Item 03")
        Text("Item 04")
        Text("Item 05")
        Text("Item 06")

    }


}





//clickable, selectable, or bhi h dekh lo bhai
