package Database;
public class Database { 
    public class ID {
    private int NIK [] = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    private String Nama[] = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Harry"};
    private int GajiPokok [] = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
    private int Tunjangan [] = {1000, 900, 1000, 750, 850, 350, 1000, 1250, 1000, 1000};
    private int Bonus [] = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200};
    private int Denda [] = {200, 200, 375, 200,300, 250, 200, 300, 200, 200};
    
    public void get(){
        System.out.println("\t \tDATABASE KARYAWAN \n=============================================");
        System.out.printf("%s%15s%15s%15s%15s%15s\n","NIK", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
        for (int a=0; a<NIK.length; a++){
            System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
        }System.out.println();
    }
    public void get (int ID){ //Untuk mengambil salah satu data berdasarkan id
        System.out.println("\t \tDATABASE KARYAWAN DILIHAT DARI ID\n=============================================");
        System.out.printf("%s%15s%15s%15s%15s%15s\n","NIK", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
        for (int a=0; a<NIK.length; a++){
        if (NIK[a]==ID){
                System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
        }
        }System.out.println();
    }
}
}
