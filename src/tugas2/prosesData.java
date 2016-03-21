
package tugas2;

import java.util.ArrayList;
public class prosesData {
    ArrayList<Karyawan>listkaryawan;
    public prosesData(){
        listkaryawan=new ArrayList<Karyawan>();   
    }
    
    public void setObjecttoArray(String nama,int den,int gapok,int nik,int bon,int tun){
       listkaryawan.add(new Karyawan(nama,den,gapok,nik,bon,tun)); 
    }
    
    public void get(){
        for(Karyawan total:listkaryawan){
           total.tampilData();
        }
    }
    
    public void get(int nik){
        for(Karyawan nomor:listkaryawan){
            if(nomor.getNik()==nik){
               nomor.tampilData();
            } 
        }
    }
    
    
}
