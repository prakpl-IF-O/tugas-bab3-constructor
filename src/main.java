
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
            System.out.println("---------------------------");
        System.out.print("Pilih : ");
        menu=masukan.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("");
                db.get(); break;
            case 2:
                System.out.println("");
                System.out.println("Masukan Pilihan");
                System.out.println("1. gaji Pokok");
                System.out.println("2. Tunjangan");
                System.out.println("3. Bonus");
                System.out.println("4. Denda");
                System.out.print("Pilih : ");
                menus=masukan.next();
                System.out.print("Masukan batas angka : ");
                batas=masukan.nextInt();
                db.get(menus, batas); break;
            case 3:
                System.out.println("");
                System.out.println("Masukan Pilihan");
                System.out.println("1. gaji Pokok");
                System.out.println("2. Tunjangan");
                System.out.println("3. Bonus");
                System.out.println("4. Denda");
                System.out.print("Pilih : ");
                menus=masukan.next();
                System.out.println("Masukan Operator (<,<=,>,>=)");
                String operator=masukan.next();
                System.out.print("Masukan batas angka : ");
                batas=masukan.nextInt();
                db.get(menus, operator, batas); break;
            case 4:
                break;
            default:
                System.out.println("Perintah Tidak di Temukan");
        }
        
        
        
    }while(menu!=4);
}
}        
    

