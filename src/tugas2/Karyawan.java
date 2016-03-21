
package tugas2;
import java.util.ArrayList;
public class Karyawan {
    private String nama;
    private int nik,gajiPokok,tunjangan,bonus,denda;
    
    ArrayList<Karyawan>listkaryawan;
    
    public Karyawan(){
        listkaryawan= new ArrayList<Karyawan>();
    }
    
    public ArrayList<Karyawan>getAll(){
        return listkaryawan;
    }
    
    public void masukObjekkeArray(Karyawan ... z){
        for(int i =0;i<z.length;i++){
            listkaryawan.add(z[i]);
        }
    }
   
     public void get(){
        for(Karyawan total : listkaryawan ){
            System.out.println("===== DATA KARYAWAN =====");
            total.tampilData();
        }
    }
     
    public Karyawan(String nama,int den,int gapok,int nik,int bon,int tun){
        this.nama=nama;
        this.denda=den;
        this.gajiPokok=gapok;
        this.nik=nik;
        this.tunjangan=tun;
        this.bonus=bon;
    }
    
    public void tampilData(){
        System.out.println("Data Karyawaan : ");
        System.out.println("NIK : "+this.nik);
        System.out.println("Nama : "+this.nama);
        System.out.println("Gaji Pokok : "+this.gajiPokok);
        System.out.println("Tunjangan : "+this.tunjangan);
        System.out.println("Bonus : "+this.bonus);
        System.out.println("Denda : "+this.denda);
        System.out.println("======================================");
    }
    
    public void get(int x){
        System.out.println("NIK : "+x);
        System.out.println("Nama : "+this.nama);
    }
    
}
