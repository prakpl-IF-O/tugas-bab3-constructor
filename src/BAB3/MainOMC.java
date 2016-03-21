package BAB3;

public class MainOMC {
    public static void main(String[] args) {
        OMC d = new OMC();
        d.get();
        d.get(104);
        d.get("Tunjangan", 1000);
        d.get("Bonus", "<", 300);
        d.get("Denda" , ">" , 300);
    }
}
