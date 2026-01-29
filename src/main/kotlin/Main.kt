import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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


}

@Composable
fun AppContent() {
    Box(modifier = Modifier.fillMaxSize()) {
        drawWeekSquares(55f, 10f)

    }
}


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
    val day0 = createDay(1,  DateValue(2026,1, 29), 5)

    val day1 = Day(1, DateValue(2026,1, 29), 5, Color(0f,0.5f,0f, 0.1f))
    val day2 = Day(1, DateValue(2026,1, 29), 5, Color(0f,0.5f,0f, 0.2f))
    val day3 = Day(1, DateValue(2026,1, 29), 5, Color(0f,0.5f,0f, 0.3f))
    val day4 = Day(1, DateValue(2026,1, 29), 5, Color(0f,0.5f,0f, 0.4f))
    val day5 = Day(1, DateValue(2026,1, 29), 5, Color(0f,0.5f,0f, 0.5f))
    val day6 = Day(1, DateValue(2026,1, 29), 5, Color(0f,0.5f,0f, 0.6f))
    val day7 = Day(1, DateValue(2026,1, 29), 5, Color(0f,0.5f,0f, 0.7f))

    return arrayOf(day1, day2, day3, day4, day5, day6, day7)
}