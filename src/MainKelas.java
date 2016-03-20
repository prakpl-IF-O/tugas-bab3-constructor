/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author dwiyan
 */
public class MainKelas {

    public static void main(String[] args) {
        DataPegawai obj = new DataPegawai();
        obj.tambahData("101", "Paijo", 2000, 1000, 500, 200);
        obj.tambahData("102", "Lala", 1750, 900, 500, 200);
        obj.tambahData("103", "Lulu", 2150, 1000, 300, 375);
        obj.tambahData("104", "Sabar", 1500, 750, 600, 200);
        obj.tambahData("105", "sule", 2500, 850, 500, 300);
        obj.tambahData("106", "Paiman", 1500, 350, 450, 250);
        obj.tambahData("107", "Ponimin", 2000, 1000, 500, 200);
        obj.tambahData("108", "Sutiman", 1500, 1250, 500, 300);
        obj.tambahData("109", "Raja", 1000, 1000, 500, 200);
        obj.tambahData("110", "Harry", 2250, 1000, 200, 200);

     
        obj.get("tunjangan",350);
        System.out.println();
    }
}
