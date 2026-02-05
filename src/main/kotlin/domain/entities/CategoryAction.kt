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
){
    // ТУТ МОГУТ СОДЕРЖАТЬСЯ БИЗНЕС-ПРАВИЛА (КАКИЕ-ТО МЕЛКИЕ ДЕЙСТВИЯ,
// хотя как я понимаю они могут быть и в usecases - но вроде бы туда определяют уже более сложные
// бизнес процессы)
}