package com.heet.todoappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.heet.todoappui.ui.theme.BackgroundColor
import com.heet.todoappui.ui.theme.CardColor
import com.heet.todoappui.ui.theme.TODOAppUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(BackgroundColor.hashCode()),
            navigationBarStyle = SystemBarStyle.dark(CardColor.hashCode())
        )

        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}