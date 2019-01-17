/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import models.KhachHang;
import models.MatHang;

/**
 *
 * @author Administrator
 */
public class IOFile {

    public void ghiHoaDon(ArrayList listHD, String file) throws FileNotFoundException, IOException {
        try (FileOutputStream fos = new FileOutputStream(new File(file));){
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(listHD);
        } catch (Exception e) {
        }
 

    }

    public ArrayList docHoaDon(String file) {
        ArrayList listHD = new ArrayList();
        try (FileInputStream fis = new FileInputStream(new File(file));) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            listHD = (ArrayList) ois.readObject();
        } catch (Exception e) {
        }

        return listHD;
    }

    public void ghìKhachHang(ArrayList<KhachHang> listKH) {
        try (PrintWriter pw = new PrintWriter(new File("KH.DAT"))) {
            for (KhachHang kh : listKH) {
                pw.println(kh.getId());
                pw.println(kh.getName());
                pw.println(kh.getPhoneNumber());
                pw.println(kh.getAdress());
            }
        } catch (Exception e) {
            System.out.println("Got some exception in ghi kh");
        }
    }

    public ArrayList docKhachHang() {
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("KH.DAT"))) {
            while (sc.hasNext()) {
                KhachHang temp = new KhachHang();
                temp.setId(Integer.parseInt(sc.nextLine()));
                temp.setName(sc.nextLine());
                temp.setPhoneNumber(sc.nextLine());
                temp.setAdress(sc.nextLine());

                listKH.add(temp);
            }
        } catch (Exception e) {
            System.out.println("Got some exception in ghi kh");
        }
        return listKH;

    }

    public void ghiMatHang(ArrayList<MatHang> listMH) {
        try (PrintWriter pw = new PrintWriter(new File("MH.DAT"))) {
            for (MatHang mh : listMH) {
                pw.println(mh.getId());
                pw.println(mh.getName());
                pw.println(mh.getType());
                pw.println(mh.getPrice());
            }
        } catch (Exception e) {
            System.out.println("Got some exception in ghi mh");
        }
    }

    public ArrayList docMatHang() {
        ArrayList<MatHang> listMH = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("MH.DAT"))) {
            while (sc.hasNext()) {
                MatHang temp = new MatHang();
                temp.setId(Integer.parseInt(sc.nextLine()));
                temp.setName(sc.nextLine());
                temp.setType(sc.nextLine());
                temp.setPrice(Float.parseFloat(sc.nextLine()));

                listMH.add(temp);
            }
        } catch (Exception e) {
            System.out.println("Got some exception in ghi kh");
        }
        return listMH;

    }

}
