/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

/**
 *
 * @author Faza Abdi
 */
public class dataBase {

    private int nik[] = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    private String nama[] = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Harry"};
    private int gajiPokok[] = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
    private int tunjangan[] = {1000, 900, 1000, 750, 850, 350, 1000, 1250, 1000, 1000};
    private int bonus[] = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200};
    private int denda[] = {200, 200, 375, 200, 300, 250, 200, 300, 200, 200};

    public void get() {
        System.out.println("=====================(SELURUH DATA)=====================");
        System.out.print("NIK     NAMA     GAJI     TUNJANGAN     BONUS     DENDA\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i], nama[i], gajiPokok[i], tunjangan[i], bonus[i], denda[i]);
        }
        System.out.println("");
    }

    public void get(int id) {
        System.out.println("=====================(DATA NIK " + id + ")=====================");
        System.out.print("NIK     NAMA     GAJI     TUNJANGAN     BONUS     DENDA\n");
        for (int i = 0; i < 10; i++) {
            if (nik[i] == id) {
                System.out.printf("%-7d %-8s %-8d %-13d %-9d %d\n", nik[i], nama[i], gajiPokok[i], tunjangan[i], bonus[i], denda[i]);
            }
        }
        System.out.println("");
    }

    public void get(String columnName, int obValue) {
        System.out.println("================(DATA " + columnName + " = " + obValue + ")=================");
    }

    public void get(String columnName, String operator, int obValue) {

    }
}
