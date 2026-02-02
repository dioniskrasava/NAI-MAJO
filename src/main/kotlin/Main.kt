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
        title = "Три квадрата",
        state = windowState
    ) {
        MaterialTheme {
            SquaresAndButtonsScreen()
        }
    }
}



// создаем объект недели для тестирования
fun makeDaysObjects() : Array<Day>{

    // ПЕРЕПИШИ ОБЪЕКТЫ В ТАКОМ ФОРМАТЕ. ЦВЕТ БУДЕТ СЧИТАТЬСЯ АВТОМАТИЧЕСКИ
    val day1 = createDay(1,  DateValue(2026,1, 29), -1)
    val day2 = createDay(1,  DateValue(2026,1, 29), 0)
    val day3 = createDay(1,  DateValue(2026,1, 29), 10)
    val day4 = createDay(1,  DateValue(2026,1, 29), 20)
    val day5 = createDay(1,  DateValue(2026,1, 29), 30)
    val day6 = createDay(1,  DateValue(2026,1, 29), 40)
    val day7 = createDay(1,  DateValue(2026,1, 29), 50)

    return arrayOf(day1, day2, day3, day4, day5, day6, day7)
}

