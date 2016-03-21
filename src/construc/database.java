/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construc;

/**
 *
 * @author Win_8.1
 */
public class database {

    int[] nik = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    String[] nama = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Hary"};
    int[] gajiPokok = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
    int[] tunjangan = {1000, 900, 1000, 850, 750, 350, 1000, 350, 1000, 1000};
    int[] bonus = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200};
    int[] denda = {200, 200, 375, 300, 200, 200, 200, 300, 300, 200};

}
  public void get() {
        System.out.println("NIK     NAMA    GajiPokok   Tunjangan   Bonus   Denda");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-7d %-9s %-11d %-10d %-8d %d\n", nik[i], nama[i], gajiPokok[i], tunjangan[i], bonus[i], denda[i]);
        }
    }

    public void get(int id) {
        for (int i = 0; i < 10; i++) {
            if (id == nik[i]) {
                System.out.println("NIK     NAMA    GajiPokok   Tunjangan   Bonus   Denda");
                System.out.printf("%-7d %-9s %-11d %-10d %-8d %d\n", nik[i], nama[i], gajiPokok[i], tunjangan[i], bonus[i], denda[i]);
            }
        }
    }
   public void get(String columnName, int value) {
        if (columnName.equals("1")) {
            System.out.println("NIK     NAMA    GajiPokok   Tunjangan   Bonus   Denda");
            for (int i = 0; i < 10; i++) {
                if (gajiPokok[i] == value) { 
                    System.out.printf("%-7d %-9s %-11d %-10d %-8d %d\n", nik[i], nama[i], gajiPokok[i], tunjangan[i], bonus[i], denda[i]);
                }
            }
        }

   