package com.lordinatec.scopefunctionusage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.lordinatec.scopefunctionusage.ui.theme.ScopeFunctionUsageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScopeFunctionUsageTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    letNullCheck("Hello, World!")
                    letNullCheck(null)
                    letInitializeObject()
                    applyInitializeObject()
                    alsoInitializeObject()
                    withInitializeObject()
                    runInitializeObject()
                }
            }
        }
    }
}
