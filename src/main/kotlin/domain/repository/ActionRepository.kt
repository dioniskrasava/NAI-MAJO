package domain.repository

import domain.entities.Action

/** ИНТЕРФЕЙС - КОНТРАКТ (ОПИСАНИЕ) ТОГО, ЧТО ДОЛЖЕН УМЕТЬ ДЕЛАТЬ КЛАСС, чтобы
 * соответствовать определенным критериям. И именно благодаря этому мы сможем
 * создавать различные классы (которые будут реализовывать данный интерфейс)
 * и сможем */
interface ActionRepository {
   // сохранить активность
   fun saveAction(action: Action)

   // получить активность по id
   fun getActionById(id: Int): Action?

   // получить все активности
   fun getAllActions() : List<Action>

   // получить активность по категории
   fun getActionsByCategory(category: String) : List<Action>

   // удалить активность
   fun deleteAction(id: Int)
}