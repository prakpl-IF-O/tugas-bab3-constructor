
public class git {

    String nik[] = {"001", "002", "003", "004", "005", "006", "007", "008", "009", "010"};
    String nama[] = {"arum", "ifa", "roro", "ayu", "puspita", "ningrum", "anum", "apunin", "wahyu", "dwiki"};
    int gaji[] = {1000, 1500, 1750, 2000, 2500, 2750, 3000, 3500, 37500, 4000};
    int tunjangan[] = {4500, 4750, 5000, 5500, 5750, 6000, 6500, 6750, 7000, 7500};
    int bonus[] = {200, 250, 275, 300, 350, 375, 400, 450, 475, 500};
    int denda[] = {50, 60, 70, 80, 90, 100, 105, 110, 115, 120};

    public void get() {
        for (int i = 0; i < 10; i++) {
            System.out.println(nik[i]);
            System.out.println(nama[i]);
            System.out.println(gaji[i]);
            System.out.println(tunjangan[i]);
            System.out.println(bonus[i]);
            System.out.println(denda[i]);
            System.out.println("================");
        }
    }

    public void getnik(String a) {
        for (int i = 0; i < 10; i++) {
            if (a == nik[i]) {
                System.out.println(nik[i]);
                System.out.println(nama[i]);
                System.out.println(gaji[i]);
                System.out.println(tunjangan[i]);
                System.out.println(bonus[i]);
                System.out.println(denda[i]);
                System.out.println("==========");
            }
        }
    }

    public void getanum(String a, int b) {
        switch (a) {
            case "gaji pokok":
                for (int i = 0; i < 10; i++) {
                    if (b == gaji[i]) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                break;
            case "tunjangan":
                for (int i = 0; i < 10; i++) {
                    if (b == tunjangan[i]) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                break;
            case "bonus":
                for (int i = 0; i < 10; i++) {
                    if (b == bonus[i]) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                break;
            case "denda":
                for (int i = 0; i < 10; i++) {
                    if (b == bonus[i]) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                break;
            default:
        }
    }

    public void getifa(String a, String b, int c) {
        switch (a) {
            case "gaji pokok":
                switch (b) {
                    case ">":
                         for (int i = 0; i < 10; i++) {
                    if (gaji [i] > c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                        break;
                    case "<":
                        for (int i = 0; i < 10; i++) {
                    if (gaji [i] < c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                        break;
                    case ">=":
                        for (int i = 0; i <10; i++) {
                    if (gaji [i] >= c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                        break;
                    case "<=":
                        for (int i = 0; i < 10; i++) {
                    if (gaji [i] <= c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                        break;
                    default:
                }
                break;
            case "tunjangan":
                switch (b) {
                    case ">":
                        for (int i = 0; i < 10; i++) {
                    if (tunjangan [i] > c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                        break;
                    case "<":
                        for (int i = 0; i < 10; i++) {
                    if (tunjangan [i] < c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                        break;
                    case ">=":
                        for (int i = 0; i < 10; i++) {
                    if (tunjangan [i] >= c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                        break;
                    case "<=":
                        for (int i = 0; i < 10; i++) {
                    if (tunjangan [i] <= c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                        break;
                    default:
                }
                break;
            case "bonus":
                switch(b){
            case ">":
                for (int i = 0; i < 10; i++) {
                    if (bonus [i] > c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                break;
                case"<":
                    for (int i = 0; i < 10; i++) {
                    if (bonus [i] < c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                    break;
                    case">=":
                        for (int i = 0; i < 10; i++) {
                    if (bonus [i] >=c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                        break;
                        case"<=":
                            for (int i = 0; i < 10; i++) {
                    if (bonus [i] <= c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                            break;
                        default:
        }
                break;
            case "denda":
                switch(b){
            case ">":
                for (int i = 0; i < 10; i++) {
                    if (denda [i] > c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                break;
                case"<":
                    for (int i = 0; i < 10; i++) {
                    if (denda [i] < c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                    break;
                    case">=":
                        for (int i = 0; i < 10; i++) {
                    if (denda [i] >= c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                        break;
                        case"<=":
                            for (int i = 0; i < 10; i++) {
                    if (denda [i] <= c) {
                        System.out.println(nik[i]);
                        System.out.println(nama[i]);
                        System.out.println(gaji[i]);
                        System.out.println(tunjangan[i]);
                        System.out.println(bonus[i]);
                        System.out.println(denda[i]);
                        System.out.println("==========");
                    }
                }
                            break;
                        default:
        }
                break;
        }
    }
}
