package vv.monika.jetpacklearn.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vv.monika.jetpacklearn.R

@Composable
fun MyCard(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(
//            modifier = Modifier
//                .height(40.dp)
//                .width(200.dp),
            shape = RoundedCornerShape(10.dp),
//            colors = CardDefaults.cardColors(
//                continerColor = Color.LightGray,
//                contentColor = Color.Black
//            ),
            elevation = CardDefaults.cardElevation(
                16.dp
            ),
            border = BorderStroke(
                2.dp,
                Color.Black
            )
        )
        {
            Text(
                "Simple Card",
                modifier = Modifier.padding(16.dp)
            )
        }


    }


}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun CardExample(modifier: Modifier = Modifier) {

    var quantity by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray),
        contentAlignment = Alignment.Center
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(
                16.dp
            )
//            we can also use shadow to change elevation color

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.LightGray.copy(alpha = 0.5f)
                    ),
                    shape = RoundedCornerShape(10.dp),
//                    modifier = Modifier.height(170.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.menu5),
                        "Image"
                    )
                }
                Spacer(Modifier.width(16.dp))
                Column() {
                    Text(
                        "A Man Wearing a orange pasta with tamoto souce T-Shirt",
                        fontWeight = FontWeight.SemiBold,
                        lineHeight = 24.sp

                    )
                    Spacer(Modifier.height(10.dp))
                    Text(
                        "$ 99.99 USD",
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray
                    )
                    Spacer(Modifier.height(8.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth().padding(bottom = 4.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,

                        ) {
                            IconButton(
                                onClick = { quantity-- },
                                modifier = Modifier
                                    .border(
                                        width = 2.dp,
                                        color = Color.Gray,
                                        shape = CircleShape
                                    )
                                    .size(30.dp),
                                enabled = quantity > 1
                            ) {
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowDown,
                                    "Decrease"
                                )

                            }
                            Text(
                                quantity.toString(),
                                Modifier.padding(horizontal = 6.dp)
                            )

                            IconButton(
                                onClick = { quantity++ },
                                modifier = Modifier
                                    .border(
                                        width = 2.dp,
                                        color = Color.Gray,
                                        shape = CircleShape
                                    )
                                    .size(30.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowUp,
                                    "Decrease"
                                )

                            }
                        }


                        Row(
                            modifier = Modifier.padding(end = 6.dp)
                        ) {
                            IconButton(
                                onClick = {},
                                modifier = Modifier

                                    .border(
                                        width = 2.dp,
                                        color = Color.Gray,
                                        shape = CircleShape
                                    )
                                    .size(30.dp),
                                enabled = false,

                                ) {
                                Icon(
                                    imageVector = Icons.Default.Delete,
                                    "Decrease"

                                )

                            }
                        }

                    }
                }

            }

        }

    }

}
