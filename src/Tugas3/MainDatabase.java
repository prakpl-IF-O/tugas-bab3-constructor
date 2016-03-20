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
        
    }
}
