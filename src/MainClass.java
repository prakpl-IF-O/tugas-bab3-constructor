
public class MainClass {

    public static void main(String[] args) {
        Data d1 = new Data(101,"Paijo",2000,1000,500,200);
        Data d2 = new Data(102,"Lala",1750,900,500,200);
        Database db = new Database();
        db.inputData(d1);
        db.inputData(d2);
        db.displayData();
    }
}
