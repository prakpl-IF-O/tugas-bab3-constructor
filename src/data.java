
public class data {

    String m[] = {"nik", "nama", "gaji pokok", "tunjangan", "bonus", "denda"},
         nik[] = {"001", "002", "003", "004", "005", "006", "007", "0008", "009", "010"},
           n[] = {"Husein", "Tangguh", "Irsyad", "Fitrah", "Raka", "Rizki", "Hafidz", "Izzan", "Andi", "Iqbal"};
    int g[] = {2000, 2500, 1500, 2000, 1250, 2700, 3000, 2000, 1500, 2500},
        t[] = {1000, 900, 750, 1000, 800, 1000, 900, 1250, 750, 500},
        b[] = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200},
        d[] = {200, 200, 375, 200, 300, 250, 200, 300, 200, 200,};
    public void get() {
        for (int i = 0; i < 10; i++) {
            
            sw(i);
            System.out.println("");
        }
        System.out.println("=========================");
    }

    public void get(String id) {
        for (int i = 0; i < 10; i++) {
            if (id == nik[i]) {
                sw(i);
            }
        }
        System.out.println("==============================");
    }

    public void get(String data, int v) {
        switch (data) {
            case "gaji pokok":
                for (int i = 0; i < 10; i++) {
                    if (v == g[i]) {
                        int j = 0;
                        sw(i);
                        j++;
                    }
                }
                break;
            case "tunjangan":
                for (int i = 0; i < 10; i++) {
                    if (v == t[i]) {
                        int j = 0;
                        sw(i);
                        j++;
                    }
                }
                break;
            case "bonus":
                for (int i = 0; i < 10; i++) {
                    if (v == b[i]) {
                        int j = 0;
                        sw(i);
                        j++;
                    }
                }
                break;
            case "denda":
                for (int i = 0; i < 10; i++) {
                    if (v == d[i]) {
                        int j = 0;
                        sw(i);
                        j++;
                    }
                }
                break;
        }
        System.out.println("===============================");
    }

    public void get(String data, String m, int v) {
        switch (data) {
            case "gaji pokok":
                switch (m) {
                    case ">":
                        for (int i = 0; i < 10; i++) {
                            if (g[i] > v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case ">=":
                        for (int i = 0; i < 10; i++) {
                            if (g[i] >= v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case "<":
                        for (int i = 0; i < 10; i++) {
                            if (g[i] < v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case "<=":
                        for (int i = 0; i < 10; i++) {
                            if (g[i] <= v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                }
                break;
            case "tunjangan":
                switch (m) {
                    case ">":
                        for (int i = 0; i < 10; i++) {
                            if (t[i] > v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case ">=":
                        for (int i = 0; i < 10; i++) {
                            if (t[i] >= v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case "<":
                        for (int i = 0; i < 10; i++) {
                            if (t[i] < v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case "<=":
                        for (int i = 0; i < 10; i++) {
                            if (t[i] <= v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                }
                break;
            case "bonus":
                switch (m) {
                    case ">":
                        for (int i = 0; i < 10; i++) {
                            if (b[i] > v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case ">=":
                        for (int i = 0; i < 10; i++) {
                            if (b[i] >= v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case "<":
                        for (int i = 0; i < 10; i++) {
                            if (b[i] < v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case "<=":
                        for (int i = 0; i < 10; i++) {
                            if (b[i] <= v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                }
                break;
            case "denda":
                switch (m) {
                    case ">":
                        for (int i = 0; i < 10; i++) {
                            if (d[i] > v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case ">=":
                        for (int i = 0; i < 10; i++) {
                            if (d[i] >= v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case "<":
                        for (int i = 0; i < 10; i++) {
                            if (d[i] < v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                    case "<=":
                        for (int i = 0; i < 10; i++) {
                            if (d[i] <= v) {
                                int j = 0;
                                sw(i);
                                j++;
                            }
                        }
                        break;
                }
                break;
        }
        System.out.println("===============================");
    }

    public void sw(int i) {
        for (int k = 0; k < 6; k++) {
            switch (k) {
                case 1:
                    System.out.println(m[k] + ": " + n[i]);
                    break;
                case 2:
                    System.out.println(m[k] + ": " + g[i]);
                    break;
                case 3:
                    System.out.println(m[k] + ": " + t[i]);
                    break;
                case 4:
                    System.out.println(m[k] + ": " + b[i]);
                    break;
                case 5:
                    System.out.println(m[k] + ": " + d[i]);
                    break;
                case 0:
                    System.out.println(m[k] + ": " + nik[i]);
                    break;
            }
        }
        System.out.println("");
    }
}
