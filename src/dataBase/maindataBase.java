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
import java.util.Scanner;

public class maindataBase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        dataBase a = new dataBase();
        String b = "gaji", c = "tunjangan", d = "bonus", e = "denda", f = ">", g = "<", h = ">=", j = "<=";
        for (int i = 0;; i++) {
            System.out.println("MENU........");
            System.out.println("1. Tampilkan seluruh data");
            System.out.println("2. Tampilkan data berdasarkan ID");
            System.out.println("3. Tampilkan data berdasarkan KOLOM dan VALUE");
            System.out.println("4. Tampilkan data berdasarkan KOLOM, OPERATOR dan VALUE");
            System.out.print("MASUKKAN PILIHAN...|| ");
            int pilihan = in.nextInt();
            if (pilihan == 1) {
                a.get();
            } else if (pilihan == 2) {
                System.out.print("Masukkan ID : ");
                int id = in.nextInt();
                a.get(id);
            } else if (pilihan == 3) {
                System.out.printf("%s\n%s\n%s\n%s\n", "|| 1. Gaji      ||", "|| 2. Tunjangan ||", "|| 3. Bonus     ||", "|| 4. Denda     ||");
                System.out.print("Pilih Kolom   : ");
                int pil = in.nextInt();
                String kol = null;
                if (pil == 1) {
                    kol = b;
                } else if (pil == 2) {
                    kol = c;
                } else if (pil == 3) {
                    kol = d;
                } else if (pil == 4) {
                    kol = e;
                }
                System.out.print("Masukkan Value : ");
                int val = in.nextInt();
                a.get(kol, val);
            } else if (pilihan == 4) {
                System.out.printf("%s\n%s\n%s\n%s\n", "|| 1. Gaji      ||", "|| 2. Tunjangan ||", "|| 3. Bonus     ||", "|| 4. Denda     ||");
                System.out.print("Pilih Kolom   : ");
                int pil = in.nextInt();
                String kol = null, op = null;
                if (pil == 1) {
                    kol = b;
                } else if (pil == 2) {
                    kol = c;
                } else if (pil == 3) {
                    kol = d;
                } else if (pil == 4) {
                    kol = e;
                }
                System.out.printf("%s\n%s\n%s\n%s\n", "|| 1. > ||", "|| 2. < ||", "|| 3. >= ||", "|| 4. <= ||");
                System.out.print("Pilih Operator : ");
                int pill = in.nextInt();
                if (pill == 1) {
                    op = f;
                } else if (pill == 2) {
                    op = g;
                } else if (pill == 3) {
                    op = h;
                } else if (pill == 4) {
                    op = j;
                }
                System.out.print("Masukkan Value : ");
                int val = in.nextInt();
                a.get(kol, op, val);
            } else {
                System.err.println("Pilihan yang anda masukkan salah...");
                break;
            }
        }
    }
}
