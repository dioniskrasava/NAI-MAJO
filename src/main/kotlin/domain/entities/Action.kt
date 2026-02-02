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
    val id:         Int,
    var name:       String,
    var categoryId: Int,
    var unit:       String,
){

    /* При инициализации объекта активности мы проверяем чтобы name не было пустым, иначе выбрасываем исключение */
    init {
        if (name.isBlank()){
            throw IllegalArgumentException("Action name cannot be blank")
        }
    }
}