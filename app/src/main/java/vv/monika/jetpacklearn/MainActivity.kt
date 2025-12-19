package vv.monika.jetpacklearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHost
import vv.monika.jetpacklearn.assignments.assnNavigation.FirstScreen
import vv.monika.jetpacklearn.assignments.assnNavigation.NavGraph
import vv.monika.jetpacklearn.screens.MyAlterDialog
import vv.monika.jetpacklearn.ui.theme.JetpackLearnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackLearnTheme {

//                NavGraph()

                MyAlterDialog()


            }
        }
    }
}