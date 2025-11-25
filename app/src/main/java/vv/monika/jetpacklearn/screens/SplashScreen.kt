package vv.monika.jetpacklearn.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vv.monika.jetpacklearn.R

@Composable
fun SplashScreen(modifier: Modifier = Modifier) {


    Column (
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
      Image(
          painter = painterResource(R.drawable.menu2), null,
          modifier.size(184.dp, 260.dp)
      )

    }
    
}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(modifier: Modifier = Modifier) {
    SplashScreen()
}