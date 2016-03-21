
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heryan
 */
public class main {
     public static void main(String[] args) {
        Scanner masukan=new Scanner(System.in);
        data db=new data();
        int menu=0; int batas;
        String menus;
        do{
        System.out.println("Menu");
        System.out.println("1. Lihat Data Pegawai");
        System.out.println("2. Cari daftar yang sama dengan n");
        System.out.println("3. Cari daftar yang berbeda dengan n");
        System.out.println("4. Keluar");
        System.out.print("Pilih : ");
        menu=masukan.nextInt();
        
    }
}
