package vv.monika.jetpacklearn.assignments


import android.R
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LogInScreen() {

    var userName: String by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        ) {
        Spacer(modifier = Modifier.height(30.dp))

        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back Icon",
            modifier = Modifier
                .size(40.dp)
                .background(Color.LightGray.copy(alpha = 0.2f),
                    shape = CircleShape)
                .padding(4.dp),
            tint = Color.Black
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "Welcome",
            fontSize = 35.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text(
            "Please enter your data to continue",
            fontSize = 16.sp,
            color = Color.Gray,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(100.dp))

        TextField(
            value = userName,
            onValueChange = { userName = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "User Name") },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Gray,
                focusedIndicatorColor = Color.LightGray,
                focusedLabelColor = Color.LightGray,
                unfocusedLabelColor = Color.LightGray,
                focusedTextColor = Color.Black,
                cursorColor = Color.Gray
            ),

            )

        Spacer(modifier = Modifier.height(4.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Password") },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Transparent,
                focusedContainerColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Gray,
                focusedIndicatorColor = Color.LightGray,
                focusedLabelColor = Color.LightGray,
                unfocusedLabelColor = Color.LightGray,
                focusedTextColor = Color.Black,
                cursorColor = Color.Gray
            ),

            )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            "Forgot Password?",
            color = Color.Red,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.End
        )
        Spacer(modifier = Modifier.height(40.dp))

//            Text(
//                "By connecting your account confirm that you agree \n with our Term and Condition",
//                textAlign = TextAlign.Center,
//                fontSize = 12.sp,
//                color = Color.Gray,
//                modifier = Modifier.fillMaxWidth()
//                    .clickable( interactionSource = "Terms and Conditions",
//                        fontColor = Color.black,
//                        indication = null,
//                        onClick = {})
//
//
//            )

        val annotedString = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color.Gray,
                    fontSize = 12.sp
                )
            ) {
                append("By connecting your account confirm that you agree \n with our ")
            }
            pushStringAnnotation("TERMS", "terms")
            withStyle(
                style = SpanStyle(
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("Term and Condition")
            }
            pop()
        }

        ClickableText(
            text = annotedString,
            onClick = { offset ->
                annotedString.getStringAnnotations("TERMS", start = offset, end = offset)
                    .firstOrNull()?.let {
                        Toast.makeText(context, "Clicked on ${it.item}", Toast.LENGTH_SHORT).show()
                    }
            },
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle(textAlign = TextAlign.Center)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text("Login")
        }


    }

}