package vv.monika.jetpacklearn.screens.navigation.navigationWithParameter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
//@Preview(showBackground = true, showSystemUi = true)
fun LoginScreen(navController: NavHostController) {

    var userName by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text("Login Here",
//            style = MaterialTheme.typography.titleLarge
        )



        OutlinedTextField(
            value = userName,
            onValueChange = {userName = it},
            label = {Text("Enter your name")},
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {navController.navigate(RoutesPara.Welcome(userName))},
            modifier = Modifier.fillMaxSize(),
            enabled = userName.isNotEmpty(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White,
                disabledContentColor = Color.LightGray,
                disabledContainerColor = Color.LightGray
            )
        ) {
            Text("Login")
        }

    }

}