package vv.monika.jetpacklearn.screens

import android.speech.tts.TextToSpeechService
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun MyTextFiled(modifier: Modifier = Modifier) {

    var textForTextField by remember() { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = textForTextField,
            onValueChange = { textForTextField = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = TextFieldDefaults.colors(
                unfocusedTextColor = Color.Transparent,
                focusedTextColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Red,
                errorIndicatorColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    "Enter your name",
                    color = Color.Red
                )
            },
            leadingIcon = {
                Text("Done")
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null
                )
            }

//            traling icon
        )

        Spacer(Modifier.height(40.dp))

        TextField(
            value = textForTextField,
            onValueChange = { textForTextField = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = TextFieldDefaults.colors(
                unfocusedTextColor = Color.Transparent,
                focusedTextColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Red,
                errorIndicatorColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    "Enter your email",
                    color = Color.Red
                )
            }
        )
    }

}