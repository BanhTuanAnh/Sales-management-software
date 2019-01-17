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
public class KhachHang implements Serializable,GiaoTiep{
    private int id;
    private String phoneNumber,adress,name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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
            this.id,this.name,this.phoneNumber,this.adress
        };
    }   
}
