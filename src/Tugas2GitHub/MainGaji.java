package Tugas2GitHub;

public class MainGaji {

    public static void main(String[] args) {
        SimpanDanTampilGaji db = new SimpanDanTampilGaji();
        //String nama, int nik, int gajiPokok, int tunjangan, int bonus, int denda
        db.isiData("paijo", 101, 2000, 1000, 500, 200);
        db.isiData("Lala", 102, 1750, 900, 500, 200);
        db.isiData("Lulu", 103, 2150, 1000, 300, 375);
        db.isiData("Sabar", 104, 1500, 750, 600, 200);
        db.isiData("Sule", 105, 2500, 850, 500, 300);
        db.isiData("paiman", 106, 1500, 350, 450, 250);
        db.isiData("ponimin", 107, 2000, 1000, 500, 200);
        db.isiData("Sutiman", 108, 1500, 1250, 500, 300);
        db.isiData("Raja", 109, 1000, 1000, 500, 200);
        db.isiData("paijo", 110, 2250, 1000, 200, 200);
        System.out.println("Menampilkan semua data");
        System.out.println("Menggunakan method db.get()");
        db.get();
        System.out.println("=====================================");
        System.out.println("Menampilkan data dengan NIK tertentu");
        System.out.println("Menggunakan method db.get(int a)");
        db.get(105);
        System.out.println("=====================================");
        System.out.println("Menampilkan data dengan kriteria tertentu");
        System.out.println("Menggunakan method db.get(String a, String b, int c)");
        db.get("tunjangan", "<", 1000);

    }
}
