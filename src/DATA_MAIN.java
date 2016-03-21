/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Enggar Pratama
 */
public class DATA_MAIN {
     public static void main(String[] args) {
        DB db = new DB();
        db.pendataan(101, "paijo",2000, 1000 , 500 , 200 );
        db.pendataan(102, "lala", 1750 , 900 , 500 , 200 );
        db.pendataan(103, "lulu", 2150 , 1000 , 300 , 375 );
        db.pendataan(104, "sabar", 1500 , 750 , 600 , 200 );
        db.pendataan(105, "sule", 2500 , 850 , 500 , 300 );
        db.pendataan(106, "paiman", 1500 , 350 , 450 , 250 );
        db.pendataan(107, "ponimin", 2000 , 1000 , 500 , 200 );
        db.pendataan(108, "sutiman", 1500 , 1250 , 500 , 300 );
        db.pendataan(109, "raja", 1000 , 1000 , 500 , 200 );
        db.pendataan(110, "harry", 2250 , 1000 , 200 , 200 );
         System.out.println("------MEMUNCULKAN SEMUA DATA------");
    db.get();
         System.out.println("-----------db.get(107)------------");
    db.get(107);
         System.out.println("---db.get(\"gaji pokok\", 2000)---");
    db.get("gaji pokok", 2000);
         System.out.println("---db.get(\"denda\",\"<\", 200)---");
    db.get("denda","<", 200);
     } 
}
