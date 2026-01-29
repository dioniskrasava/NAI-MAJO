import androidx.compose.ui.graphics.Color
import java.time.Month



/**
 * Класс который содержит информацию о дне
 * */
data class Day(
    val id: Int,
    val date: DateValue,
    val points: Int, // количество очков за день
    val color: Color// цвет дня
)


/** Функция создания объекта дня (с вычислением цвета)
 *
 * Суть функции в вычислении цвета дня по очкам. Функция подстраивается под наш личный рекорд. Если человек набирает
 * малое количество баллов, то ему достаточно небольшого количества усилий, для того чтобы его день отражался в ярко
 * зеленом цвете. Но если человек наращивает планку, то для предыдущие  рекорды
 *
 *
 *
 * @param maxPointRecord Принимает рекорд по очкам в течение дня*/
fun createDay(id: Int, date: DateValue, points: Int, maxPointRecord: Int = 20): Day{

    val max = maxPointRecord

    val color = when {
        points < 0 -> Color.Red
        points in 0..(max * 0.1).toInt() -> Color(0f,1f,0f,0.1f)
        points in (max * 0.11).toInt()..(max * 0.2).toInt() -> Color(0f,1f,0f,0.2f)
        points in (max * 0.21).toInt()..(max * 0.3).toInt() -> Color(0f,1f,0f,0.3f)
        points in (max * 0.31).toInt()..(max * 0.4).toInt() -> Color(0f,1f,0f,0.4f)
        points in (max * 0.41).toInt()..(max * 0.5).toInt() -> Color(0f,1f,0f,0.5f)
        points in (max * 0.51).toInt()..(max * 0.6).toInt() -> Color(0f,1f,0f,0.6f)
        points in (max * 0.61).toInt()..(max * 0.7).toInt() -> Color(0f,1f,0f,0.7f)
        points in (max * 0.71).toInt()..(max * 0.8).toInt() -> Color(0f,1f,0f,0.8f)
        points in (max * 0.81).toInt()..(max * 0.9).toInt() -> Color(0f,1f,0f,0.9f)
        else -> Color(0f,1f,0f,1f)
    }

    return Day(id, date, points, color)
}


/** Класс объекта даты */
data class DateValue(
    val year: Int,
    val month: Int,
    val day: Int
){
    var a = 0
    init {
        println("Вау! Я создал - $a")
        a++
    }
}