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
public class Data {
    private int[] nik={101,102,103,104,105,106,107,108,109,110};
    private String[] nama={"Paijo","Lala","Lulu","Sabar","Sule","Paiman","Ponimin","Sutiman","Raja","Harry"};
    private int [] gajiPokok={2000,1750,2150,1500,2500,1500,2000,1500,1000,2250};
    private int [] tunjangan={1000,900,1000,750,850,350,1000,1250,1000,1000};
    private int [] bonus={500,500,300,600,500,450,500,500,500,200};
    private int [] denda={200,200,375,200,300,250,200,300,200,200};
    
    public void get(){
        System.out.println("DATA KESELURUHAN");
        System.out.println();
        for (int i=0; i<nik.length; i++){
            System.out.println("Nik         : "+nik[i]);
            System.out.println("Nama        : "+nama[i]);
            System.out.println("Gaji Pokok  : "+gajiPokok[i]);
            System.out.println("Tunjangan   : "+tunjangan[i]);
            System.out.println("Bonus       : "+bonus[i]);
            System.out.println("denda       : "+denda[i]);
            System.out.println();
        }
    }
} 
