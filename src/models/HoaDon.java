/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controller.GiaoTiep;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Administrator
 */
public class HoaDon implements Serializable,GiaoTiep{
    private int id;
    private KhachHang cus;
    private ArrayList <DonHang> goods;
    private String  day;
    private float tongGiaTri=0;

    public int getId() {
        return id;
    }
  
    
    public ArrayList getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<DonHang> goods) {
        this.goods = goods;
    }

    public float getTongGiaTri() {
        return tongGiaTri;
    }

    public void tinhTongGiaTri() {
        tongGiaTri=0;
        for(DonHang dh: this.goods){
            tongGiaTri+=dh.getGiaTri();
        }
    }
    
    public KhachHang getCus() {
        return cus;
    }

    public void setCus(KhachHang cus) {
        this.cus = cus;
    }
    

    public String getDay() {
        return day;
    }

    public void setDay() {
        this.day = this.ngayHeThong();
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public Object[] toOject() {
        return new Object[]{
            this.id,this.cus.getName(),this.tongGiaTri,this.day
        };
    }
    private String ngayHeThong(){
        Date now=new Date();
        SimpleDateFormat formater= new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        String ngayHeThong= formater.format(now.getTime());
        return ngayHeThong;
    }
    
}
