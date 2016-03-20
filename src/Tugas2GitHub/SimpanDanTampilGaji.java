package Tugas2GitHub;
import java.util.ArrayList;
public class SimpanDanTampilGaji {
   ArrayList<SimpanGaji>tampung;
   public SimpanDanTampilGaji(){
       tampung= new ArrayList<SimpanGaji>();
   }
   public void isiData(String nama, int nik, int gajiPokok, int tunjangan, int bonus, int denda){
        tampung.add(new SimpanGaji(nama,nik,gajiPokok,tunjangan,bonus,denda));
    }
   public void get (){
   for (SimpanGaji a: tampung){
        a.TampilSemua();
        System.out.println("");
   }
  
   }
   
}
