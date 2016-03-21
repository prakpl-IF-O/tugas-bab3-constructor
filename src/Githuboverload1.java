/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Githuboverload1 {
        int nik , gajipokok, tunjangan, bonus, denda ;String nama ;
    
    public Githuboverload1 (){
        
    }
    public Githuboverload1 (int a, String n,int g,int t,int b, int d){
        this.nama=n;
        this.nik=a;
        this.gajipokok=g;
        this.tunjangan=t;
        this.bonus=b; 
        this.denda=d;
    }
    public void nama (String n){
        nama=n;
    }
    public void nik ( int a){
        nik=a;
    }
    public void gaji (int g){
        gajipokok=g;
    }
    public void tunjangan ( int t){
        tunjangan=t;
    }
    public void bonus ( int b){
        bonus = b;
    }
    public void denda ( int d){
        denda=d;
    }

    public int getNik() {
        return nik;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getBonus() {
        return bonus;
    }

    public int getDenda() {
        return denda;
    }

    public String getNama() {
        return nama;
    }
    
    public void display (){
        System.out.println("Nik         :"+nik);
        System.out.println("Nama        :"+nama);
        System.out.println("Gaji Pokok  :"+gajipokok);
        System.out.println("Tunjangan   :"+tunjangan);
        System.out.println("Bonus       :"+bonus);
        System.out.println("Denda       :"+denda);
}

}
