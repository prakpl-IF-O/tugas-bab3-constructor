package bab3;
import java.util.ArrayList;

public class Database {

    int[] nik = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    String[] nama = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Harry"};
    int[] gajiPokok = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
    int[] tunjangan = {1000, 900, 1000, 750, 850, 350, 1000, 1250, 1000, 1000};
    int[] bonus = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200};
    int[] denda = {200, 200, 375, 200, 300, 250, 200, 300, 200, 200};
    String[] d1 = {"nik", "nama", "gajiPokok", "tunjangan", "bonus", "denda"};

    public void get() {
        
        System.out.print("NIK\t" + "NAMA\t" + "GAJI POKOK\t" + "TUNJANGAN\t" + "BONUS\t" + "DENDA\t\n");
        for (int i = 0; i < nik.length; i++) {
            System.out.print(nik[i] + "\t" + nama[i] + "\t" + gajiPokok[i] + "\t\t" + tunjangan[i] + "\t\t" + bonus[i] + "\t" + denda[i] + "\t\n");
        }
        System.out.println();
   }

    
    }