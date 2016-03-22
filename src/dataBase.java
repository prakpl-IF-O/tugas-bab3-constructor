/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy Wiranto
 */
public class dataBase {

    int[] nik = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    String[] nama = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Harry"};
    int[] gajiPokok = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
    int[] tunjangan = {1000, 900, 1000, 750, 850, 350, 1000, 1250, 1000, 1000};
    int[] bonus = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200};
    int[] denda = {200, 200, 375, 200, 300, 250, 200, 300, 200, 200};

    public void get() {
        System.out.println("===========================DATA LENGKAP=====================================");

        System.out.print("NIK" + "\t\t" + nik[0] + "\t" + nik[1] + "\t" + nik[2] + "\t" + nik[3] + "\t" + nik[4] + "\t" + nik[5] + "\t" + nik[6] + "\t" + nik[7] + "\t" + nik[8] + "\t" + nik[9] + "\t\n");
        System.out.print("Nama" + "\t\t" + nama[0] + "\t" + nama[1] + "\t" + nama[2] + "\t" + nama[3] + "\t" + nama[4] + "\t" + nama[5] + "\t" + nama[6] + "\t" + nama[7] + "\t" + nama[8] + "\t" + nama[9] + "\t\n");
        System.out.print("Gaji Pokok" + "\t" + gajiPokok[0] + "\t" + gajiPokok[1] + "\t" + gajiPokok[2] + "\t" + gajiPokok[3] + "\t" + gajiPokok[4] + "\t" + gajiPokok[5] + "\t" + gajiPokok[6] + "\t" + gajiPokok[7] + "\t" + gajiPokok[8] + "\t" + gajiPokok[9] + "\t\n");
        System.out.print("Tunjangan" + "\t" + tunjangan[0] + "\t" + tunjangan[1] + "\t" + tunjangan[2] + "\t" + tunjangan[3] + "\t" + tunjangan[4] + "\t" + tunjangan[5] + "\t" + tunjangan[6] + "\t" + tunjangan[7] + "\t" + tunjangan[8] + "\t" + tunjangan[9] + "\t\n");
        System.out.print("Bonus" + "\t\t" + bonus[0] + "\t" + bonus[1] + "\t" + bonus[2] + "\t" + bonus[3] + "\t" + bonus[4] + "\t" + bonus[5] + "\t" + bonus[6] + "\t" + bonus[7] + "\t" + bonus[8] + "\t" + bonus[9] + "\t\n");
        System.out.print("Denda" + "\t\t" + denda[0] + "\t" + denda[1] + "\t" + denda[2] + "\t" + denda[3] + "\t" + denda[4] + "\t" + denda[5] + "\t" + denda[6] + "\t" + denda[7] + "\t" + denda[8] + "\t" + denda[9] + "\t\n");

        System.out.println("============================================================================");
        System.out.println("");
    }

    public void get(int nik1) {
        System.out.println("===================DATA KARYAWAN DENGAN NIK " + nik1 + "=====================");
        for (int i = 0; i < nik.length; i++) {
            if (nik[i] == nik1) {
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

    public void get(String x, int y) {

        if (x == "Tunjangan") {
            for (int i = 0; i < tunjangan.length; i++) {
                if (tunjangan[i] == y) {
                    System.out.println("Nik\t\t: " + nik[i]);
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            }
        } else if (x == "Gaji Pokok") {
            for (int i = 0; i < gajiPokok.length; i++) {
                if (gajiPokok[i] == y) {
                    System.out.println("Nik\t\t: " + nik[i]);
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            }

        } else if (x == "Bonus") {
            for (int i = 0; i < bonus.length; i++) {
                if (bonus[i] == y) {
                    System.out.println("Nik\t\t: " + nik[i]);
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            }

        } else if (x == "Denda") {
            for (int i = 0; i < denda.length; i++) {
                if (denda[i] == y) {
                    System.out.println("Nik\t\t: " + nik[i]);
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            }

        }

    }

    public void get(String x, String y, int z) {
        if (x == "Gaji Pokok") {
            if (y == ">") {
                for (int i = 0; i < gajiPokok.length; i++) {
                    if (gajiPokok[i] > z) {
                        System.out.println("DATA KARYAWAN DENGAN GAJI POKOK " + y + " " + z);
                    }
                    System.out.println("Nik\t\t: " + nik[i]);
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "<") {
                System.out.println("DATA KARYAWAN DENGAN GAJI POKOK " + y + " " + z);
                for (int i = 0; i < gajiPokok.length; i++) {
                    if (gajiPokok[i] < z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "<=") {
                System.out.println("DATA KARYAWAN DENGAN GAJI POKOK " + y + " " + z);
                for (int i = 0; i < gajiPokok.length; i++) {
                    if (gajiPokok[i] <= z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == ">=") {
                System.out.println("DATA KARYAWAN DENGAN GAJI POKOK " + y + " " + z);
                for (int i = 0; i < gajiPokok.length; i++) {
                    if (gajiPokok[i] >= z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "=") {
                System.out.println("DATA KARYAWAN DENGAN GAJI POKOK " + y + " " + z);
                for (int i = 0; i < gajiPokok.length; i++) {
                    if (gajiPokok[i] == z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            }
        } else if (x == "Tunjangan") {
            System.out.println("DATA KARYAWAN DENGAN TUNJANGAN " + y + " " + z);
            if (y == ">") {
                for (int i = 0; i < tunjangan.length; i++) {
                    if (tunjangan[i] > z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "<") {
                System.out.println("DATA KARYAWAN DENGAN TUNJANGAN " + y + " " + z);
                for (int i = 0; i < tunjangan.length; i++) {
                    if (tunjangan[i] < z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "<=") {
                System.out.println("DATA KARYAWAN DENGAN TUNJANGAN " + y + " " + z);
                for (int i = 0; i < tunjangan.length; i++) {
                    if (tunjangan[i] <= z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == ">=") {
                System.out.println("DATA KARYAWAN DENGAN TUNJANGAN " + y + " " + z);
                for (int i = 0; i < tunjangan.length; i++) {
                    if (tunjangan[i] >= z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "=") {
                System.out.println("DATA KARYAWAN DENGAN TUNJANGAN " + y + " " + z);
                for (int i = 0; i < tunjangan.length; i++) {
                    if (tunjangan[i] == z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            }
        } else if (x == "Bonus") {
            System.out.println("DATA KARYAWAN DENGAN BONUS " + y + " " + z);
            if (y == ">") {
                for (int i = 0; i < bonus.length; i++) {
                    if (bonus[i] > z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "<") {
                System.out.println("DATA KARYAWAN DENGAN BONUS " + y + " " + z);
                for (int i = 0; i < bonus.length; i++) {
                    if (bonus[i] < z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "<=") {
                System.out.println("DATA KARYAWAN DENGAN BONUS " + y + " " + z);
                for (int i = 0; i < bonus.length; i++) {
                    if (bonus[i] <= z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == ">=") {
                System.out.println("DATA KARYAWAN DENGAN BONUS " + y + " " + z);
                for (int i = 0; i < bonus.length; i++) {
                    if (bonus[i] >= z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "=") {
                System.out.println("DATA KARYAWAN DENGAN BONUS " + y + " " + z);
                for (int i = 0; i < bonus.length; i++) {
                    if (bonus[i] == z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            }
        } else if (x == "Denda") {
            System.out.println("DATA KARYAWAN DENGAN DENDA " + y + " " + z);
            if (y == ">") {
                for (int i = 0; i < denda.length; i++) {
                    if (denda[i] > z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "<") {
                System.out.println("DATA KARYAWAN DENGAN DENDA " + y + " " + z);
                for (int i = 0; i < denda.length; i++) {
                    if (denda[i] < z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "<=") {
                System.out.println("DATA KARYAWAN DENGAN DENDA " + y + " " + z);
                for (int i = 0; i < denda.length; i++) {
                    if (denda[i] <= z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == ">=") {
                System.out.println("DATA KARYAWAN DENGAN DENDA " + y + " " + z);
                for (int i = 0; i < denda.length; i++) {
                    if (denda[i] >= z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            } else if (y == "=") {
                System.out.println("DATA KARYAWAN DENGAN DENDA " + y + " " + z);
                for (int i = 0; i < denda.length; i++) {
                    if (denda[i] == z) {
                        System.out.println("Nik\t\t: " + nik[i]);
                    }
                    System.out.println("Nama\t\t: " + nama[i]);
                    System.out.println("Gaji Pokok\t: " + gajiPokok[i]);
                    System.out.println("Tunjangan\t: " + tunjangan[i]);
                    System.out.println("Bonus\t\t: " + bonus[i]);
                    System.out.println("denda\t\t: " + denda[i]);
                    System.out.println("");
                }
            }
        }
    }
}
