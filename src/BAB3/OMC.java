package BAB3;

public class OMC {
    public void awal(){
        String [][] dataawal ={
            {"NIK", "Nama"   , "Gaji Pokok", "Tunjangan" , "Bonus", "Denda"},
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
                System.out.println("\tKESELURUHAN DATA");
            //mendeklarasikan baris dan kolom
            int y,z;
            for (y = 0 ; y < 11 ; y++){
                for(z = 0 ; z < 6 ; z++){
                    System.out.print(dataawal[y][z] + ",");
                }
                    System.out.println(" ");
            }
        }   
}

