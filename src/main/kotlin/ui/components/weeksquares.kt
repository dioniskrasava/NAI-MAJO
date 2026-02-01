package ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import makeDaysObjects


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