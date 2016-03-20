/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.util.ArrayList;

/**
 *
 * @author dwiyan
 */
public class DataPegawai {

    ArrayList<Pegawai> dataPegawai;

    public DataPegawai() {
        dataPegawai = new ArrayList();
    }

    public void tambahData(String nama, String nik, int gaji, int tunjangan, int bonus, int denda) {
        Pegawai pgw = new Pegawai(nama, nik, gaji, tunjangan, bonus, denda);
        dataPegawai.add(pgw);
    }

    public void get() {
        for (Pegawai pegawai : dataPegawai) {
            System.out.println("================================");
            System.out.println("Nama\t\t:" + pegawai.getNama());
            System.out.println("NIK\t\t:" + pegawai.getNik());
            System.out.println("Gaji Pokok\t:" + pegawai.getGajiPokok());
            System.out.println("Tunjangan\t:" + pegawai.getTunjangan());
            System.out.println("Bonus\t\t:" + pegawai.getBonus());
            System.out.println("Denda\t\t:" + pegawai.getDenda());

        }

    }

    public void get(String a) {
        for (Pegawai pegawai : dataPegawai) {
            if (pegawai.getNik() == a) {
                System.out.println("================================");
                System.out.println("Nama\t\t:" + pegawai.getNama());
                System.out.println("NIK\t\t:" + pegawai.getNik());
                System.out.println("Gaji Pokok\t:" + pegawai.getGajiPokok());
                System.out.println("Tunjangan\t:" + pegawai.getTunjangan());
                System.out.println("Bonus\t\t:" + pegawai.getBonus());
                System.out.println("Denda\t\t:" + pegawai.getDenda());
            }
        }
    }

    public void get(String a, int b) {
        for (Pegawai pegawai : dataPegawai) {
            if (a.equalsIgnoreCase("Tunjangan")) {
                if (pegawai.getTunjangan() == b) {
                    System.out.println("================================");
                    System.out.println("Nama\t\t:" + pegawai.getNama());
                    System.out.println("NIK\t\t:" + pegawai.getNik());
                    System.out.println("Gaji Pokok\t:" + pegawai.getGajiPokok());
                    System.out.println("Tunjangan\t:" + pegawai.getTunjangan());
                    System.out.println("Bonus\t\t:" + pegawai.getBonus());
                    System.out.println("Denda\t\t:" + pegawai.getDenda());
                }
            } else if (a.equalsIgnoreCase("GajiPokok")) {
                if (pegawai.getGajiPokok() == b) {
                    System.out.println("================================");
                    System.out.println("Nama\t\t:" + pegawai.getNama());
                    System.out.println("NIK\t\t:" + pegawai.getNik());
                    System.out.println("Gaji Pokok\t:" + pegawai.getGajiPokok());
                    System.out.println("Tunjangan\t:" + pegawai.getTunjangan());
                    System.out.println("Bonus\t\t:" + pegawai.getBonus());
                    System.out.println("Denda\t\t:" + pegawai.getDenda());
                }
            }
        }

    }
}
