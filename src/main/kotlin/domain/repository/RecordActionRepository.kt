package domain.repository

import domain.entities.RecordAction

interface RecordActionRepository{
    fun saveRecord(record: RecordAction)
    fun getRecordById(id: Int): RecordAction?
    fun getAllRecords(): List<RecordAction>
    fun getRecordsByCategory(category: String) : List<RecordAction>
}