package vv.monika.jetpacklearn.assignments

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vv.monika.jetpacklearn.R
import vv.monika.jetpacklearn.ui.theme.DarkGreen
import kotlin.math.min

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LoginScreenEco(modifier: Modifier = Modifier) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    ) {

        Spacer(modifier = Modifier.height(50.dp))
        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier
                .height(150.dp)
                .width(120.dp)
        )

        Text(
            "Create new account",
            fontSize = 25.sp,
            color = DarkGreen,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(30.dp))


        Text(
            "Email Address",
            color = Color.DarkGray,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start,
            fontWeight = FontWeight.Bold
        )
        TextField(
            value = email,
            onValueChange = { email = it },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .drawBehind {
                    val cornerGap = 5.dp.toPx()
                    val strokeWidth = 1.dp.toPx()

                    // Top line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(cornerGap, 0f),
                        end = Offset(size.width - cornerGap, 0f),
                        strokeWidth = strokeWidth
                    )
                    // Bottom line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(cornerGap, size.height),
                        end = Offset(
                            size.width - cornerGap,
                            size.height
                        ),
                        strokeWidth = strokeWidth
                    )
                    // Left line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(0f, cornerGap),
                        end = Offset(0f, size.height - cornerGap),
                        strokeWidth = strokeWidth
                    )
                    // Right line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(size.width, cornerGap),
                        end = Offset(
                            size.width,
                            size.height - cornerGap
                        ),
                        strokeWidth = strokeWidth
                    )
                },
            label = {
                Text(
                    "Enter your email address",
                    color = DarkGreen.copy(alpha = 0.6f)
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = DarkGreen.copy(alpha = 0.1f),
                focusedContainerColor = DarkGreen.copy(alpha = 0.1f),
                unfocusedIndicatorColor = DarkGreen,
                focusedIndicatorColor = DarkGreen,
                focusedLabelColor = DarkGreen,
                unfocusedLabelColor = DarkGreen,
                focusedTextColor = DarkGreen,
                cursorColor = DarkGreen
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            "Password",
            color = Color.DarkGray,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start,
            fontWeight = FontWeight.Bold
        )
        TextField(
            value = email,
            onValueChange = { email = it },
            singleLine = true,
            trailingIcon = {
                IconButton(
                    onClick = { /*TODO*/ },
                    content = {
                        Icon(
                            painter = painterResource(R.drawable.eye_slash_solid_full),
                            "eye-close",
                            modifier = Modifier
                                .height(30.dp)
                                .width(30.dp)
                        )
                    },

                    )
            },
            modifier = Modifier
                .fillMaxWidth()
                .drawBehind {
                    val cornerGap = 5.dp.toPx()
                    val strokeWidth = 1.dp.toPx()

                    // Top line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(cornerGap, 0f),
                        end = Offset(size.width - cornerGap, 0f),
                        strokeWidth = strokeWidth
                    )
                    // Bottom line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(cornerGap, size.height),
                        end = Offset(
                            size.width - cornerGap,
                            size.height
                        ),
                        strokeWidth = strokeWidth
                    )
                    // Left line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(0f, cornerGap),
                        end = Offset(0f, size.height - cornerGap),
                        strokeWidth = strokeWidth
                    )
                    // Right line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(size.width, cornerGap),
                        end = Offset(
                            size.width,
                            size.height - cornerGap
                        ),
                        strokeWidth = strokeWidth
                    )
                },
            label = {
                Text(
                    "Enter your password",
                    color = DarkGreen.copy(alpha = 0.6f)
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = DarkGreen.copy(alpha = 0.1f),
                focusedContainerColor = DarkGreen.copy(alpha = 0.1f),
                unfocusedIndicatorColor = DarkGreen,
                focusedIndicatorColor = DarkGreen,
                focusedLabelColor = DarkGreen,
                unfocusedLabelColor = DarkGreen,
                focusedTextColor = DarkGreen,
                cursorColor = DarkGreen
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            "Confirm Password",
            color = Color.DarkGray,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start,
            fontWeight = FontWeight.Bold
        )
        TextField(
            value = email,
            onValueChange = { email = it },
            singleLine = true,
            trailingIcon = {
                IconButton(
                    onClick = { /*TODO*/ },
                    content = {
                        Icon(
                            painter = painterResource(R.drawable.eye_slash_solid_full),
                            "eye-close",
                            modifier = Modifier
                                .height(30.dp)
                                .width(30.dp)
                        )
                    },

                    )
            },
            modifier = Modifier
                .fillMaxWidth()
                .drawBehind {
                    val cornerGap = 5.dp.toPx()
                    val strokeWidth = 1.dp.toPx()

                    // Top line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(cornerGap, 0f),
                        end = Offset(size.width - cornerGap, 0f),
                        strokeWidth = strokeWidth
                    )
                    // Bottom line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(cornerGap, size.height),
                        end = Offset(
                            size.width - cornerGap,
                            size.height
                        ),
                        strokeWidth = strokeWidth
                    )
                    // Left line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(0f, cornerGap),
                        end = Offset(0f, size.height - cornerGap),
                        strokeWidth = strokeWidth
                    )
                    // Right line
                    drawLine(
                        color = DarkGreen,
                        start = Offset(size.width, cornerGap),
                        end = Offset(
                            size.width,
                            size.height - cornerGap
                        ),
                        strokeWidth = strokeWidth
                    )
                },
            label = {
                Text(
                    "Enter your password",
                    color = DarkGreen.copy(alpha = 0.6f)
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = DarkGreen.copy(alpha = 0.1f),
                focusedContainerColor = DarkGreen.copy(alpha = 0.1f),
                unfocusedIndicatorColor = DarkGreen,
                focusedIndicatorColor = DarkGreen,
                focusedLabelColor = DarkGreen,
                unfocusedLabelColor = DarkGreen,
                focusedTextColor = DarkGreen,
                cursorColor = DarkGreen
            )
        )



        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp),
            colors = ButtonColors(
                containerColor = DarkGreen,
                contentColor = Color.White,
                disabledContainerColor = DarkGreen.copy(alpha = 0.6f),
                disabledContentColor = Color.White.copy(alpha = 0.6f)
            )

        ) {
            Text("Sign Up")
        }

        Text("Other way to sign in", color = Color.Gray)

        Row() {
            IconButton(
                onClick = {}
            ) {
                Image(
                    painter = painterResource(R.drawable.google_icon),
                    contentDescription = "Google"
                )
            }
            IconButton(
                onClick = {}
            ) {
                Image(
                    painter = painterResource(R.drawable.facebook),
                    contentDescription = "Facebook"
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                "Already have an account?",
                color = Color.Gray
            )
            Text(" Back to sign in", color = DarkGreen,
                fontWeight = FontWeight.Bold)

        }
    }
}


class CutCornerShape(private val cut: Dp) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val cutPx = with(density) { cut.toPx() }
        val safeCut = min(cutPx, min(size.width / 2, size.height / 2))

        val path = Path().apply {
            moveTo(safeCut, 0f)
            lineTo(size.width - safeCut, 0f)
            lineTo(size.width, safeCut)
            lineTo(size.width, size.height - safeCut)
            lineTo(size.width - safeCut, size.height)
            lineTo(safeCut, size.height)
            lineTo(0f, size.height - safeCut)
            lineTo(0f, safeCut)
            close()
        }
        return Outline.Generic(path)
    }
}