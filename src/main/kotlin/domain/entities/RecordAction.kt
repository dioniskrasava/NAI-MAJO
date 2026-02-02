package domain.entities

data class RecordAction(
    val id:             Int,
    var name:           String,
    var action:         Action,
    var categoryAction: CategoryAction
)