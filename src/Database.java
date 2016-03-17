
import java.util.ArrayList;

public class Database {

    ArrayList<Data> data = new ArrayList();

    public Database() {

    }

    public Database(Data a) {

        data.add(a);
    }

    public void inputData(Data a) {
        data.add(a);
    }

    public void displayData() {

        for (Data d : data) {
            System.out.println("NIK : " + d.getNik());
            System.out.println("Nama : " + d.getNama());
            System.out.println("Gaji Pokok : " + d.getGaji());
            System.out.println("Tunjangan : " + d.getTunjangan());
            System.out.println("Bonus : " + d.getBonus());
            System.out.println("Denda : " + d.getDenda());
        }
    }
}
