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
public class Database {
    private int [] nik = {101,102,103,104,105,106,107,108,109,110};
    private String [] namaKaryawan = {"Paijo","Lala","Lulu","Sabar","Sule","Paiman","Ponimin","Sutiman","Raja","Harry"};
    private int [] gajiPokok = {2000,1750,2150,1500,2500,1500,2000,1500,1000,2250};
    private int [] tunjangan = {1000,900,1000,750,850,350,1000,1250,1000,1000};
    private int [] bonus = {500,500,300,600,500,450,500,500,500,200};
    private int [] denda = {200,200,375,200,300,250,200,300,200,200};
    
     public void get(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                       DATA PEGAWAI BANK");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-10s%-12s%-14s%-16s%-10s%-10s\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
            for (int d = 0; d < nik.length; d++) {
                    System.out.printf("%-10s%-12s%-14d%-16d%-10d%-10d\n",nik[d],namaKaryawan[d],gajiPokok[d],tunjangan[d],bonus[d],denda[d]);
            }
        System.out.println("-----------------------------------------------------------------");
        System.out.println();
        
     }
        public void get (int id){
        System.out.println("---------------------------------------------");
        System.out.println("          DATA KARYAWAN DENGAN NIK");
        System.out.println("---------------------------------------------");
        System.out.printf("%-10s%-12s%-14s%-16s%-10s%-10s\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
        for (int d = 0; d<nik.length; d++){
        if (nik[d]==id){
                System.out.printf("%-10s%-12s%-14d%-16d%-10d%-10d\n",nik[d],namaKaryawan[d],gajiPokok[d],tunjangan[d],bonus[d],denda[d]);
        }
        }
        System.out.println("---------------------------------------------");
        System.out.println();
    }
    }

