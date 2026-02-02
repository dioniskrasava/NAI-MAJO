package domain.entities

/**
 * Вид активности
 *
 * описывает виды активности пользователя (например бег, ходьба)
 *
 * @param unit единицы измерения (метр, повторы, минуты)
 *
 * */
data class Action(
    val id:       Long,
    var name:     String,
    var category: CategoryAction,
    var unit:     String,
)