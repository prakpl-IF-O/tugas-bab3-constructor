/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enggar Pratama
 */
public class DB {

    private int[] nik = new int[10];
    private String[] nama = new String[10];
    private int[] g_pokok = new int[10];
    private int[] tunjangan = new int[10];
    private int[] bonus = new int[10];
    private int[] denda = new int[10];
    int urutan = 0;

    public void pendataan(int nik1, String nama1, int g_pokok1, int tunjangan1, int bonus1, int denda1) {
        nik[urutan] = nik1;
        nama[urutan] = nama1;
        g_pokok[urutan] = g_pokok1;
        tunjangan[urutan] = tunjangan1;
        bonus[urutan] = bonus1;
        denda[urutan] = denda1;
        urutan++;
    }

    public void get() {
   for(int x =0; x<urutan;x++){
       System.out.println("NIK        : "+nik[x]);
       System.out.println("nama       : "+nama[x]);
       System.out.println("gaji pokok : "+g_pokok[x]);
       System.out.println("tunjangan  : "+tunjangan[x]);
       System.out.println("bonus      : "+bonus[x]);
       System.out.println("denda      : "+denda[x]);
       System.out.println("++--------------------------++");
   } 
   
        
    }
}
