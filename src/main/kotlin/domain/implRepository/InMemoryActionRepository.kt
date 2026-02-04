package domain.implRepository

import domain.entities.Action
import domain.repository.ActionRepository

class InMemoryActionRepository : ActionRepository{

    private val actions = mutableListOf<Action>()

    override fun saveAction(action: Action) {
        actions.add(action)
    }

    override fun getActionById(id: Int): Action? {
        return actions.find { it.id == id }
    }

    override fun getActionsByCategory(category: String): List<Action> {
        TODO("Not yet implemented")
    }

    override fun getAllActions(): List<Action> {
        TODO("Not yet implemented")
    }

    override fun deleteAction(id: Int) {
        TODO("Not yet implemented")
    }
}