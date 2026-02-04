package domain.implRepository

import domain.entities.Action
import domain.repository.ActionRepository

class InMemoryActionRepository : ActionRepository{
    override fun saveAction(action: Action) {
        TODO("Not yet implemented")
    }

    override fun getActionById(id: Int): Action? {
        TODO("Not yet implemented")
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