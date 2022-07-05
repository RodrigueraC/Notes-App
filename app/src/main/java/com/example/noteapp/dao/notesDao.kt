package com.example.noteapp.dao

import androidx.room.*
import com.example.noteapp.entities.Notes

@Dao
interface notesDao {

    @Query( "SELECT * FROM notes ORDER BY id DESC")
    suspend fun getAllNotes(): List<Notes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNotes(note:Notes)

    @Delete
    suspend fun deleteNotes(note: Notes)
}