package com.aliya.refresh;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Product {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String barcode;
    public String name;
    public String orderr;
    public String picture;
    public String price;

    public String hasExpiry;
    public String max_qty_in_room;

    public Product(){

    }
    public Product(int id, String barcode, String name, String orderr, String picture, String price, String hasExpiry, String max_qty_in_room) {
        this.id = id;
        this.barcode = barcode;
        this.name = name;
        this.orderr = orderr;
        this.picture = picture;
        this.price = price;
        this.hasExpiry = hasExpiry;
        this.max_qty_in_room = max_qty_in_room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderr() {
        return orderr;
    }

    public void setOrderr(String orderr) {
        this.orderr = orderr;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHasExpiry() {
        return hasExpiry;
    }

    public void setHasExpiry(String hasExpiry) {
        this.hasExpiry = hasExpiry;
    }

    public String getMax_qty_in_room() {
        return max_qty_in_room;
    }

    public void setMax_qty_in_room(String max_qty_in_room) {
        this.max_qty_in_room = max_qty_in_room;
    }
}

