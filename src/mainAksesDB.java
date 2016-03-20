public class mainAksesDB {
    public static void main(String[] args) {
        aksesDB akses = new aksesDB();
        
        akses.get();
        System.out.println("===========================");

        akses.get(102);
        System.out.println("===========================");

        akses.get("Tunjangan", 1000);
        System.out.println("===========================");
        
        akses.get("Bonus", ">=", 300);
        System.out.println("===========================");
    }
}
