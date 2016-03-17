
import java.util.ArrayList;

public class Database {

    int count1, count2;
    ArrayList<Data> data = new ArrayList();

    public Database() {

    }

    public Database(Data a) {
        data.add(a);
        count1++;
    }

    public void inputData(Data... a) {
        for (int i = 0; i < a.length; i++) {
            data.add(a[i]);
            count1++;
        }
    }

    public Database get() {
        displayData();
        System.out.println("Jumlah Data : " + count1);
        return this;
    }

    public Data get(int id) {
        Database s = new Database();
        for (Data d : data) {
            if (d.getNik() == id) {
                s.inputData(d);
                s.displayData();
                return d;

            }
        }
        return null;
    }

    public Database get(String n, int v) {
        Database s = new Database();
        count2 = 0;
        for (Data d : data) {
            if (n.equalsIgnoreCase("Tunjangan")) {
                if (v == d.getTunjangan()) {
                    s.inputData(d);
                    count2++;
                }
            } else if (n.equalsIgnoreCase("Gaji Pokok")) {
                if (v == d.getGaji()) {
                    s.inputData(d);
                    count2++;
                }
            } else if (n.equalsIgnoreCase("Bonus")) {
                if (v == d.getBonus()) {
                    s.inputData(d);
                    count2++;
                }
            } else if (n.equalsIgnoreCase("Denda")) {
                if (v == d.getDenda()) {
                    s.inputData(d);
                    count2++;
                }
            }
        }
        s.displayData();
        System.out.println("Jumlah Data : " + count2);
        System.out.println("-------------------------");
        return s;
    }

    public Database get(String n, String o, int v) {
        Database s = new Database();
        count2 = 0;
        for (Data d : data) {
            if (o.equalsIgnoreCase("<")) {
                if (n.equalsIgnoreCase("Tunjangan")) {
                    if (d.getTunjangan() < v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Gaji Pokok")) {
                    if (d.getGaji() < v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Bonus")) {
                    if (d.getBonus() < v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Denda")) {
                    if (d.getDenda() < v) {
                        s.inputData(d);
                        count2++;
                    }
                }
            }
            if (o.equalsIgnoreCase(">")) {
                if (n.equalsIgnoreCase("Tunjangan")) {
                    if (d.getTunjangan() > v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Gaji Pokok")) {
                    if (d.getGaji() > v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Bonus")) {
                    if (d.getBonus() > v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Denda")) {
                    if (d.getDenda() > v) {
                        s.inputData(d);
                        count2++;
                    }
                }
            }
            if (o.equalsIgnoreCase("<=")) {
                if (n.equalsIgnoreCase("Tunjangan")) {
                    if (d.getTunjangan() <= v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Gaji Pokok")) {
                    if (d.getGaji() <= v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Bonus")) {
                    if (d.getBonus() <= v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Denda")) {
                    if (d.getDenda() <= v) {
                        s.inputData(d);
                        count2++;
                    }
                }
            }
            if (o.equalsIgnoreCase(">=")) {
                if (n.equalsIgnoreCase("Tunjangan")) {
                    if (d.getTunjangan() >= v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Gaji Pokok")) {
                    if (d.getGaji() >= v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Bonus")) {
                    if (d.getBonus() >= v) {
                        s.inputData(d);
                        count2++;
                    }
                }
                if (n.equalsIgnoreCase("Denda")) {
                    if (d.getDenda() >= v) {
                        s.inputData(d);
                        count2++;
                    }
                }
            }
        }
        s.displayData();
        System.out.println("Jumlah Data : " + count2);
        System.out.println("-------------------------");
        return s;
    }

    private void displayData() {

        for (Data d : data) {
            System.out.println("NIK        : " + d.getNik());
            System.out.println("Nama       : " + d.getNama());
            System.out.println("Gaji Pokok : " + d.getGaji());
            System.out.println("Tunjangan  : " + d.getTunjangan());
            System.out.println("Bonus      : " + d.getBonus());
            System.out.println("Denda      : " + d.getDenda());
            System.out.println("-------------------------");
        }
    }
}
