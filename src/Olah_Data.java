//Bismilah
import java.util.ArrayList;
public class Olah_Data {
    ArrayList <Data_Karyawan> Karyawan;
    public Olah_Data(){
     Karyawan = new ArrayList<Data_Karyawan>();
    } 
    public void IsiDataKaryawan (Data_Karyawan ... x){
        for (int i = 0; i<x.length;i++)
        Karyawan.add(x[i]);
    }
    public void get(){
        for (Data_Karyawan semua : Karyawan) {
            semua.OutputKaryawan();
        }
    } 
    public void get(int nik){
        for (Data_Karyawan sama : Karyawan) {
            if (sama.getNik() == nik){
                sama.OutputKaryawan();
            }
        }
    }
    public void get (String apa, int nilai){
        for (Data_Karyawan cek : Karyawan) {
            switch (apa) {
                case "Gaji Pokok" : if (nilai == cek.getGpok()){
                    cek.OutputKaryawan();
                } break;
                case "Tunjangan" : if (nilai == cek.getTun()){
                    cek.OutputKaryawan();
                } break;
                case "Bonus" : if (nilai == cek.getBon()){
                    cek.OutputKaryawan();
                } break;
                case "Denda" : if (nilai == cek.getDen()){
                    cek.OutputKaryawan();
                } break;
            }
        }
    }
    
}
