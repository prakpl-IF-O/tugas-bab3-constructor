package github2;
public class data {
    private String[] nama={"Paijo","Lala","Lulu","Sabar","Sule","Paiman","Ponimin","Sutiman","Raja","Paijo"};
    private int[][] database={
        {101, 2000, 1000, 500, 200},
        {102, 1750, 900, 500, 200},
        {103, 2150, 1000, 300, 375},
        {104, 1500, 750, 600, 200},
        {105, 2500, 850, 500, 300},
        {106, 1500, 350, 450, 250},
        {107, 2000, 1000, 500, 200},
        {108, 1500, 1250, 500, 300},
        {109, 1000, 1000, 500, 200},
        {110, 2250, 1000, 200, 200}
    };
    public void get(){
        System.out.println("**********************************************************************************");
        System.out.println("******************************MENAMPILKAN SEMUA DATA******************************");
        System.out.println("**********************************************************************************");
        System.out.printf("%s %9s %17s %15s %12s %15s \n","Nik","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
        for(int i=0;i<nama.length;i++){
            System.out.print(database[i][0]+"\t");
            System.out.print(nama[i]+"\t\t");
            for (int j=1;j<5;j++){
                System.out.print(database[i][j]+"\t\t");
            }System.out.println();
        }System.out.println("\n");
    }
    public void get(int id){
        System.out.println("***********DATA KARYAWAN BERDASARKAN NIK "+id+"***********");
        for(int i=0;i<nama.length;i++){
            if(id==database[i][0]){
                System.out.println("Nik\t\t: "+database[i][0]);
                System.out.println("Nama\t\t: "+nama[i]);
                System.out.println("Gaji Pokok\t: "+database[i][1]);
                System.out.println("Tunjangan\t: "+database[i][2]);
                System.out.println("bonus\t\t: "+database[i][3]);
                System.out.println("denda\t\t: "+database[i][4]);
            }
        }System.out.println("\n");
    }
    public void get(String columnName, int value){
        System.out.println("********************Data Karyawan dengan "+columnName+" "+value+"********************\n");
        System.out.printf("%s %9s %17s %15s %12s %15s \n","Nik","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
        int k = 0;
        if("Gaji Pokok".equalsIgnoreCase(columnName)){
            k=1;
        }else if("Tunjangan".equalsIgnoreCase(columnName)){
            k=2;
        }else if("Bonus".equalsIgnoreCase(columnName)){
            k=3;
        }else if("Denda".equalsIgnoreCase(columnName)){
            k=4;
        }
        for(int i=0;i<nama.length;i++){
            if(value==database[i][k]){
                System.out.print(database[i][0]+"\t");
                System.out.print(nama[i]+"\t\t");
                for (int j=1;j<5;j++){
                    System.out.print(database[i][j]+"\t\t");
                }System.out.println();
            }
        }System.out.println("\n");
    }
    public void get(String columnName, String operator, int value){
        System.out.println("********************Data Karyawan dengan "+columnName+" "+operator+" "+value+"********************\n");
        System.out.printf("%s %9s %17s %15s %12s %15s \n","Nik","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
        int m = 0;
        if("Gaji Pokok".equalsIgnoreCase(columnName)){
            m=1;
        }else if("Tunjangan".equalsIgnoreCase(columnName)){
            m=2;
        }else if("Bonus".equalsIgnoreCase(columnName)){
            m=3;
        }else if("Denda".equalsIgnoreCase(columnName)){
            m=4;
        }
        switch (operator){
            case "<":
                for(int i=0;i<nama.length;i++){
                    if(database[i][m]<value){
                        System.out.print(database[i][0]+"\t");
                        System.out.print(nama[i]+"\t\t");
                        for (int j=1;j<5;j++){
                            System.out.print(database[i][j]+"\t\t");
                        }System.out.println();
                    }
                }
                break;
            case "<=":
                for(int i=0;i<nama.length;i++){
                    if(database[i][m]<=value){
                        System.out.print(database[i][0]+"\t");
                        System.out.print(nama[i]+"\t\t");
                        for (int j=1;j<5;j++){
                            System.out.print(database[i][j]+"\t\t");
                        }System.out.println();
                    }
                }
                break;
            case ">":
                for(int i=0;i<nama.length;i++){
                    if(database[i][m]>value){
                        System.out.print(database[i][0]+"\t");
                        System.out.print(nama[i]+"\t\t");
                        for (int j=1;j<5;j++){
                            System.out.print(database[i][j]+"\t\t");
                        }System.out.println();
                    }
                }
                break;
            case ">=":
                for(int i=0;i<nama.length;i++){
                    if(database[i][m]>=value){
                        System.out.print(database[i][0]+"\t");
                        System.out.print(nama[i]+"\t\t");
                        for (int j=1;j<5;j++){
                            System.out.print(database[i][j]+"\t\t");
                        }System.out.println();
                    }
                }
                break;
        }
    }
}
