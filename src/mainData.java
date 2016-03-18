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
        db.get();//mengambil semua data
        db.get(104);//mengambil data dengan nik/id=104
        db.get("gaji pokok",2000);//mengambil semua data yang memiliki gaji pokok=2000
        db.get("tunjangan","<=",1000);//mengambil semua data yang memiliki tunjangan<=1000
        db.get("bonus",">",450);//mengambil semua data yang memiliki bonus<450
    }
}
