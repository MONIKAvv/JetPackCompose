package vv.monika.jetpacklearn.assignments

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.WebStories
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vv.monika.jetpacklearn.R

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun MyProfile(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp)
                .padding(10.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black,
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),

                ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, start = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Card(
                        shape = CircleShape,
                        modifier = Modifier
                            .width(90.dp)
                            .height(90.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.menu5),
                            contentDescription = "profile",
                        )
                    }
                    Column(
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(
                            "Monika kumari",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Text(
                            "Android Engineer",
                            fontSize = 16.sp,
                            color = Color.Gray,
                        )
                    }

                }

                Text(
                    "Android developer with 6+ years experience \nbuilding production apps using Jetpack \nCompose, ML, and Firebase. Passionate about \nUx and performant code.",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(
                        start = 4.dp, top = 20.dp
                    )
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 14.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Phone,
                            contentDescription = "Call",
                            tint = Color.Gray
                        )
                        Text("Call")

                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.MailOutline,
                            contentDescription = "Email",
                            tint = Color.Gray
                        )
                        Text("Email")

                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = "Location",
                            tint = Color.Gray
                        )
                        Text("Location")

                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.WebStories,
                            contentDescription = "Website",
                            tint = Color.Gray
                        )
                        Text("Website")

                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "24", fontSize = 30.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text("Projects")

                    }
//                    verticleDivider/horizontalDivider bhi use kr sakte hai
                    Divider(
                        thickness = 1.dp,
                        color = Color.LightGray,
                        modifier = Modifier
                            .height(40.dp)
                            .width(1.dp)
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "12", fontSize = 30.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text("Clients")

                    }
                    Divider(
                        thickness = 1.dp,
                        color = Color.LightGray,
                        modifier = Modifier
                            .height(40.dp)
                            .width(1.dp)
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "6", fontSize = 30.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text("Years")

                    }
                }

                Spacer(Modifier.height(24.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {

                    Text(
                        "Kotlin",
                        color = Color.DarkGray,
                        modifier = Modifier
                            .background(
                                color = Color(0xFFD6F5C5),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .padding(12.dp, 6.dp)
                    )
                    Text(
                        "Jetpack Compose",
                        color = Color.DarkGray,
                        modifier = Modifier
                            .background(
                                color = Color(0xFFD6F5C5),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .padding(12.dp, 6.dp)
                    )
                    Text(
                        "TFLite",
                        color = Color.DarkGray,
                        modifier = Modifier
                            .background(
                                color = Color(0xFFD6F5C5),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .padding(12.dp, 6.dp)
                    )
                    Text(
                        "Ml Kit",
                        color = Color.DarkGray,
                        modifier = Modifier
                            .background(
                                color = Color(0xFFD6F5C5),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .padding(12.dp, 6.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        "Firebase",
                        color = Color.DarkGray,
                        modifier = Modifier
                            .background(
                                color = Color(0xFFD6F5C5),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .padding(12.dp, 6.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        "Room",
                        color = Color.DarkGray,
                        modifier = Modifier
                            .background(
                                color = Color(0xFFD6F5C5),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .padding(12.dp, 6.dp)
                    )
                }
                Spacer(Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    OutlinedButton(
                        onClick = {},
                        modifier = Modifier
                            .width(150.dp),

                        shape = RoundedCornerShape(10.dp),
                        border = BorderStroke(width = 1.dp, color = Color.LightGray)

                    ) {
                        Text(
                            "Message",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(150.dp),
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonColors(
                            containerColor = Color.Blue,
                            contentColor = Color.White,
                            disabledContainerColor = Color.Blue,
                            disabledContentColor = Color.White
                        )
                    ) {
                        Text(
                            "Follow",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

            }
        }
    }


}