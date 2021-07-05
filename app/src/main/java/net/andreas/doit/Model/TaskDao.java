package net.andreas.doit.Model;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

//Not used... Kept in for good will

@Dao
public abstract class TaskDao {

    @Transaction
    @Query("SELECT * FROM task")
    public abstract List<Task> getTasks();

    @Insert
    public abstract long insert(Task task);

    @Update
    public abstract void update(Task task);

    @Delete
    public abstract void delete(Task task);

}

