package bab3;
import java.util.ArrayList;
public class MainClassssss {

    public static void main(String[] args) {
        
        System.out.println("SELAMAT DATANG DI SISTEM INFORMASI KARYAWAN PT FILKOM");
        System.out.println("");
        Database data_ = new Database();
        data_.get();
        data_.get(103);
        data_.get("DENDA", ">", 200);
        data_.get("TUNJANGAN", "<=", 1000);
        data_.get("BONUS", ">", 450);
        data_.get("GAJI", 2000);
    }
}
    
    

