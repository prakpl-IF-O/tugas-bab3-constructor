
public class Data_Karyawan {
 private String nama;  
 private int nik, Gpok, tun, bon, den;
 public Data_Karyawan (String a, int b, int c, int d, int e, int f){
     nama = a;
     nik = b;
     Gpok = c;
     tun = d;
     bon = e;
     den = f;
 }
 public String getNama (){
     return nama;
 }
 public int getNik () {
    return nik;
}
 public int getGpok(){
    return Gpok;
 }
 public int getTun (){
     return tun;
 }
 public int getBon (){
     return bon;
 }
 public int getDen (){
     return den;
 }
 public void OutputKaryawan(){
     System.out.printf("%-12s = %s \n","Nama",nama);
     System.out.printf("%-12s = %d \n","Nik",nik);
     System.out.printf("%-12s = %d \n","Gaji Pokok",Gpok);
     System.out.printf("%-12s = %d \n","Tunjangan",tun);
     System.out.printf("%-12s = %d \n","Bonus",bon);
     System.out.printf("%-12s = %d \n\n","Denda",den);

 }
}
