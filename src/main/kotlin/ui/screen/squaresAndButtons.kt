package ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ui.components.drawWeekSquares

/** Д Л Я    Т Е С Т И Р О В А Н И Я     П О З И Ц И О Н И Р О В А Н И Я*/
@Composable
fun SquaresAndButtonsScreen() {
    Row(Modifier.fillMaxWidth().background(color = Color(0f,0f,0f, 0.75f))) {

        Column(Modifier.weight(5f)){
            drawWeekSquares(35f, 10f, 10f, 20f)
        }

        Divider(Modifier.width(10.dp).fillMaxHeight())

        Column(Modifier.weight(2f)){
            // Кнопка в правом верхнем углу
            Button(
                onClick = { /* обработка клика */ },
                modifier = Modifier
                    .padding(16.dp) // отступ от краев
            ) {
                Text("Кнопка")
            }
        }


    }
}