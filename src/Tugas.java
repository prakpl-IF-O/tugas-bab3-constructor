package overloading;

public class Tugas {
    private int nik [] = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    private String nama[] = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Harry"};
    private int gajiPokok [] = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
    private int tunjangan [] = {1000, 900, 1000, 750, 850, 350, 1000, 1250, 1000, 1000};
    private int bonus [] = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200};
    private int denda [] = {200, 200, 375, 200,300, 250, 200, 300, 200, 200};

    public void get(){
        System.out.println("---------------------------------------------");
        System.out.println("                DATA KARYAWAN");
        System.out.println("=============================================");
        System.out.printf("%s%10s%15s%15s%10s%10s\n","NIK", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
        for (int i=0; i<nik.length; i++){
            System.out.printf("%d%10s%15d%15d%10d%10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");    
    }
    
   public void get (int id){
        System.out.println("---------------------------------------------");
        System.out.println("          DATA KARYAWAN BERDASARKAN ID");
        System.out.println("==============================================");
        System.out.printf("%s%10s%15s%15s%10s%10s\n","NIK", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
        for (int i=0; i<nik.length; i++){
        if (nik[i]==id){
                System.out.printf("%d%10s%15d%15d%10d%10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
        }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
   
   public void get(String columnName, int value){
        System.out.println("---------------------------------------------");
        System.out.println("  DATA KARYAWAN BERDASARKAN "+columnName+" "+value);
        System.out.println("==============================================");
        if (columnName.equalsIgnoreCase("gaji pokok")){
            for (int i=0; i<nik.length; i++){
                if (gajiPokok[i]==value){
                System.out.printf("%d%10s%15d%15d%10d%10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                }
        }
        }
        else if (columnName.equalsIgnoreCase("tunjangan")){
            for (int i=0; i<nik.length; i++){
                if (tunjangan[i]==value){
                System.out.printf("%d%10s%15d%15d%10d%10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
            }
            }
        }
        else if (columnName.equalsIgnoreCase("bonus")){
            for (int i=0; i<nik.length; i++){
                if (bonus[i]==value){
                System.out.printf("%d%10s%15d%15d%10d%10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
            }
            }
        }
        else if (columnName.equalsIgnoreCase("denda")){
            for (int i=0; i<nik.length; i++){
                if (denda[i]==value){
                System.out.printf("%d%10s%15d%15d%10d%10d\n",nik[i],nama[i],gajiPokok[i],tunjangan[i],bonus[i],denda[i]);
                }
        }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
   }
}
