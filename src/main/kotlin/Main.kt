import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import domain.entities.Action
import domain.entities.CategoryAction
import ui.screen.SquaresAndButtonsScreen


fun main() = application {
    val windowState = rememberWindowState(width = 800.dp, height = 600.dp)

    Window(
        onCloseRequest = ::exitApplication,
        title = "NAI-MAJO",
        state = windowState
    ) {
        MaterialTheme {
            SquaresAndButtonsScreen() // тестовый экран с квадратиками и кнопкой
        }
    }
}


