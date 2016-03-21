public class main {
    public static void main(String[] args) {
        data d1=new data();
        d1.get();
        d1.get("005");
        d1.get("gaji pokok", 2000);
        d1.get("bonus", "<", 500);
    }
    
}
