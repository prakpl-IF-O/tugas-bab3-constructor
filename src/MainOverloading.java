/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy Wiranto
 */
public class MainOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("SISTEM INFORMASI KARYAWAN PT MARUK JAYA");
        System.out.println("");
        dataBase db = new dataBase();
        db.get();
        db.get(103);
        db.get("Gaji", 2000);
        db.get("Tunjangan", "<=", 1000);
        db.get("Bonus", ">", 450);
        db.get("Denda", ">", 200);

    }
}