/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Kenank
 */
public class Data {
    private int nik[] = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    private String nama[] = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Harry"};
    private int gajiPokok[] = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
    private int tunjangan[] = {1000, 900, 1000, 750, 850, 350, 1000, 1250, 1000, 1000};
    private int bonus[] = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200};
    private int denda[] = {200, 200, 375, 200, 300, 250, 200, 300, 200, 200};
    
    
     public void get(){
        System.out.println("===========================================================");
        System.out.println("                       DATA KARYAWAN                      ");
        System.out.println("===========================================================");
        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
        for (int i=0; i<nik.length; i++){
            System.out.printf("%-7d %-8s %-8d %-13d %-9d", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
            System.out.println(" ");
        }
        System.out.println("===========================================================");
        System.out.println(" ");
}
      public void get(int id) {
        System.out.println("===========================================================");
        System.out.println("                    DATA NIK " + id + "                     ");
        System.out.println("===========================================================");
        System.out.print("NIK     NAMA     GAJI     TUNJANGAN     BONUS     DENDA\n");
        for (int i = 0; i < 10; i++) {
            if (nik[i] == id) {
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i], nama[i], gajiPokok[i], tunjangan[i], bonus[i], denda[i]);
            }
        }
        System.out.println(" ");
    }
      public void get(String columnName, int value){
        System.out.println("===========================================================");
        System.out.println("                      DATA KARYAWAN                        ");
        System.out.println("===========================================================");
        if (columnName == "Gaji Pokok"){
            System.out.println("             KARYAWAN DENGAN GAJI POKOK : " +value);
            System.out.println("==========================================================");
            System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
            for (int i=0; i<gajiPokok.length; i++){
                if ( value == gajiPokok[i]){
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                } else if (value > 2500){ System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","-","-","-","-","-","-");break; 
                } else if (value < 2000){ System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","-","-","-","-","-","-");break;}
            } 
} else if (columnName == "Tunjangan"){
            System.out.println("        KARYAWAN YANG MENDAPAT TUNJANGAN : " +value);
            System.out.println("==========================================================");
            System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
            for (int i=0; i<tunjangan.length; i++){
                if ( value == tunjangan[i]){
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                } else if ( value > 1250 ){ System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","-","-","-","-","-","-");break;  
                } else if ( value < 350) { System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","-","-","-","-","-","-");break; }
            } 
        
        } else if (columnName == "Bonus"){
            System.out.println("            KARYAWAN YANG MENDAPAT BONUS : " +value);
            System.out.println("==========================================================");
            System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
            for (int i=0; i<bonus.length; i++){
                if ( value == bonus[i]){
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                } else if ( value > 600) { System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","-","-","-","-","-","-");break;
                } else if ( value < 200) { System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","-","-","-","-","-","-");break;}
            }
            
        }else if (columnName == "Denda"){
            System.out.println("             KARYAWAN YANG MENDAPAT DENDA : " +value);
            System.out.println("==========================================================");
            System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
            for (int i=0; i<denda.length; i++){
                if ( value == denda[i]){
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                } else if (value > 375) { System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","-","-","-","-","-","-");break;
                } else if (value < 200) { System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","-","-","-","-","-","-");break;} 
            } 
        }
        System.out.println("============================================================");
        System.out.println(" ");
    }
       public void get(String columnName, String operator, int value){
        System.out.println("============================================================");
        System.out.println("                        DATA KARYAWAN                       ");
        System.out.println("============================================================");
        if (columnName == "Gaji Pokok"){
            if (operator == "<"){
                System.out.println(" KARYAWAN DENGAN GAJI POKOK < " +value);
                System.out.println("=========================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<gajiPokok.length; i++){
                    if (gajiPokok[i] < value ){
                        System.out.printf("%%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            } else if (operator == "<="){
                System.out.println("           KARYAWAN DENGAN GAJI POKOK <= " +value);
                System.out.println("==========================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<gajiPokok.length; i++){
                    if (gajiPokok[i] <= value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    }
                }
            } else if (operator == ">"){
                System.out.println("          KARYAWAN DENGAN GAJI POKOK > " +value);
                System.out.println("==========================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<gajiPokok.length; i++){
                    if (gajiPokok[i]>value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            } else if (operator == ">="){
                System.out.println("         KARYAWAN DENGAN GAJI POKOK >= " +value);
                System.out.println("==========================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<gajiPokok.length; i++){
                    if (gajiPokok[i] >= value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            } 
        
        } else if (columnName == "Tunjangan"){
            if (operator == "<"){
                System.out.println("        KARYAWAN YANG MENDAPAT TUNJANGAN < " +value);
                System.out.println("===========================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<tunjangan.length; i++){
                    if (tunjangan[i] < value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            } else if (operator == "<="){
                System.out.println("        KARYAWAN YANG MENDAPAT TUNJANGAN <= " +value);
                System.out.println("============================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<tunjangan.length; i++){
                    if (tunjangan[i] <= value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            } else if (operator == ">"){
                System.out.println("       KARYAWAN YANG MENDAPAT TUNJANGAN > " +value);
                System.out.println("============================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<tunjangan.length; i++){
                    if (tunjangan[i] > value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            } else if (operator == ">="){
                System.out.println("        KARYAWAN YANG MENDAPAT TUNJANGAN >= " +value);
                System.out.println("=============================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<tunjangan.length; i++){
                    if (tunjangan[i] >= value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            }
        }
        
        else if (columnName == "Bonus"){
            if (operator == "<"){
                System.out.println("          KARYAWAN YANG MENDAPAT BONUS < " +value);
                System.out.println("============================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<bonus.length; i++){
                    if (bonus[i] < value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            } else if (operator == "<="){
                System.out.println("          KARYAWAN YANG MENDAPAT BONUS <= " +value);
                System.out.println("============================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<bonus.length; i++){
                    if (bonus[i] <= value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            } else if (operator == ">"){
                System.out.println("           KARYAWAN YANG MENDAPAT BONUS > " +value);
                System.out.println("============================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<bonus.length; i++){
                    if (bonus[i] > value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }  
            } else if (operator == ">="){
                System.out.println("          KARYAWAN YANG MENDAPAT BONUS >= " +value);
                System.out.println("============================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<bonus.length; i++){
                    if (bonus[i] >= value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            }
        } 
        
        else if (columnName == "Denda"){
            if (operator == "<"){
                System.out.println("           KARYAWAN YANG MENDAPAT DENDA < " +value);
                System.out.println("===========================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<denda.length; i++){
                    if (denda[i] < value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            } else if (operator == "<="){
                System.out.println("          KARYAWAN YANG MENDAPAT DENDA <= " +value);
                System.out.println("============================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<denda.length; i++){
                    if (denda[i] <= value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            } else if (operator == ">"){
                System.out.println("           KARYAWAN YANG MENDAPAT DENDA > " +value);
                System.out.println("============================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<denda.length; i++){
                    if (denda[i] > value){
                        System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }  
            } else if (operator == ">="){
                System.out.println("          KARYAWAN YANG MENDAPAT DENDA >= " +value);
                System.out.println("============================================================");
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n","NIK","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
                for (int i=0; i<denda.length; i++){
                    if (denda[i] >= value){
                        System.out.printf("%-7d%-13s%-12d%-12d%-10d%-6d\n", nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                    } 
                }
            }
        } 
        System.out.println("============================================================");
        System.out.println(" ");
    }
}    
