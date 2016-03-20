public class mainAksesDB {
    public static void main(String[] args) {
        aksesDB akses = new aksesDB();
        
        //get semua data
        akses.get();
        //get data pada nik 102
        akses.get(102);
        //get data yang memiliki tunjangan = 1000
        akses.get("Tunjangan", 1000);
        //get data yang memiliki bonus >= 300
        akses.get("Bonus", ">=", 300);
    }
}
