package com.adso.appvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.adso.appvm.screens.CreditCardScreen
import com.adso.appvm.ui.theme.AppVMTheme
import com.adso.appvm.viewmodel.CreditCardViewModel

class MainActivity : ComponentActivity() {
    private val viewModel: CreditCardViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppVMTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CreditCardScreen(viewModel)
                }
            }

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppVMTheme {
        Greeting("Android")
    }
}

