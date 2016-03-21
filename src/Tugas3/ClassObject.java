package Tugas3;
public class ClassObject {
    private String nik;
    private String nama;
    private double gaji_pokok;
    private double tunjangan;
    private double bonus;
    private double denda; 
    
    public ClassObject(){
    
    }
    
    public ClassObject(String NIK,String Nama,double GajiPokok,double Tunjangan,double Bonus,double Denda){
    this.nik=NIK;
    this.nama=Nama;
    this.gaji_pokok=GajiPokok;
    this.tunjangan=Tunjangan;
    this.bonus=Bonus;
    this.denda=Denda; 
    }
}
