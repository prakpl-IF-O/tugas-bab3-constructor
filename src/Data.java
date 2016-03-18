package Tugas_2;

/**
 *
 * @author salmahnfh
 */
public class Data {
    private int[] nik={101,102,103,104,105,106,107,108,109,110};
    private String[] nama={"Paijo","Lala","Lulu","Sabar","Sule","Paiman","Ponimin","Sutiman","Raja","Harry"};
    private int [] gajiPokok={2000,1750,2150,1500,2500,1500,2000,1500,1000,2250};
    private int [] tunjangan={1000,900,1000,750,850,350,1000,1250,1000,1000};
    private int [] bonus={500,500,300,600,500,450,500,500,500,200};
    private int [] denda={200,200,375,200,300,250,200,300,200,200};
    private String[] kolom={"nik","nama","gajiPokok","tunjangan","bonus","denda"};
    
   
    public void get(){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                       DATA KESELURUHAN");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("%-8s%-12s%-15s%-15s%-10s%-10s\n","NIK","NAMA","GAJI POKOK","TUNJANGAN","BONUS","DENDA");
            for (int i = 0; i < nik.length; i++) {
                    System.out.printf("%-8s%-12s%-15d%-15d%-10d%-10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
            }
        System.out.println("*****************************************************************");
        System.out.println();
        System.out.println();
    }
    public void get(int id){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                DATA KARYAWAN DENGAN NIK " + id);
        System.out.println("-----------------------------------------------------------------");
        for (int i = 0; i < nik.length; i++) {
            if (nik[i] == id) {
                System.out.println("    Nik         : " + nik[i]);
                System.out.println("    Nama        : " + nama[i]);
                System.out.println("    Gaji Pokok  : " + gajiPokok[i]);
                System.out.println("    Tunjangan   : " + tunjangan[i]);
                System.out.println("    Bonus       : " + bonus[i]);
                System.out.println("    denda       : " + denda[i]);
            }
        }
        System.out.println("*****************************************************************");
        System.out.println();
        System.out.println();
    }
    public void get(String columnName, int value) {
        if (columnName == "tunjangan") {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("              DATA KARYAWAN DENGAN TUNJANGAN "+value);
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("%-8s%-12s%-15s%-15s%-10s%-10s\n","NIK","NAMA","GAJI POKOK","TUNJANGAN","BONUS","DENDA");
            for (int i = 0; i < tunjangan.length; i++) {
                if (tunjangan[i] == value) {
                    System.out.printf("%-8s%-12s%-15d%-15d%-10d%-10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                }
            }
        } else if (columnName == "gaji pokok") {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("            DATA KARYAWAN DENGAN GAJI POKOK "+value);
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("%-8s%-12s%-15s%-15s%-10s%-10s\n","NIK","NAMA","GAJI POKOK","TUNJANGAN","BONUS","DENDA");
            for (int i = 0; i < gajiPokok.length; i++) {
                if (gajiPokok[i] == value) {
                    System.out.printf("%-8s%-12s%-15d%-15d%-10d%-10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                }
            }
        } else if (columnName == "bonus") {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("               DATA KARYAWAN DENGAN BONUS "+value);
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("%-8s%-12s%-15s%-15s%-10s%-10s\n","NIK","NAMA","GAJI POKOK","TUNJANGAN","BONUS","DENDA");
            for (int i = 0; i < bonus.length; i++) {
                if (bonus[i] == value) {
                    System.out.printf("%-8s%-12s%-15d%-15d%-10d%-10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                }
            }
        } else if (columnName == "denda") {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("               DATA KARYAWAN DENGAN DENDA "+value);
            System.out.println("-----------------------------------------------------------------");
            System.out.printf("%-8s%-12s%-15s%-15s%-10s%-10s\n","NIK","NAMA","GAJI POKOK","TUNJANGAN","BONUS","DENDA");
            for (int i = 0; i < denda.length; i++) {
                if (denda[i] == value) {
                    System.out.printf("%-8s%-12s%-15d%-15d%-10d%-10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                }
            }
        }
        System.out.println("*****************************************************************");
        System.out.println();
        System.out.println();
    }
}
