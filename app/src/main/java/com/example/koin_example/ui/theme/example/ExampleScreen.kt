package com.example.koin_example.ui.theme.example

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.koin_example.core.example.ExampleViewModel
import com.example.koin_example.ui.theme.Koin_exampleTheme
import org.koin.androidx.compose.getViewModel

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val exampleViewModel: ExampleViewModel = getViewModel()
    exampleViewModel.printMsg()
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Koin_exampleTheme {
        Greeting("Android")
    }
}