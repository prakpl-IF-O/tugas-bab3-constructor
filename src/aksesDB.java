public class aksesDB {
    private static Database[] db = new Database[10];
    //Data
    private static void data(){
        db[0] = new Database(101, "Paijo", 2000, 1000, 500, 200);
        db[1] = new Database(102, "Lala", 1750, 900, 500, 200);
        db[2] = new Database(103, "Lulu", 2150, 1000, 300, 375);
        db[3] = new Database(104, "Sabar", 1500, 750, 600, 200);
        db[4] = new Database(105, "Sule", 2500, 850, 500, 300);
        db[5] = new Database(106, "Paiman", 1500, 350, 450, 250);
        db[6] = new Database(107, "Ponimin", 2000, 1000, 500, 200);
        db[7] = new Database(108, "Sutiman", 1500, 1250, 500, 300);
        db[8] = new Database(109, "Raja", 1000, 1000, 500, 200);
        db[9] = new Database(110, "Harry", 2250, 1000, 200, 200);
    }
    
    public void get(){
        data();
        for (int i = 0; i < db.length; i++) {
            displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
        }
    }
    
    public void get(int nik){
        data();
        for (int i = 0; i < db.length; i++) {
            if(nik == db[i].getNik()){
                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                break;
            }
        }
    }
    
    public void get(String opsi, int value){
        data();
        String ops = opsi.toLowerCase();
        switch(ops){
            case "gaji pokok":
                for (int i = 0; i < db.length; i++) {
                    if(value == db[i].getGajiPokok()){
                        displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                    }
                }
            case "tunjangan":
                for (int i = 0; i < db.length; i++) {
                    if(value == db[i].getTunjangan()){
                        displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                    }
                }
            case "bonus":
                for (int i = 0; i < db.length; i++) {
                    if(value == db[i].getBonus()){
                        displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                    }
                }
            case "denda":
                for (int i = 0; i < db.length; i++) {
                    if(value == db[i].getDenda()){
                        displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                    }
                }
            default:
        }
    }
    
    public void get(String opsi, String operator, int value){
        data();
        String ops = opsi.toLowerCase();
        switch(ops){
            case "gaji pokok":
                switch(operator){
                    case ">":
                        for (int i = 0; i < db.length; i++) {
                            if(value > db[i].getGajiPokok()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case "<":
                        for (int i = 0; i < db.length; i++) {
                            if(value < db[i].getGajiPokok()){
                               displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case ">=":
                        for (int i = 0; i < db.length; i++) {
                            if(value >= db[i].getGajiPokok()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case "<=":
                        for (int i = 0; i < db.length; i++) {
                            if(value <= db[i].getGajiPokok()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    default:
                }break;
            case "tunjangan":
                switch(operator){
                    case ">":
                        for (int i = 0; i < db.length; i++) {
                            if(value > db[i].getTunjangan()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case "<":
                        for (int i = 0; i < db.length; i++) {
                            if(value < db[i].getTunjangan()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case ">=":
                        for (int i = 0; i < db.length; i++) {
                            if(value >= db[i].getTunjangan()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case "<=":
                        for (int i = 0; i < db.length; i++) {
                            if(value <= db[i].getTunjangan()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    default:
                }break;
            case "bonus":
                switch(operator){
                    case ">":
                        for (int i = 0; i < db.length; i++) {
                            if(value > db[i].getBonus()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case "<":
                        for (int i = 0; i < db.length; i++) {
                            if(value < db[i].getBonus()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case ">=":
                        for (int i = 0; i < db.length; i++) {
                            if(value >= db[i].getBonus()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case "<=":
                        for (int i = 0; i < db.length; i++) {
                            if(value <= db[i].getBonus()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    default:
                }break;
            case "denda":
                switch(operator){
                    case ">":
                        for (int i = 0; i < db.length; i++) {
                            if(value > db[i].getDenda()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case "<":
                        for (int i = 0; i < db.length; i++) {
                            if(value < db[i].getDenda()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case ">=":
                        for (int i = 0; i < db.length; i++) {
                            if(value >= db[i].getDenda()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    case "<=":
                        for (int i = 0; i < db.length; i++) {
                            if(value <= db[i].getDenda()){
                                displayFormat(db[i].getNik(),db[i].getNama(),db[i].getGajiPokok(),db[i].getTunjangan(),db[i].getBonus(),db[i].getDenda());
                            }
                        }break;
                    default:
                }break;
            default:
        }
    }
    
    private void displayFormat(int a, String b, int c, int d, int e, int f){
        System.out.println("NIK        : "+a);
        System.out.println("Nama       : "+b);
        System.out.println("Gaji Pokok : "+c);
        System.out.println("Tunjangan  : "+d);
        System.out.println("Bonus      : "+e);
        System.out.println("Denda      : "+f);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
    }
    
}
