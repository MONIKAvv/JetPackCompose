package vv.monika.jetpacklearn.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import vv.monika.jetpacklearn.R
import kotlin.math.ceil

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun DisplayImages(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
//        Icon()

        Spacer(modifier = Modifier.height(60.dp))



        Text(
            "Forget Password",
            modifier = Modifier.fillMaxSize(),
            textAlign = TextAlign.Center,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Image(
            painter = painterResource(R.drawable.menu5),
            null,
            modifier = Modifier
                .size(200.dp)
                .background(Color.Red)

        )

        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.menu5),
                null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(200.dp)
                    .background(Color.Red)

            )
            Spacer(modifier = Modifier.width(6.dp))
            Image(
                painter = painterResource(R.drawable.menu5),
                null,
                modifier = Modifier
                    .size(200.dp)
                    .background(Color.Red)

            )

        }

    }

}