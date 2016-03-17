
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
        System.out.println("get()");
        db.get();
        System.out.println("==============");
        System.out.println("");
        System.out.println("get(int id)");
        db.get(101);
        db.get(105);
        System.out.println("");
        System.out.println("==============");
        System.out.println("get(String na,int val");
        db.get("Gaji Pokok",2000);
        db.get("tunjangan",1000);
        db.get("Bonus",500);
        db.get("Denda",375);
        System.out.println("");
        System.out.println("==============");
        System.out.println("get(String na, String o, int val");
        db.get("gaji Pokok","<",2000);
        db.get("Tunjangan",">",900);
        db.get("bonus","<=",450);
        db.get("denda",">=",300);
        
        
        System.out.println("==============");
        
        
    }
}
