public class main {
     public static void main(String[] args) {
        datab db = new datab();
        db.data(101,"paijo",2000, 1000 , 500 , 200 );
        db.data(102, "lala", 1750 , 900 , 500 , 200 );
        db.data(103, "lulu", 2150 , 1000 , 300 , 375 );
        db.data(104, "sabar", 1500 , 750 , 600 , 200 );
        db.data(105, "sule", 2500 , 850 , 500 , 300 );
        db.data(106, "paiman", 1500 , 350 , 450 , 250 );
        db.data(107, "ponimin", 2000 , 1000 , 500 , 200 );
        db.data(108, "sutiman", 1500 , 1250 , 500 , 300 );
        db.data(109, "raja", 1000 , 1000 , 500 , 200 );
        db.data(110, "harry", 2250 , 1000 , 200 , 200 );
         System.out.println("------Data------");
    db.dapat();
         System.out.println("-----------(109)------------");
    db.dapat(109);
         System.out.println("---(\"gaji pokok\", 1500)---");
    db.dapat("gaji pokok", 1500);
         System.out.println("---(\"denda\",\"<\", 200)---");
    db.dapat("denda","<", 200);
     } 
}
