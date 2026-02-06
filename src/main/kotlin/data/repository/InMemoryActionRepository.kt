package data.repository

import domain.entities.Action
import domain.repository.ActionRepository

/**
 * Реализация интерфейса репозитория работы с активностью
 *
 * Объект данного класса
 * */
class InMemoryActionRepository : ActionRepository {

    private val actions = mutableMapOf<Int, Action>() // список активностей
    private var currentId = 0                         // счетчик для активностей

    // сохраняем активность (создаем новую или обновляем существующую)
    override fun saveAction(action: Action) {
        val idToSave = action.id

        // если id не задан или равен нулю, то считаем это новой активностью
        if (idToSave == 0) {
            currentId++
            val newAction = action.copy(id = currentId) // копируем объект активности давая ему новый айди
            actions[currentId] = newAction // закидываем активность в мап
            println("Создана новая активность $newAction")
        } else {
            actions[idToSave] = action // если id есть, то обновляем текущую запись
            println("Обновлена активность с id = $idToSave : $action")
        }

    }

    override fun getActionById(id: Int): Action? {

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