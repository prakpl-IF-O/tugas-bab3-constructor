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
        for (int x = 0; x < urutan; x++) {
            System.out.println("NIK        : " + nik[x]);
            System.out.println("nama       : " + nama[x]);
            System.out.println("gaji pokok : " + g_pokok[x]);
            System.out.println("tunjangan  : " + tunjangan[x]);
            System.out.println("bonus      : " + bonus[x]);
            System.out.println("denda      : " + denda[x]);
            System.out.println("++--------------------------++");
        }
    }

    public void get(int nik1) {
        for (int a = 0; a < urutan; a++) {
            if (nik1 == nik[a]) {
                System.out.println("\nNIK        : " + nik[a]);
                System.out.println("nama       : " + nama[a]);
                System.out.println("gaji pokok : " + g_pokok[a]);
                System.out.println("tunjangan  : " + tunjangan[a]);
                System.out.println("bonus      : " + bonus[a]);
                System.out.println("denda      : " + denda[a]);
            }
        }
    }

    public void get(String katagori, int nilai) {
        if (katagori == "gaji pokok") {
            for (int b = 0; b < urutan; b++) {
                if (g_pokok[b] == nilai) {
                    System.out.println("\nNIK        : " + nik[b]);
                    System.out.println("nama       : " + nama[b]);
                    System.out.println("gaji pokok : " + g_pokok[b]);
                    System.out.println("tunjangan  : " + tunjangan[b]);
                    System.out.println("bonus      : " + bonus[b]);
                    System.out.println("denda      : " + denda[b]);
                }
            }
        }
        if (katagori == "tunjangan") {
            for (int b = 0; b < urutan; b++) {
                if (tunjangan[b] == nilai) {
                    System.out.println("\nNIK        : " + nik[b]);
                    System.out.println("nama       : " + nama[b]);
                    System.out.println("gaji pokok : " + g_pokok[b]);
                    System.out.println("tunjangan  : " + tunjangan[b]);
                    System.out.println("bonus      : " + bonus[b]);
                    System.out.println("denda      : " + denda[b]);
                }
            }
        }
        if (katagori == "bonus") {
            for (int b = 0; b < urutan; b++) {
                if (bonus[b] == nilai) {
                    System.out.println("\nNIK        : " + nik[b]);
                    System.out.println("nama       : " + nama[b]);
                    System.out.println("gaji pokok : " + g_pokok[b]);
                    System.out.println("tunjangan  : " + tunjangan[b]);
                    System.out.println("bonus      : " + bonus[b]);
                    System.out.println("denda      : " + denda[b]);
                }
            }
        }
        if (katagori == "denda") {
            for (int b = 0; b < urutan; b++) {
                if (denda[b] == nilai) {
                    System.out.println("\nNIK        : " + nik[b]);
                    System.out.println("nama       : " + nama[b]);
                    System.out.println("gaji pokok : " + g_pokok[b]);
                    System.out.println("tunjangan  : " + tunjangan[b]);
                    System.out.println("bonus      : " + bonus[b]);
                    System.out.println("denda      : " + denda[b]);
                }
            }
        }
    }

    public void get(String katagori, String operator, int nilai) {
        if (katagori == "tunjangan") {
            if (operator == ">") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai > tunjangan[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == "<") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai < tunjangan[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == "<=") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai <= tunjangan[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == ">=") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai >= tunjangan[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            }
        }
        if (katagori == "gaji pokok") {
            if (operator == ">") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai > g_pokok[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == "<") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai < g_pokok[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == "<=") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai <= g_pokok[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == ">=") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai >= g_pokok[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            }
        }
    if (katagori == "bonus") {
            if (operator == ">") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai > bonus[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == "<") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai < bonus[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == "<=") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai <= bonus[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == ">=") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai >= bonus[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            }
        }
    if (katagori == "denda") {
            if (operator == ">") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai > denda[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == "<") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai < denda[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == "<=") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai <= denda[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            } else if (operator == ">=") {
                for (int b = 0; b < urutan; b++) {
                    if (nilai >= denda[b]) {
                        System.out.println("\nNIK        : " + nik[b]);
                        System.out.println("nama       : " + nama[b]);
                        System.out.println("gaji pokok : " + g_pokok[b]);
                        System.out.println("tunjangan  : " + tunjangan[b]);
                        System.out.println("bonus      : " + bonus[b]);
                        System.out.println("denda      : " + denda[b]);
                    }
                }
            }
        }
    }
    
}
