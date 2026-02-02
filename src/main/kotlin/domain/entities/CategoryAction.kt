package domain.entities

import java.util.Collections.emptyList

/**
 * Категория активности
 *
 * описывает категорию активности (спорт, образование, духовность)
 *
 * @param name название активности
 * */
data class CategoryAction(
    val id:   Int,
    var name: String,
    //var iconResId: String?, // название ресурса иконки (для UI)
    val actionList: List<Action> = emptyList() // активности данной категории
)