import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val windowState = rememberWindowState(width = 800.dp, height = 600.dp)

    Window(
        onCloseRequest = ::exitApplication,
        title = "Три квадрата",
        state = windowState
    ) {
        MaterialTheme {
            AppContent()
        }
    }

    println("Hello!!@!@!@!@!@!@!")
}

@Composable
fun AppContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            // Рисуем три квадрата
            drawRect(
                color = Color.Red,
                topLeft = Offset(50f, 50f),
                size = Size(100f, 100f)
            )

            drawRect(
                color = Color.Green,
                topLeft = Offset(200f, 50f),
                size = Size(100f, 100f)
            )

            drawRect(
                color = Color.Blue,
                topLeft = Offset(350f, 50f),
                size = Size(100f, 100f)
            )
        }
    }
}