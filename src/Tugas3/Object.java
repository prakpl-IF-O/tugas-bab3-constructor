package Tugas3;
import java.util.ArrayList;
public class Object {
    ArrayList<ClassObject> b;
    public Object(){
        b=new ArrayList<ClassObject>();
        
    
    }
    public void Data(String NIK,String Nama,double GajiPokok,double Tunjangan,double Bonus,double Denda){
    b.add(new ClassObject(NIK,Nama,GajiPokok,Tunjangan,Bonus,Denda));
    
    }
            
}
