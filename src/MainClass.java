
public class MainClass {

    public static void main(String[] args) {
        Data d1 = new Data(101,"Paijo",2000,1000,500,200);
        Data d2 = new Data(102,"Lala",1750,900,500,200);
        Data d3 = new Data(103,"Lulu",2150,1000,300,375);
        Data d4 = new Data(104,"Sabar",1500,750,600,200);
        Data d5 = new Data(105,"Sule",2500,850,500,300);
        Data d6 = new Data(106,"Paiman",1500,350,450,250);
        Data d7 = new Data(107,"Ponimin",2000,1000,500,200);
        Data d8 = new Data(108,"Sutiman",1500,1250,500,300);
        Data d9 = new Data(109,"Raja",1000,1000,500,200);
        Data d10 = new Data(110,"Harry",2250,1000,200,200);
        Database db = new Database();
        db.inputData(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10);
        System.out.println("Method db.get() Mengambl semua data dari database");
        db.get();
        System.out.println("-----------------------------------------");
        System.out.println("Method db.get(int id) Mengambil data nik tertentu");
        System.out.println("db.get(102)");
        db.get(102);
        System.out.println("db.get(110)");
        db.get(110);
        System.out.println("-----------------------------------------");
        System.out.println("Method db.get(String columnName, Object Value) Mengambil semua data dengan nilai column name = value");
        System.out.println("db.get(\"Gaji Pokok\", 2000) ");
        db.get("Gaji Pokok",2000);
        System.out.println("db.get(\"Tunjangan\", 1000) ");
        db.get("Tunjangan",1000);
        System.out.println("-----------------------------------------");
        System.out.println("Method db.get(String columnName,String operator, Object Value)  Mengambil semua data dengan nilai column name operator value");
        System.out.println("db.get(\"Bonus\", \">\", 450)");
        db.get("Bonus",">",450);
        System.out.println("db.get(\"Denda\", \"<=\", 250)");
        db.get("Denda","<=",250);
    }
}