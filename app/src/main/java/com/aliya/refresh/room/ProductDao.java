package com.aliya.refresh.room;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.aliya.refresh.Product;

import java.util.List;

@Dao
public interface ProductDao {
    @Query("SELECT * FROM Product limit 500")
    List<Product> getAll();

    @Query("SELECT * FROM Product limit 500")
    LiveData<List<Product>> liveGetAll();
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertOrReplace(Product Product);
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertOrReplaceAll(List<Product> Products);
    
    @Delete
    void delete(Product blogPost);
    
    @Update
    void update(Product blogPost);
    
    @Query("DELETE FROM Product")
    void deleteAll();

}