package Tugas3;

import java.util.ArrayList;

public class Object {

    ArrayList<ClassObject> b;

    public Object() {
        b = new ArrayList<ClassObject>();

    }

    public void Data(String NIK, String Nama, double GajiPokok, double Tunjangan, double Bonus, double Denda) {
        b.add(new ClassObject(NIK, Nama, GajiPokok, Tunjangan, Bonus, Denda));

    }

    public void get() {
        for (ClassObject a : b) {
            a.Display();
        }
    }
    public void get(String a){
        for (ClassObject b:b){
             if (b.getNik().equalsIgnoreCase(a)){
                 b.Display();
             }
             
        }
    }
    public void get(String z,String x,int c){
        for (ClassObject d:b){
            if (z.equalsIgnoreCase("Tunjangan"))
            
        
        }
    }
}
