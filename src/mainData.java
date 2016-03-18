/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_2;

/**
 *
 * @author salmahnfh
 */
public class mainData {
    public static void main(String[] args) {
        Data db=new Data();
        db.get();
        db.get(104);
        db.get("tunjangan",1000);//mengambil semua data yang memiliki tunjangan=1000
        db.get("bonus", 500);//mengambil semua data yang memiliki bonus=500
        db.get("gaji pokok",1500);//mengambil semua data yang memiliki gaji pokok=1500
        db.get("denda", 300);//mengambil semua data yang memiliki denda=300
    }
}
