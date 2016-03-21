/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Aditya
 */
public class MainDatabase {
    public static void main(String[] args) {
        Database db = new Database();
        System.out.println("Menampilkan Data Karyawan");
        db.get();
        System.out.println("Menampilkan Data Berdasarkan NIK");
        db.get(109);
        System.out.println("Menampilkan Data Dengan Gaji 2000");
        db.get("gaji pokok",2000);
        System.out.println("Menampilkan Data Dengan Tunjangan <= 1000");
        db.get("Tunjangan","<=",1000);
        System.out.println("Menampilkan Data Dengan Bonus > 450");
        db.get("bonus",">",450);
    }
}
