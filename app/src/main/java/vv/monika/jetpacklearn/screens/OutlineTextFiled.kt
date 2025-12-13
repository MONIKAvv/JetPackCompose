package vv.monika.jetpacklearn.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun MyOutLineTextField() {

    var name by remember { mutableStateOf(" ") }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Outlined Textfileds",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            label = {
                Text(
                    "Enter your name",
                    color = Color.Gray
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    tint = Color.Gray
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Done,
                    contentDescription = null,
                    tint = Color.Gray
                )
            },
            singleLine = true,
            //we can enter in single line only else multiple line me enter karega

            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedBorderColor = Color.Red,
                focusedBorderColor = Color.Red,
                cursorColor = Color.Red,
                focusedLabelColor = Color.Red,
                unfocusedLabelColor = Color.Red,
                focusedLeadingIconColor = Color.Red,
                unfocusedLeadingIconColor = Color.Red,
                focusedTrailingIconColor = Color.Red,
                unfocusedTrailingIconColor = Color.Red,
                focusedTextColor = Color.Red,
                unfocusedTextColor = Color.Red
            ),

            )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            label = {
                Text(
                    "Enter your name",
                    color = Color.Gray
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    tint = Color.Gray
                )
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Done,
                    contentDescription = null,
                    tint = Color.Gray
                )
            },
            singleLine = true,
            //we can enter in single line only else multiple line me enter karega

            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedBorderColor = Color.Red,
                focusedBorderColor = Color.Red,
                cursorColor = Color.Red,
                focusedLabelColor = Color.Red,
                unfocusedLabelColor = Color.Red,
                focusedLeadingIconColor = Color.Red,
                unfocusedLeadingIconColor = Color.Red,
                focusedTrailingIconColor = Color.Red,
                unfocusedTrailingIconColor = Color.Red,
                focusedTextColor = Color.Red,
                unfocusedTextColor = Color.Red
            ),

            )

        Text("Thanks",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp)
        
        
    }


}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun MyBasicTextFiled(
) {
    var userName by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        BasicTextField(
            value = userName,
            onValueChange = { userName = it },

        )
    }
    
}