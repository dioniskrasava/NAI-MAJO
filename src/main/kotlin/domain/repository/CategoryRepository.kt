package domain.repository

import domain.entities.CategoryAction

interface CategoryRepository{

    fun saveCategory(category: CategoryAction)

    fun getCategoryById(id: Int): CategoryAction?

    fun getAllCategory() : List<CategoryAction>
}