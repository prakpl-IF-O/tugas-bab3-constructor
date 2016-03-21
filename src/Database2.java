package bab3;
public class Database2 {
 
     int[] nik = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
     String[] nama = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Harry"};
     int[] gajiPokok = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
     int[] tunjangan = {1000, 900, 1000, 750, 850, 350, 1000, 1250, 1000, 1000};
     int[] bonus = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200};
     int[] denda = {200, 200, 375, 200, 300, 250, 200, 300, 200, 200};
     String[] d1 = {"nik", "nama", "gajiPokok", "tunjangan", "bonus", "denda"};
 
     public void get() {
         System.out.println("===========================DATA LENGKAP=====================================");
         System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
         System.out.println("=============================================================================");
         for (int i = 0; i < nik.length; i++) {
             System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
         }
         System.out.println("=============================================================================");
         System.out.println();
     }
 
     public void get(int Nik_) {
         System.out.println("===================DATA KARYAWAN DENGAN NIK " + Nik_ + "=====================");
         for (int i = 0; i < nik.length; i++) {
             if (nik[i] == Nik_) {
                 System.out.println("Nik\t\t: " + nik[i]);
                 System.out.println("Nama\t\t: " + nama[i]);
                 System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                 System.out.println("Tunjangan\t: " + tunjangan[i]);
                 System.out.println("Bonus\t\t: " + bonus[i]);
                 System.out.println("denda\t\t: " + denda[i]);
                 System.out.println("=============================================================================");
 
             }
         }
         System.out.println();
     }
 
     public void get(String Data1, int value) {
         if (Data1 == "tunjangan") {
             System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
             for (int i = 0; i < tunjangan.length; i++) {
                 if (tunjangan[i] == value) {
                     System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                     System.out.println("=============================================================================");
 
                 }
             }
         } 
         else if (Data1 == "gaji pokok") {
             System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
             for (int i = 0; i < gajiPokok.length; i++) {
                 if (gajiPokok[i] == value) {
                     System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                     System.out.println("=============================================================================");
 
                 }
             }
         } 
         else if (Data1 == "bonus") {
             System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
             for (int i = 0; i < bonus.length; i++) {
                 if (bonus[i] == value) {
                     System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                     System.out.println("=============================================================================");
 
                 }
             }
         } 
         else if (Data1 == "denda") {
            System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
             for (int i = 0; i < denda.length; i++) {
                 if (denda[i] == value) {
                     System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                     System.out.println("=============================================================================");
 
                 }
             }
         }
         System.out.println("");
         System.out.println("");
     }
 
     public void get(String Data1, String ii, int value) {
         if (Data1 == "GAJI") {
             if (ii == "<") {
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < gajiPokok.length; i++) {
                     if (gajiPokok[i] < value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             } 
             else if (ii == ">") {
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < gajiPokok.length; i++) {
                     if (gajiPokok[i] > value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             } 
             else if (ii == "<=") {
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < gajiPokok.length; i++) {
                     if (gajiPokok[i] <= value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             } 
             else if (ii == ">=") {
                System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < gajiPokok.length; i++) {
                     if (gajiPokok[i] >= value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             }
             System.out.println("");
             System.out.println("");
         } 
         else if (Data1 == "TUNJANGAN") {
             if (ii == "<") {
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < tunjangan.length; i++) {
                     if (tunjangan[i] < value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             } 
             else if (ii == ">") {
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < tunjangan.length; i++) {
                     if (tunjangan[i] > value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             } 
             else if (ii == "<=") {
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < tunjangan.length; i++) {
                     if (tunjangan[i] <= value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             } 
             else if (ii == ">=") {
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < tunjangan.length; i++) {
                     if (tunjangan[i] >= value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             }
             System.out.println("");
             System.out.println("");
         } 
         else if (Data1 == "BONUS") {
             if (ii == "<") {
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < bonus.length; i++) {
                     if (bonus[i] < value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             } 
             else if (ii == ">") {
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < bonus.length; i++) {
                     if (bonus[i] > value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             } 
             else if (ii == "<=") {
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < bonus.length; i++) {
                     if (bonus[i] <= value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         System.out.println("=============================================================================");
 
                     }
                 }
             } 
             else if (ii == ">=") {
                
                 System.out.println("               DATA KARYAWAN DENGAN BONUS >= " + value);
                 System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                 
                 for (int i = 0; i < bonus.length; i++) {
                     if (bonus[i] >= value) {
                         System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                         
 
                     }
                 }
             }
            
            System.out.println("");
            System.out.println("");
         } 
       
        else if (Data1 == "DENDA") {
            if (ii == "<") {
                System.out.println("=DATA KARYAWAN DENGAN DENDA > " + value );
                System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                ;
                for (int i = 0; i < denda.length; i++) {
                    if (denda[i] < value) {
                        System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                        

                    }
                }
            } 
            else if (ii == ">") {
                System.out.println("=DATA KARYAWAN DENGAN DENDA > " + value );
                System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
               
                for (int i = 0; i < denda.length; i++) {
                    if (denda[i] > value) {
                        System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                        
                    }
                }
            } 
            else if (ii == "<=") {
                System.out.println("DATA KARYAWAN DENGAN DENDA <= " + value  );
                System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                
                for (int i = 0; i < denda.length; i++) {
                    if (denda[i] <= value) {
                        System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                        

                    }
                }
            } 
            else if (ii == ">=") {
                System.out.println("DATA KARYAWAN DENGAN DENDA >= " + value );
                System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
                    for (int i = 0; i < denda.length; i++) {
                    if (denda[i] >= value) {
                        System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
                        
                    }
                }
            }
        }
     }
 }