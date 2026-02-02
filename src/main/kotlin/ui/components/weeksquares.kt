package ui.components

import DateValue
import Day
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import createDay

/** Рисует вертикальный ряд из 7 квадратов, представляющих неделю.
 *
 *  Квадраты рисуются сверху вниз, начиная с заданной стартовой позиции.
 *  Каждый последующий квадрат смещается на сумму его высоты [sizeRect] и расстояния [space].
 *
 *  @param sizeRect Размер стороны одного квадрата в пикселях.
 *  @param space Расстояние по вертикали между квадратами в пикселях.
 *  @param startX Координата начальной точки по оси x
 *  @param startY Координата начальной точки по оси y
 */
@Composable
fun drawWeekSquares(
    sizeRect: Float,
    space: Float,
    startX : Float = 5f,
    startY : Float = 5f
){
    Canvas(modifier = Modifier.fillMaxSize()) {

        var posX = startX
        var posY = startY


        val week = makeDaysObjects() // создаем объект недели

        // пробегаемся по массиву дней и рисуем квадратики
        for (i in week){
            drawRect(
                color = i.color,
                topLeft = Offset(posX, posY),
                size = Size(sizeRect, sizeRect)
            )

            posY += space + sizeRect
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