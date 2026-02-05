package domain.entities

/**
 * Запись произошедшего события
 *
 *
 * */
data class RecordAction(
    val id:             Int,
    val actionId:       Int,
    var action:         Action,
    val value:         Double,
    var categoryAction: CategoryAction
){
    // ТУТ МОГУТ СОДЕРЖАТЬСЯ БИЗНЕС-ПРАВИЛА (КАКИЕ-ТО МЕЛКИЕ ДЕЙСТВИЯ,
// хотя как я понимаю они могут быть и в usecases - но вроде бы туда определяют уже более сложные
// бизнес процессы)
}