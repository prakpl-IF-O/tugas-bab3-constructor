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
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
        Data k = new Data();
        String l = "Gaji", m = "Tunjangan", n = "Bonus", o = "Denda", 
                a = ">", b = "<", c = ">=", d = "<=";
        for (int i = 0;; i++) {
            System.out.println("MENU........");
            System.out.println("1. Tampilkan seluruh data");
            System.out.println("2. Tampilkan data berdasarkan ID");
            System.out.println("3. Tampilkan data berdasarkan KOLOM dan VALUE");
            System.out.println("4. Tampilkan data berdasarkan KOLOM, OPERATOR dan VALUE");
            System.out.print("MASUKKAN PILIHAN...|| ");
            int pilihan = in.nextInt();
            if (pilihan == 1) {
                k.get();
            } else if (pilihan == 2) {
                System.out.print("Masukkan ID : ");
                int id = in.nextInt();
                k.get(id);
            } else if (pilihan == 3) {
                System.out.printf("%s\n%s\n%s\n%s\n", "|| 1. Gaji      ||", "|| 2. Tunjangan ||", "|| 3. Bonus     ||", "|| 4. Denda     ||");
                System.out.print("Pilih Kolom   : ");
                int pil = in.nextInt();
                String kol = null;
                if (pil == 1) {
                    kol = l;
                } else if (pil == 2) {
                    kol = m;
                } else if (pil == 3) {
                    kol = n;
                } else if (pil == 4) {
                    kol = o;
                }
                System.out.print("Masukkan Value : ");
                int val = in.nextInt();
                k.get(kol, val);
            } else if (pilihan == 4) {
                System.out.printf("%s\n%s\n%s\n%s\n", "|| 1. Gaji      ||", "|| 2. Tunjangan ||", "|| 3. Bonus     ||", "|| 4. Denda     ||");
                System.out.print("Pilih Kolom   : ");
                int pil = in.nextInt();
                String kol = null, op = null;
                if (pil == 1) {
                    kol = l;
                } else if (pil == 2) {
                    kol = m;
                } else if (pil == 3) {
                    kol = n;
                } else if (pil == 4) {
                    kol = o;
                }
                System.out.printf("%s\n%s\n%s\n%s\n", "|| 1. > ||", "|| 2. < ||", "|| 3. >= ||", "|| 4. <= ||");
                System.out.print("Pilih Operator : ");
                int pill = in.nextInt();
                if (pill == 1) {
                    op = a;
                } else if (pill == 2) {
                    op = b;
                } else if (pill == 3) {
                    op = c;
                } else if (pill == 4) {
                    op = d;
                }
                System.out.print("Masukkan Value : ");
                int val = in.nextInt();
                k.get(kol, op, val);
            } else {
                System.err.println("Pilihan yang anda masukkan salah...");
                break;
            }
        }
    }
}
