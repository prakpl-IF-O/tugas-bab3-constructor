package database;
public class maindataBase {
    public static void main(String[] args) {
        DataBase db = new DataBase ();
        db.get();
        db.get(104);
        db.get("Tunjangan", 2000);
        db.get("Tunjangan", "<=", 1000);
        db.get("Bonus", ">", 450);
    }
}
