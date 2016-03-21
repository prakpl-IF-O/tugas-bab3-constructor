
public class NewClass {

    public int nik;
    public String nama;
    public int gajipokok;
    public int tunjangan;
    public int bonus;
    public int denda;
    NewClass data[] = new NewClass[9];

    public void data() {
        data[0] = new NewClass(101, "Paijo", 2000, 1000, 500, 200);
        data[1] = new NewClass(102, "Lala", 1750, 1000, 500, 200);
        data[2] = new NewClass(103, "Lulu", 2150, 1000, 500, 200);
        data[3] = new NewClass(104, "Sabar", 1500, 1000, 500, 200);
        data[4] = new NewClass(105, "Sule", 2500, 850, 500, 300);
        data[5] = new NewClass(106, "Paiman", 1500, 1000, 450, 250);
        data[6] = new NewClass(107, "Ponimin", 2000, 1000, 500, 200);
        data[7] = new NewClass(108, "Sutimin", 1500, 1250, 500, 300);
        data[8] = new NewClass(109, "Raja", 1000, 1000, 500, 200);
        data[9] = new NewClass(110, "Harry", 2250, 1000, 200, 200);
    }

    public NewClass(int nik, String nama, int gajipokok, int tunjangan, int bonus, int denda) {

        this.nik = nik;
        this.nama = nama;
        this.gajipokok = gajipokok;
        this.tunjangan = tunjangan;
        this.bonus = bonus;
        this.denda = denda;

    }

    public void getData() {

    }

    public int getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getBonus() {
        return bonus;
    }

    public int getDenda() {
        return denda;
    }

    public void get() {
        for (int i = 0; i < 10; i++) {
            Display(i);
        }
    }

    public void get(int id) {

        for (int i = 0; i < 10; i++) {
            if (id == data[i].getNik()) {
                Display(i);
                break;
            }
        }
    }

    public void get(String columnName, int value) {
        switch (columnName) {
            case "gajipokok":
                for (int i = 0; i < 10; i++) {
                    if (data[i].getGajipokok() == value) {
                        Display(i);
                    }
                }
                break;

            case "tunjangan":
                for (int i = 0; i < 10; i++) {
                    if (data[i].getTunjangan() == value) {
                        Display(i);
                    }

                }
                break;

            case "bonus":
                for (int i = 0; i < 10; i++) {
                    if (data[i].getBonus() == value) {
                        Display(i);
                    }
                }
                break;
            case "denda":
                for (int i = 0; i < 10; i++) {
                    if (data[i].getDenda() == value) {
                        Display(i);
                    }

                }
                break;
        }

    }

    public void get(String columnName, String operator, int value) {
        switch (columnName) {
            case "gajipokok":
                switch (operator) {
                    case ">":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getGajipokok() > value) {
                                Display(i);
                            }
                        }
                        break;
                    case "<":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getGajipokok() < value) {
                                Display(i);
                            }
                        }
                        break;
                    case ">=":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getGajipokok() >= value) {
                                Display(i);
                            }
                        }
                        break;
                    case "<=":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getGajipokok() <= value) {
                                Display(i);
                            }
                        }
                        break;
                }
            break;

            case "tunjangan":
                switch (operator) {
                    case ">":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getTunjangan() > value) {
                                Display(i);
                            }
                        }
                        break;
                    case "<":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getTunjangan() < value) {
                                Display(i);
                            }
                        }
                        break;
                    case ">=":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getTunjangan() >= value) {
                                Display(i);
                            }
                        }
                        break;
                    case "<=":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getTunjangan() <= value) {
                                Display(i);
                            }
                        }
                        break;
                }
            break;

            case "bonus":
                switch (operator) {
                    case ">":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getBonus() > value) {
                                Display(i);
                            }
                        }
                        break;
                    case "<":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getBonus() < value) {
                                Display(i);
                            }
                        }
                        break;
                    case ">=":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getBonus() >= value) {
                                Display(i);
                            }
                        }
                        break;
                    case "<=":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getBonus() <= value) {
                                Display(i);
                            }
                        }
                        break;
                }
            break;
            case "denda":
                switch (operator) {
                    case ">":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getDenda() > value) {
                                Display(i);
                            }
                        }
                        break;
                    case "<":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getDenda() < value) {
                                Display(i);
                            }
                        }
                        break;
                    case ">=":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getDenda() >= value) {
                                Display(i);
                            }
                        }
                        break;
                    case "<=":
                        for (int i = 0; i < 10; i++) {
                            if (data[i].getDenda() <= value) {
                                Display(i);
                            }
                        }
                        break;
                }
            break;
        }
    }

    public void Display(int i) {
        System.out.println(data[i].getNik());
        System.out.println(data[i].getNama());
        System.out.println(data[i].getGajipokok());
        System.out.println(data[i].getTunjangan());
        System.out.println(data[i].getBonus());
        System.out.println(data[i].getDenda());
    }

}
