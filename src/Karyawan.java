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
public void get(){
    System.out.println("\t                 **Semua Data Karyawan**");
    System.out.println("");
    System.out.printf("%s %9s %17s %15s %12s %15s \n",
    "NO","Nik","Nama","Gaji Pokok","Tunjangan","Bonus","Denda");
    //Nama
        for(int i=0;i<Nama.length;i++){
            System.out.print(DataGAJI[i][0]+"\t");
            System.out.print(Nama[i]+"\t\t");
    //Data Gaji
        for (int j=1;j<5;j++){
                System.out.print(DataGAJI[i][j]+"\t\t");
            }System.out.println();
        }System.out.println("\n");
    }














}

