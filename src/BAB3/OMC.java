package BAB3;

public class OMC {
    public String [] NAMA = {"Paijo",
                             "Lala",
                             "Lulu",
                             "Sabar",
                             "Sule",
                             "Paiman",
                             "Ponimin",
                             "Sutiman",
                             "Raja",
                             "Harry"};
    
    public int [][] basedata = {
        {101, 2000, 1000, 500, 200},
        {102, 1750, 900, 500, 200} ,
        {103, 2150, 1000, 300, 375},
        {104, 1500, 750, 600, 200} ,
        {105, 2500, 850, 500, 300} ,
        {106, 1500, 350, 450, 250} ,
        {107, 2000, 1000, 500, 200},
        {108, 1500, 1250, 500, 300},
        {109, 1000, 1000, 500, 200},
        {110, 2250, 1000, 200, 200}};
    
    public void get(){
        System.out.println("\t\t\t\tKESELURUHAN DATA");
        String dataawal[][] = {
            {"NIK", "Nama", "Gaji Pokok", "Tunjangan" , "Bonus", "Denda"}, 
            {"101", "Paijo"  ,    "2000"   ,    "1000"   , "500"  , "200"},
            {"102", "Lala"   ,    "1750"   ,    "900"    , "500"  , "200"},
            {"103", "Lulu"   ,    "2150"   ,    "1000"   , "300"  , "375"},
            {"104", "Sabar"  ,    "1500"   ,    "750"    , "600"  , "200"},
            {"105", "Sule"   ,    "2500"   ,    "850"    , "500"  , "300"},
            {"106", "Paiman" ,    "1500"   ,    "350"    , "450"  , "250"},
            {"107", "Ponimin",    "2000"   ,    "1000"   , "500"  , "200"},
            {"108", "Sutiman",    "1500"   ,    "1250"   , "500"  , "300"},
            {"109", "Raja"   ,    "1000"   ,    "1000"   , "500"  , "200"},
            {"110", "Harry"  ,    "2250"   ,    "1000"   , "200"  , "200"},
        };
            int a, b;
                for (a = 0; a < 11 ; a++) {
                    System.out.println("________________________________________________________________________________");
                    for (b = 0; b < 6; b++) {
                        System.out.printf("%-14s ", dataawal[a][b]);
                    }
                        System.out.println();
                }
                System.out.println(" ");
    }
    public void get(int id){
        System.out.println("\t\t\t\tDATA KARYAWAN SESUAI NIK YANG DIMINTA");
        System.out.println(" ");
        for(int y = 0 ; y < NAMA.length ; y++){
            
            if(id == basedata[y][0]){
                System.out.println("NIK             : " + basedata[y][0]);
                System.out.println("Nama            : " + NAMA    [y]   );
                System.out.println("Gaji Pokok      : " + basedata[y][1]);
                System.out.println("Tunjangan       : " + basedata[y][2]);
                System.out.println("Bonus           : " + basedata[y][3]);
                System.out.println("Denda           : " + basedata[y][4]);
            } 
        }
        System.out.println(" ");
    }
    public void get(String columnName, int value){
        System.out.println("\t\t\t\tDATA KARYAWAN SESUAI DATA YANG DIMINTA");
        System.out.println("\t\t\t\t   DATA YANG DIMINTA " +columnName+ " " +value+ " ");
        System.out.println(" ");
        System.out.printf("%s %16s %26s %23s %20s %23s \n", "NIK", "Nama" , "Gaji Pokok" , "Tunjangan" , "Bonus" , "Denda");
        int t = 0; 
        if("Denda".equalsIgnoreCase(columnName)){
            t = 4;
        }else if("Bonus".equalsIgnoreCase(columnName)){
            t = 3;
        }else if("Tunjangan".equalsIgnoreCase(columnName)){
            t = 2;
        }else if("Gaji Pokok".equalsIgnoreCase(columnName)){
            t = 1;
        }
        for(int x = 0 ; x < NAMA.length ; x++){
            if(value==basedata[x][t]){
                System.out.print(basedata[x][0]+"\t\t");
                System.out.print(NAMA[x]+"\t\t\t");
                for (int w = 1 ; w < 5 ; w++){
                    System.out.print(basedata[x][w]+"\t\t\t");
                }System.out.println();
            }
        }System.out.println("\n");
    }
    public void get(String columnName, String Op, int value){
        System.out.println("\t\t\tDATA KARYAWAN YANG DITAMPILKAN SESUAI DENGAN DATA YANG DIMINTA");
        System.out.println("\t\t\t\t    DATA YANG DIMINTA " +columnName+ " " +Op+ " " +value+ " ");
        System.out.println(" ");
        System.out.printf("%s %16s %26s %23s %20s %23s \n", "NIK" , "Nama" , "Gaji Pokok" , "Tunjangan" , "Bonus" , "Denda");
        int t = 0;
        if("Tunjangan ".equalsIgnoreCase(columnName)){
            t=2;
        }else if("Gaji Pokok".equalsIgnoreCase(columnName)){
            t=1;
        }else if("Denda".equalsIgnoreCase(columnName)){
            t=4;
        }else if("Bonus".equalsIgnoreCase(columnName)){
            t=3;
        }
        switch (Op){
            case "<":
                for(int d = 0 ; d < NAMA.length ; d++){
                    if(basedata[d][t] < value){
                        System.out.print(basedata[d][0] +"\t\t");
                        System.out.print(NAMA[d] +"\t\t\t");
                        for (int h = 1 ; h < 5 ; h++){
                            System.out.print(basedata[d][h] +"\t\t\t");
                        }System.out.println();
                    }
                }
                break;
            case "<=":
                for(int d = 0 ; d < NAMA.length ; d++){
                    if(basedata[d][t] <= value){
                        System.out.print(basedata[d][0] +"\t\t");
                        System.out.print(NAMA[d] +"\t\t\t");
                        for (int h = 1 ; h < 5 ; h++){
                            System.out.print(basedata[d][h] +"\t\t\t");
                        }System.out.println();
                    }
                }
                break;
            case ">":
                for(int d = 0 ; d < NAMA.length ; d++){
                    if(basedata[d][t] > value){
                        System.out.print(basedata[d][0] +"\t\t");
                        System.out.print(NAMA[d] +"\t\t\t");
                        for (int h = 1 ; h < 5 ; h++){
                            System.out.print(basedata[d][h] +"\t\t\t");
                        }System.out.println();
                    }
                }
                break;
            case ">=":
                for(int d = 0 ; d < NAMA.length ; d++){
                    if(basedata[d][t] >= value){
                        System.out.print(basedata[d][0] +"\t\t");
                        System.out.print(NAMA[d] +"\t\t\t");
                        for (int h = 1 ; h < 5 ; h++){
                            System.out.print(basedata[d][h] +"\t\t\t");
                        }System.out.println();
                    }
                }
                break;
        }
        System.out.println("\n");
    }
}

