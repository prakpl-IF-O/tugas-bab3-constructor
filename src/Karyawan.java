public class Karyawan {
//Membuat array 1 dimensi 
    private String[] Nama={"Paijo","Lala","Lulu","Sabar","Sule","Paiman","Ponimin","Sutiman","Raja","Paijo"};
//Membuat aarray 2 dimensi    
    private int[][]DataGAJI={
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
    //Menambah method get untuk semua data
public void Data(){
    System.out.println("\t                 **Semua Data Karyawan**");
    System.out.println("");
    System.out.printf("%s %9s %17s %15s %12s %15s \n",
            "Nik","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
    //Nama
        for(int a=0;a<Nama.length;a++){
            System.out.print(DataGAJI[a][0]+"\t");
            System.out.print(Nama[a]+"\t\t");
    //Data Gaji
        for (int s=1;s<5;s++){
                System.out.print(DataGAJI[a][s]+"\t\t");
            }System.out.println();
        }System.out.println("\n");
    }
//Mencetak NIK X
public void Data(int Nik){
    System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t                     **Data Karyawan X**");
        for(int a=0;a<Nama.length;a++){
            if(Nik==DataGAJI[a][0]){
                System.out.println("Nik\t\t     : "+DataGAJI[a][0]);
                System.out.println("Nama\t\t     : "+Nama[a]);
                System.out.println("Gaji Pokok\t     : "+DataGAJI[a][1]);
                System.out.println("Tunjangan\t     : "+DataGAJI[a][2]);
                System.out.println("bonus\t\t     : "+DataGAJI[a][3]);
                System.out.println("denda\t\t     : "+DataGAJI[a][4]);
            }       
        }
}
//mencetak Gaji Pokok 1500
public void Data(String Namee, int nilai){
    System.out.println("");
    System.out.println("----------------------------------------------------------------------------");
    System.out.println("\t              **Data Karyawan Gaji 1500**");
    System.out.printf("%s %9s %17s %15s %12s %15s \n","Nik","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
    //Tambahan    
    int p = 0;
        if("Gaji Pokok".equalsIgnoreCase(Namee)){
            p=1;
        }else if("Tunjangan".equalsIgnoreCase(Namee)){
            p=2;
        }else if("Bonus".equalsIgnoreCase(Namee)){
            p=3;
        }else if("Denda".equalsIgnoreCase(Namee)){
            p=4;
}
        for(int a=0;a<Nama.length;a++){
            if(nilai==DataGAJI[a][p]){
                System.out.print(DataGAJI[a][0]+"\t");
                System.out.print(Nama[a]+"\t\t");
                for (int s=1;s<5;s++){
                    System.out.print(DataGAJI[a][s]+"\t\t");
                }System.out.println();
            }
        }System.out.println("\n");
}
//Mencetak tunjangan+denda
public void Data(String Namee, int nilai, String operator){
    System.out.println("");
    System.out.println("----------------------------------------------------------------------------");
    System.out.println("\t              **Data Karyawan Tunjangan >=1000**");
    System.out.printf("%s %9s %17s %15s %12s %15s \n","Nik","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
    int x = 0;
        if("Gaji Pokok".equalsIgnoreCase(Namee)){
            x=1;
        }else if("Tunjangan".equalsIgnoreCase(Namee)){
            x=2;
        }else if("Bonus".equalsIgnoreCase(Namee)){
            x=3;
        }else if("Denda".equalsIgnoreCase(Namee)){
            x=4;
        }
        switch (operator){
            //Kurang dari
            case "<":
                for(int a=0;a<Nama.length;a++){
                    if(DataGAJI[a][x]<nilai){
                        System.out.print(DataGAJI[a][0]+"\t");
                        System.out.print(Nama[a]+"\t\t");
                        for (int s=1;s<5;s++){
                            System.out.print(DataGAJI[a][s]+"\t\t");
                        }System.out.println();
                    }
                }
                break;
                //Kurang dari sama dengan
            case "<=":
                for(int a=0;a<Nama.length;a++){
                    if(DataGAJI[a][x]<=nilai){
                        System.out.print(DataGAJI[a][0]+"\t");
                        System.out.print(Nama[a]+"\t\t");
                        for (int s=1;s<5;s++){
                            System.out.print(DataGAJI[a][s]+"\t\t");
                        }System.out.println();
                    }
                }
                break;





}




}
}
















