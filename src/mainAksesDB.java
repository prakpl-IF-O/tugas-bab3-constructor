public class mainAksesDB {
    public static void main(String[] args) {
        aksesDB akses = new aksesDB();
        
        System.out.println("*tanpa parameter ");
        akses.get();
        System.out.println("===========================");
        
        System.out.println("*parameter int nik = 102");
        akses.get(102);
        System.out.println("===========================");
        
        System.out.println("*parameter String opsi = tunjangan, int value = 1000");
        akses.get("Tunjangan", 1000);
        System.out.println("===========================");
        
        System.out.println("*parameter String opsi = bonus, String operator = >=, int value = 500");
        akses.get("Bonus", ">=", 500);
        System.out.println("===========================");
    }
}
