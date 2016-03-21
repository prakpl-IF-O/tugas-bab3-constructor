import java.util.ArrayList;
public class ClassBaru {
        ArrayList<ClassTugas>x1;
    public ClassBaru(){
        x1=new ArrayList<ClassTugas>();
    }
    public void masukData(String nik, String nama, int gajiPokok, int tunjangan, int bonus, int denda){
        x1.add(new ClassTugas(nik,nama,gajiPokok,tunjangan,bonus,denda));
        
    }
public void get(){
    for (ClassTugas x:x1) {
        x.tampilData();
    }   
    }
public void get(String s){
    for (ClassTugas x:x1){
        if(x.getNik().equalsIgnoreCase(s)){
            x.tampilData();
        }
    } 
}
public void get(String a, int w){
    for(ClassTugas x:x1){
        if(a.equalsIgnoreCase("tunjangan")&&x.getGajiPokok()==2000){
            x.tampilData();
        }
    }
}
public void get(String a, String b, int w){
    for (ClassTugas x:x1) {
       if(a.equalsIgnoreCase("tunjangan")&&b.equalsIgnoreCase("<=")&&x.getGajiPokok()<=1000){
           x.tampilData();
       }
       else if(a.equalsIgnoreCase("bonus")&&b.equalsIgnoreCase(">")&&x.getBonus()>450){
           x.tampilData();
       }
    }
}
}
