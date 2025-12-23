package vv.monika.jetpacklearn.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyConstraintsLayout() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
//        define references
        val (box1, box2, text) = createRefs()
//        guideLine
        val guideLine1 = createGuidelineFromStart(0.5f)


        Box(
            modifier = Modifier
                .size(200.dp)
                .background(color = Color.Gray)
                .constrainAs(ref = box1){
                    top.linkTo(parent.top, margin = 100.dp)
                    start.linkTo(parent.start, margin = 30.dp)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(color = Color.Red)
                .constrainAs(ref = box2){
                    top.linkTo(box1.bottom, margin = 8.dp)
                    start.linkTo(box1.start)
                    end.linkTo(box1.end)
                }
        )

        Text("Monika is here",
            fontSize = 40.sp,
            modifier = Modifier
                .constrainAs(ref = text){
                    bottom.linkTo(parent.bottom, )
                }

        )
    }

}