/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_3;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zyref
 */
public class Tugas_3 {

    private String[] Nama = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Paijo"};

    private int[][] gaji = {
        {101, 2000, 1000, 500, 200},
        {102, 1750, 900, 500, 200},
        {103, 2150, 1000, 300, 375},
        {104, 1500, 750, 600, 200},
        {105, 2500, 850, 500, 300},
        {106, 1500, 350, 450, 250},
        {107, 2000, 1000, 500, 200},
        {108, 1500, 1250, 500, 300},
        {109, 1000, 1000, 500, 200},
        {110, 2250, 1000, 200, 200}
    };

    public void Datagaji() {
        System.out.println("   DATA KARYAWAN   ");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.printf("%s %9s %17s %15s %12s %15s \n", "Nik", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");

        for (int a = 0; a < Nama.length; a++) {
            System.out.print(gaji[a][0] + "\t");
            System.out.print(Nama[a] + "\t\t");

            for (int s = 1; s < 5; s++) {
                System.out.print(gaji[a][s] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public void DataX(int Nik) {
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Data Karyawan dengan NIK X");
        for (int a = 0; a < Nama.length; a++) {
            if (Nik == gaji[a][0]) {
                System.out.println("Nik        : " + gaji[a][0]);
                System.out.println("Nama       : " + Nama[a]);
                System.out.println("Gaji Pokok : " + gaji[a][1]);
                System.out.println("Tunjangan  : " + gaji[a][2]);
                System.out.println("Bonus      : " + gaji[a][3]);
                System.out.println("Denda      : " + gaji[a][4]);
            }
        }
    }

    public void gaji1500(String Name, int nilai) {
        System.out.println("=======================================================");
        System.out.println(" karyawan dengan gaji 1500");
        System.out.printf("%s %9s %17s %15s %12s %15s \n", "Nik", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
        int p = 0;
        if ("Gaji Pokok".equalsIgnoreCase(Name)) {
            p = 1;
        } else if ("Tunjangan".equalsIgnoreCase(Name)) {
            p = 2;
        } else if ("Bonus".equalsIgnoreCase(Name)) {
            p = 3;
        } else if ("Denda".equalsIgnoreCase(Name)) {
            p = 4;
        }
        for (int a = 0; a < Nama.length; a++) {
            if (nilai == gaji[a][p]) {
                System.out.print(gaji[a][0] + "\t");
                System.out.print(Nama[a] + "\t\t");
                for (int s = 1; s < 5; s++) {
                    System.out.print(gaji[a][s] + "\t\t");
                }
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    public void Data(String name, String operator, int nilai) {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t              **Data Karyawan " + name + " " + operator + " " + nilai + "**");
        System.out.printf("%s %9s %17s %15s %12s %15s \n", "Nik", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
        int x = 0;
        if ("Gaji Pokok".equalsIgnoreCase(name)) {
            x = 1;
        } else if ("Tunjangan".equalsIgnoreCase(name)) {
            x = 2;
        } else if ("Bonus".equalsIgnoreCase(name)) {
            x = 3;
        } else if ("Denda".equalsIgnoreCase(name)) {
            x = 4;
        }
        switch (operator) {

            case "<":
                for (int a = 0; a < Nama.length; a++) {
                    if (gaji[a][x] < nilai) {
                        System.out.print(gaji[a][0] + "\t");
                        System.out.print(Nama[a] + "\t\t");
                        for (int s = 1; s < 5; s++) {
                            System.out.print(gaji[a][s] + "\t\t");
                        }

                    }
                }
                break;

            case "<=":
                for (int a = 0; a < Nama.length; a++) {
                    if (gaji[a][x] <= nilai) {
                        System.out.print(gaji[a][0] + "\t");
                        System.out.print(Nama[a] + "\t\t");
                        for (int s = 1; s < 5; s++) {
                            System.out.print(gaji[a][s] + "\t\t");
                        }
                        System.out.println();
                    }
                }
                break;

            case ">":
                for (int a = 0; a < Nama.length; a++) {
                    if (gaji[a][x] > nilai) {
                        System.out.print(gaji[a][0] + "\t");
                        System.out.print(Nama[a] + "\t\t");
                        for (int s = 1; s < 5; s++) {
                            System.out.print(gaji[a][s]+"\t\t");
                        }
                        System.out.println();
                    }
                }
                break;
            case ">=":
                for (int a = 0; a < Nama.length; a++) {
                    if (gaji[a][x] >= nilai) {
                        System.out.print(gaji[a][0]+"\t");
                        System.out.print(Nama[a]+"\t\t");
                        for (int s = 1; s < 5; s++) {
                            System.out.print(gaji[a][s]+"\t\t");
                        }
                        System.out.println();
                    }
                }
                break;
        }

    }
}
