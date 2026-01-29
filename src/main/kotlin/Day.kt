import androidx.compose.ui.graphics.Color
import java.time.Month



/**
 *
 * Класс который содержит информацию о дне
 *
 * Должен содержать информацию о дате
 *
 * */
data class Day(
    val id: Int,
    val date: DateValue,
    val points: Int, // количество очков за день
    val color: Color// цвет дня
)


fun createDay(id: Int, date: DateValue, points: Int): Day{
    val color = when {
        points < 0 -> Color.Red
        points in 0..10 -> Color.Yellow
        points in 11..30 -> Color.Green
        else -> Color.Blue
    }

    return Day(id, date, points, color)
}


/** Класс объекта даты */
data class DateValue(
    val year: Int,
    val month: Int,
    val day: Int
)