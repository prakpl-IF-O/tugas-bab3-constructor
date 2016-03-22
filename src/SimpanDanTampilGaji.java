package Tugas2GitHub;

import java.util.ArrayList;

public class SimpanDanTampilGaji {

    ArrayList<SimpanGaji> tampung;

    public SimpanDanTampilGaji() {
        tampung = new ArrayList<SimpanGaji>();
    }

    public void isiData(String nama, int nik, int gajiPokok, int tunjangan, int bonus, int denda) {
        tampung.add(new SimpanGaji(nama, nik, gajiPokok, tunjangan, bonus, denda));
    }

    public void get() {
        for (SimpanGaji a : tampung) {
            a.TampilSemua();
            System.out.println("");
        }
    }

    public void get(int a) {
        for (SimpanGaji b : tampung) {
            if (b.getNik() == a) {
                b.TampilSemua();
                System.out.println("");
            }
        }
    }
    
    public void get(String a, String b, int c) {
        for (SimpanGaji x : tampung) {
             if (a.equalsIgnoreCase("tunjangan")&&b.equalsIgnoreCase(">=")){
                if(x.getTunjangan()>=c){
                   x.TampilSemua();
                    System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("tunjangan")&&b.equalsIgnoreCase(">")){
                if(x.getTunjangan()>c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("tunjangan")&&b.equalsIgnoreCase("<")){
                if(x.getTunjangan()<c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("tunjangan")&&b.equalsIgnoreCase("<=")){
                if(x.getTunjangan()<=c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("gaji pokok")&&b.equalsIgnoreCase(">=")){
                if(x.getTunjangan()>=c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("gaji pokok")&&b.equalsIgnoreCase(">")){
                if(x.getTunjangan()>c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("gaji pokok")&&b.equalsIgnoreCase("<")){
                if(x.getTunjangan()<c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("gaji pokok")&&b.equalsIgnoreCase("<=")){
                if(x.getTunjangan()<=c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("bonus")&&b.equalsIgnoreCase(">=")){
                if(x.getTunjangan()>=c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("bonus")&&b.equalsIgnoreCase(">")){
                if(x.getTunjangan()>c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("bonus")&&b.equalsIgnoreCase("<")){
                if(x.getTunjangan()<c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("bonus")&&b.equalsIgnoreCase("<=")){
                if(x.getTunjangan()<=c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("denda")&&b.equalsIgnoreCase(">=")){
                if(x.getTunjangan()>=c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("denda")&&b.equalsIgnoreCase(">")){
                if(x.getTunjangan()>c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("denda")&&b.equalsIgnoreCase("<")){
                if(x.getTunjangan()<c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
             else if (a.equalsIgnoreCase("denda")&&b.equalsIgnoreCase("<=")){
                if(x.getTunjangan()<=c){
                   x.TampilSemua();
                   System.out.println("");
                }
             }
        }
    }
}