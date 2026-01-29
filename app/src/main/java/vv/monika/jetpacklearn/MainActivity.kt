package vv.monika.jetpacklearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import vv.monika.jetpacklearn.advanceJetpack.CounterApp
import vv.monika.jetpacklearn.presentation.CounterViewModel
import vv.monika.jetpacklearn.ui.theme.JetpackLearnTheme

class MainActivity : ComponentActivity() {

    private val viewModel: CounterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackLearnTheme {

//                NavGraph()

//                MyAlterDialog()

//                CounterApp(viewModel)
                CounterApp()

            }
        }
    }
}