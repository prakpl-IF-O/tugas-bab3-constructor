package overloading;

public class mainTugas {
    public static void main(String[] args) {
        Tugas t = new Tugas();
        
        t.get();
        t.get(104);
        t.get("GAJI POKOK",2000);
        t.get("TUNJANGAN","<=",1000);
        t.get("BONUS",">",500);
    }
    
}
