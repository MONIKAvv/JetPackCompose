package vv.monika.jetpacklearn

import android.graphics.Color
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable

fun CounterScreen(){

    var count by remember { mutableStateOf(0) }

    Column {
        Text("$count", Modifier.padding(16.dp), colorResource(R.color.purple_500))



        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            count++
        }) {
            Text("Increment")

        }
    }


}

//by getter and setter import karta hai, as the vlaues keeps changing thats called state
//modifier is a parameter which is used to modify
//colum -> verticle
//row -> horizontal
//box ->