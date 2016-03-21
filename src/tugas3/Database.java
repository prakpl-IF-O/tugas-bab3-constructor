package tugas3;
    public class Database {
    private int NIK [] = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    private String Nama[] = {"Paijo", "Lala", "Lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Harry"};
    private int GajiPokok [] = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
    private int Tunjangan [] = {1000, 900, 1000, 750, 850, 350, 1000, 1250, 1000, 1000};
    private int Bonus [] = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200};
    private int Denda [] = {200, 200, 375, 200,300, 250, 200, 300, 200, 200};
    
    public void get(){ 
        System.out.println("");
        System.out.println("\t \t \t \tDATABASE KARYAWAN");
        System.out.println("");
        System.out.printf("%s%15s%15s%15s%15s%15s\n","NIK", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
        for (int a=0; a<NIK.length; a++){
            System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
        }System.out.println();
    }
    public void get (int ID){ //Untuk mengambil salah satu data berdasarkan id
        System.out.println("");
        System.out.println("\t \t \tDATABASE KARYAWAN DILIHAT DARI ID");
        System.out.println("");
        System.out.printf("%s%15s%15s%15s%15s%15s\n","NIK", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
        for (int a=0; a<NIK.length; a++){
        if (NIK[a]==ID){
                System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
        }
        }System.out.println();
        System.out.println();
        System.out.println();
    }
    public void get(String kolom, int hasil){
        System.out.println("");
        System.out.println("\t \tDATA KARYAWAN BERDASARKAN "+kolom+" "+hasil);
        System.out.println("");
        System.out.printf("%s%15s%15s%15s%15s%15s\n","NIK", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");
        if (kolom.equalsIgnoreCase("Gaji Pokok")){
           for (int a=0; a<NIK.length; a++){
                if (GajiPokok[a]==hasil){
                System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                }
        }
        }
        else if (kolom.equalsIgnoreCase("Tunjangan")){
            for (int a=0; a<NIK.length; a++){
                if (Tunjangan[a]==hasil){
                System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
            }
        }
        }
        else if (kolom.equalsIgnoreCase("Bonus")){
            for (int a=0; a<NIK.length; a++){
                if (Bonus[a]==hasil){
                System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
            }
        }
        }
        else if (kolom.equalsIgnoreCase("Denda")){
            for (int a=0; a<NIK.length; a++){
                if (Denda[a]==hasil){
                System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
            }
        }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
   }
    public void get(String kolom, String operasi, int hasil){
        System.out.println("");
        System.out.println("\t \t DATA KARYAWAN BERDASARKAN "+kolom+" "+operasi+" "+hasil);
        System.out.println("");
        System.out.printf("%s%15s%15s%15s%15s%15s\n","NIK", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda");        
        switch (operasi){
            case "KURANG DARI ATAU SAMA DENGAN":
                if (kolom.equalsIgnoreCase("Gaji Pokok")){
                    for (int a=0; a<NIK.length; a++){
                        if (GajiPokok[a]<=hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                }
                }
                else if (kolom.equalsIgnoreCase("Tunjangan")){
                    for (int a=0; a<NIK.length; a++){
                        if (Tunjangan[a]<=hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                }
                }
                else if (kolom.equalsIgnoreCase("Bonus")){
                    for (int a=0; a<NIK.length; a++){
                        if (Bonus[a]<=hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                }
                }
                else if (kolom.equalsIgnoreCase("Denda")){
                    for (int a=0; a<NIK.length; a++){
                        if (Denda[a]<=hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                }
                }break;
            case "LEBIH DARI ATAU SAMA DENGAN":
                if (kolom.equalsIgnoreCase("Gaji Pokok")){
                    for (int a=0; a<NIK.length; a++){
                        if (GajiPokok[a]>=hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }
                else if (kolom.equalsIgnoreCase("Tunjangan")){
                    for (int a=0; a<NIK.length; a++){
                        if (Tunjangan[a]>=hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }
                else if (kolom.equalsIgnoreCase("Bonus")){
                    for (int a=0; a<NIK.length; a++){
                        if (Bonus[a]>=hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }
                else if (kolom.equalsIgnoreCase("Denda")){
                    for (int a=0; a<NIK.length; a++){
                        if (Denda[a]>=hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }break;
            case "KURANG DARI":
                if (kolom.equalsIgnoreCase("Gaji Pokok")){
                    for (int a=0; a<NIK.length; a++){
                        if (GajiPokok[a]<hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }
                else if (kolom.equalsIgnoreCase("Tunjangan")){
                    for (int a=0; a<NIK.length; a++){
                        if (Tunjangan[a]<hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }
                else if (kolom.equalsIgnoreCase("Bonus")){
                    for (int a=0; a<NIK.length; a++){
                        if (Bonus[a]<hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }
                else if (kolom.equalsIgnoreCase("Denda")){
                   for (int a=0; a<NIK.length; a++){
                        if (Denda[a]<hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }break;
            case "LEBIH DARI":
                if (kolom.equalsIgnoreCase("Gaji Pokok")){
                    for (int a=0; a<NIK.length; a++){
                        if (GajiPokok[a]>hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }
                else if (kolom.equalsIgnoreCase("Tunjangan")){
                    for (int a=0; a<NIK.length; a++){
                        if (Tunjangan[a]>hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }
                else if (kolom.equalsIgnoreCase("Bonus")){
                    for (int a=0; a<NIK.length; a++){
                        if (Bonus[a]>hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }
                else if (kolom.equalsIgnoreCase("Denda")){
                    for (int a=0; a<NIK.length; a++){
                        if (Denda[a]>hasil){
                        System.out.printf("%d%15s%15d%15d%15d%15d\n",NIK[a],Nama[a],GajiPokok[a],Tunjangan[a],Bonus[a],Denda[a]);
                        }
                    }
                }break;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}

