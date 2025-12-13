package vv.monika.jetpacklearn.screens

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DefaultButton() {

    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Login Here",
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = userName,
            onValueChange = { userName = it },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(
                    "Password",
                    color = Color.Red
                )
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("UserName") }
        )

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                Toast.makeText(context, "Button CLicked!", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp),
//            enabled = false,
            enabled = userName.isNotEmpty() && password.isNotBlank(),
            elevation = ButtonDefaults.buttonElevation(5.dp)
        ) {
            Text(
                "Login",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }


}

@Composable
fun OutLineButton() {

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        OutlinedButton(
            onClick = {
                Toast.makeText(context, "this is outline button", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.Blue,
                containerColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(
                10.dp,
                pressedElevation = 80.dp
            ),

            border = BorderStroke(
                width = 1.dp,
                color = Color.Blue
            )


        ) {
            Text("Outline Button")

        }

//        Button(
//            onClick = {
//                Toast.makeText(context, "this is outline button", Toast.LENGTH_SHORT).show()
//            }
//
//        ) {
//            Text("Default Button")
//
//        }

    }
}


@Composable

fun MyTextButton() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        TextButton(
            onClick = {
                Toast.makeText(context, "Text Button Clicked", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text("Text Button")
        }

        Text(
            "Clickable Text",
            fontSize = 12.sp,
            modifier = Modifier.clickable(
                onClick = { Toast.makeText(context, "TExt Clicked", Toast.LENGTH_SHORT).show() }
            ))


    }

}

@Composable

fun MyIconButton(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        IconButton(
            onClick = {},
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            modifier = Modifier
                .height(60.dp)
                .width(100.dp)
                .background(color = Color.Black, shape = RoundedCornerShape(10.dp))
        ) {
            Icon(
                imageVector = Icons.Default.ShoppingCart,
                contentDescription = "Icon Button",
                modifier = Modifier.size(30.dp)
            )
        }

//        Icon(
//            imageVector = Icons.Default.ShoppingCart,
//            contentDescription = "Icon Button",
//            modifier = Modifier.clickable(onClick = {})
//        )


    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BoxExample(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = Color.Black,
                    shape = RectangleShape
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email"
                )
                Spacer(Modifier.width(10.dp))
                Text("Email")
            }
        }
    }

}