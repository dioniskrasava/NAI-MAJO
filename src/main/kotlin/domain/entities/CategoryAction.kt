package domain.entities

/**
 * Категория активности
 *
 * описывает категорию активности (спорт, образование, духовность)
 *
 * @param name название активности
 * */
data class CategoryAction(
    val id:   Long,
    var name: String
)