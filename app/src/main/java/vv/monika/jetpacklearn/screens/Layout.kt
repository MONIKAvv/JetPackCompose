package vv.monika.jetpacklearn.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

@Preview(showBackground = true, showSystemUi = true)
fun BoxLayout() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Box(
            modifier = Modifier
//                .size(100.dp)
                .height(150.dp)
                .width(150.dp)
                .background(color = Color.Gray,
                    shape = RoundedCornerShape(10.dp)),
//            contentAlignment = Alignment.Center,
        ) {

                Text("Box Layout",
//                  modifier = Modifier.align { Alignment.Center }
                )
                Text("Box Layout")
                Text("Box Layout")
                Text("Box Layout")


        }

    }


}

@Composable
fun RowLayouts() {


    Row(
        Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceAround,
        Alignment.CenterVertically

    ) {
        Text(" Item 01", fontSize = 30.sp)
        Text(" Item 02", fontSize = 20.sp)
        Text(" Item 03", fontSize = 20.sp)
        Text(" Item 04", fontSize = 20.sp)

    }

}

@Composable
fun ColumnLayout() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
//    verticalArrangement = Arrangement.spacedBy(10.dp)  //-> equally gives space
    ) {
        Text(" Item 01", fontSize = 30.sp)
        Text(" Item 02", fontSize = 25.sp, modifier = Modifier.padding(10.dp))
        Text(" Item 03", fontSize = 20.sp)
        Spacer(modifier = Modifier.height(10.dp))
//    we can give padding or height to the spacer
        Text(" Item 04", fontSize = 15.sp)
        Text(" Item 05", fontSize = 10.sp)
    }


}


//clickable, selectable, or bhi h dekh lo bhai
