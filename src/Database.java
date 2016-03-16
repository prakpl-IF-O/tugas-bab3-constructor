
public class Database {

    private final int nik[] = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
    private final String nama[] = {"Paijo", "Lala", "lulu", "Sabar", "Sule", "Paiman", "Ponimin", "Sutiman", "Raja", "Harry"};
    private final int gaji_pokok[] = {2000, 1750, 2150, 1500, 2500, 1500, 2000, 1500, 1000, 2250};
    private final int tunjangan[] = {1000, 900, 1000, 750, 850, 350, 1000, 1250, 1000, 1000};
    private final int bonus[] = {500, 500, 300, 600, 500, 450, 500, 500, 500, 200};
    private final int denda[] = {200, 200, 375, 200, 300, 250, 200, 300, 200, 200};
    int jumlah_data = nik.length;

    public void print_coloumn() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("NIK\tNama\t  Gaji Pokok\tTunjangan\tBonus\tDenda");
        System.out.println("---------------------------------------------------------------");
    }

    public void get() {
        print_coloumn();
        for (int z = 0; z < jumlah_data; z++) {
            System.out.println(nik[z] + "\t" + nama[z] + "\t  " + gaji_pokok[z] + "\t\t" + tunjangan[z] + "\t\t" + bonus[z] + "\t" + denda[z]);
        }
        System.out.println("---------------------------------------------------------------");
    }

    public void get(int NIK) {
        int index = 999;
        for (int y = 0; y < jumlah_data; y++) {
            if (NIK == nik[y]) {
                index = y;
                break;
            }
        }
        print_coloumn();
        System.out.println(nik[index] + "\t" + nama[index] + "\t  " + gaji_pokok[index] + "\t\t" + tunjangan[index] + "\t\t" + bonus[index] + "\t" + denda[index]);
        System.out.println("---------------------------------------------------------------");
    }

    public void get(String kolom, int target_value) {
        int result_count = 0;
        print_coloumn();
        if (kolom.equals("Gaji Pokok")) {
            for (int y = 0; y < jumlah_data; y++) {
                if (target_value == gaji_pokok[y]) {
                    System.out.println(nik[y] + "\t" + nama[y] + "\t  " + gaji_pokok[y] + "\t\t" + tunjangan[y] + "\t\t" + bonus[y] + "\t" + denda[y]);
                    result_count++;
                }
            }
            System.out.println("---------------------------------------------------------------");
        } else if (kolom.equals("Tunjangan")) {
            for (int y = 0; y < jumlah_data; y++) {
                if (target_value == tunjangan[y]) {
                    System.out.println(nik[y] + "\t" + nama[y] + "\t  " + gaji_pokok[y] + "\t\t" + tunjangan[y] + "\t\t" + bonus[y] + "\t" + denda[y]);
                    result_count++;
                }
            }
            System.out.println("---------------------------------------------------------------");
        } else if (kolom.equals("Bonus")) {
            for (int y = 0; y < jumlah_data; y++) {
                if (target_value == bonus[y]) {
                    System.out.println(nik[y] + "\t" + nama[y] + "\t  " + gaji_pokok[y] + "\t\t" + tunjangan[y] + "\t\t" + bonus[y] + "\t" + denda[y]);
                    result_count++;
                }
            }
            System.out.println("---------------------------------------------------------------");
        } else if (kolom.equals("Denda")) {
            for (int y = 0; y < jumlah_data; y++) {
                if (target_value == denda[y]) {
                    System.out.println(nik[y] + "\t" + nama[y] + "\t  " + gaji_pokok[y] + "\t\t" + tunjangan[y] + "\t\t" + bonus[y] + "\t" + denda[y]);
                    result_count++;
                }
            }
            System.out.println("---------------------------------------------------------------");
        } else {
            System.out.println("Kolom tidak ditemukan!");
            System.out.println("---------------------------------------------------------------");
        }

        if (result_count == 0) {
            System.out.println("\tMaaf data tidak ditemukan!");
            System.out.println("---------------------------------------------------------------");
        }
    }
}
