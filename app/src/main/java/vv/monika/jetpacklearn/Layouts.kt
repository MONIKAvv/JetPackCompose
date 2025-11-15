package vv.monika.jetpacklearn

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun ColumnExample(modifier: Modifier = Modifier){
//    Column(Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center) {
//        Text("Hello Do", Modifier.padding(30.dp),
//            Color.Green,
//            fontSize = 30.sp)
//        Text("Hello Dost")
//
//        Button(onClick = {}) {
//            Text("Do Something")
//        }
//    }

    Box(Modifier.background(Color.Gray).fillMaxSize()){
        Image(painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = null, Modifier.width(200.dp).height(200.dp)
                .align(Alignment.Center))

        Text("Overlay Text" ,Modifier.align(Alignment.Center), Color.Red)

    }


}

@Composable
@Preview(showSystemUi = true)
fun ColumnLayoutPreview(modifier: Modifier = Modifier){
ColumnExample()

}