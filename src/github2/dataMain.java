package github2;

public class dataMain {
    public static void main(String[] args) {
        data d1 = new data();
        d1.get();
        d1.get(104);
        d1.get("Gaji Pokok", 1500);
        d1.get("Tunjangan",">=",1000);
        d1.get("Denda",">",200);
    }
}
