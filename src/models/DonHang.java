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
public class DonHang implements Serializable, GiaoTiep {

    private MatHang good;
    private int soluong;
    private float giaTri;

    public MatHang getGood() {
        return good;
    }

    public void setGood(MatHang good) {
        this.good = good;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGiaTri() {
        return giaTri;
    }

    public void tinhGiaTri() {
        this.giaTri = 0;
        this.giaTri = this.soluong * this.good.getPrice();
    }

    @Override
    public Object[] toOject() {
        return new Object[]{
            this.good.getId(), this.good.getName(),this.soluong, this.good.getPrice(), this.giaTri
        };
    }
}
