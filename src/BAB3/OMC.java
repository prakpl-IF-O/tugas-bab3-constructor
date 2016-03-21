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
        System.out.println("\t\t\tKESELURUHAN DATA");
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
        System.out.println("\t\tDATA KARYAWAN SESUAI NIK YANG DIMINTA");
        System.out.println(" ");
        for(int y = 0 ; y < NAMA.length ; y++){
            
            if(id == basedata[y][0]){
                System.out.println("Nik             : " + basedata[y][0]);
                System.out.println("Nama            : " + NAMA    [y]   );
                System.out.println("Gaji Pokok      : " + basedata[y][4]);
                System.out.println("Tunjangan       : " + basedata[y][3]);
                System.out.println("Bonus           : " + basedata[y][2]);
                System.out.println("Denda           : " + basedata[y][1]);
            } 
        }
        System.out.println(" ");
    }
}

