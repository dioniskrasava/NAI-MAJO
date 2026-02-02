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
)