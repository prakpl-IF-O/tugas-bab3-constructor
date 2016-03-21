/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gunka
 */
public class Database {

    String[] a = {"NIK", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda"};
    int[] nik = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    String[] nama = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin",
        "Sutiman", "Raja", "Harry"};
    int[] gajiPokok = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
    int[] tunjangan = {1000, 900, 1000, 750, 850, 350, 1000, 1250, 500, 200};
    int[] bonus = {500, 500, 300, 600, 500, 450, 500, 500, 200, 200};
    int[] denda = {200, 200, 375, 200, 300, 250, 200, 300, 200, 200};

    public void get() {
        System.out.println("@Mengambil semua data");
        for (int j = 0; j < a.length; j++) {
            System.out.printf("%-15s", a[j]);
        }
        System.out.println("");
        for (int i = 0; i < nik.length; i++) {
            System.out.printf("%-15s", nik[i]);
            System.out.printf("%-15s", nama[i]);
            System.out.printf("%-15s", gajiPokok[i]);
            System.out.printf("%-15s", tunjangan[i]);
            System.out.printf("%-15s", bonus[i]);
            System.out.printf("%-15s", denda[i]);
            System.out.println("");
        }
    }

    public void get(int b) {
        System.out.println("");
        System.out.println("@NIK = " + b);
        for (int j = 0; j < a.length; j++) {
            System.out.printf("%-15s", a[j]);
        }
        System.out.println("");
        for (int i = 0; i < nik.length; i++) {
            if (nik[i] == b) {
                System.out.printf("%-15s", nik[i]);
                System.out.printf("%-15s", nama[i]);
                System.out.printf("%-15s", gajiPokok[i]);
                System.out.printf("%-15s", tunjangan[i]);
                System.out.printf("%-15s", bonus[i]);
                System.out.printf("%-15s", denda[i]);
                System.out.println("");
            }
        }
    }

    public void get(String c, int b) {
        System.out.println("");
        System.out.println("@" + c + " = " + b);
        for (int j = 0; j < a.length; j++) {
            System.out.printf("%-15s", a[j]);
        }
        System.out.println("");
        for (int i = 0; i < nik.length; i++) {
            if (gajiPokok[i] == b) {
                System.out.printf("%-15s", nik[i]);
                System.out.printf("%-15s", nama[i]);
                System.out.printf("%-15s", gajiPokok[i]);
                System.out.printf("%-15s", tunjangan[i]);
                System.out.printf("%-15s", bonus[i]);
                System.out.printf("%-15s", denda[i]);
                System.out.println("");
            }
        }
    }

    public void get(String c, String x, int b) {
        System.out.println("");
        System.out.println("@" + c + " " + x + " " + b);
        for (int j = 0; j < a.length; j++) {
            System.out.printf("%-15s", a[j]);
        }
        System.out.println("");
        for (int i = 0; i < nik.length; i++) {
            if (bonus[i] > b) {
                System.out.printf("%-15s", nik[i]);
                System.out.printf("%-15s", nama[i]);
                System.out.printf("%-15s", gajiPokok[i]);
                System.out.printf("%-15s", tunjangan[i]);
                System.out.printf("%-15s", bonus[i]);
                System.out.printf("%-15s", denda[i]);
                System.out.println("");
            }
        }
    }
}
