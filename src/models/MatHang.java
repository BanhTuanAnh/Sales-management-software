/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controller.GiaoTiep;
import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class MatHang implements Serializable, GiaoTiep {

    private int id;
    private float price;
    private String type, name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public Object[] toOject() {
        return new Object[]{
            this.id, this.name, this.type,this.price
        };
    }
}
