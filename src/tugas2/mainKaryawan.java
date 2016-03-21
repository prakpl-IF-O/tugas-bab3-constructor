package tugas2;

import java.util.ArrayList;

public class mainKaryawan {

    public static void main(String[] args) {
        prosesData db = new prosesData();
        db.setObjecttoArray("Paijo", 200, 2000, 101, 500, 1000);
        db.setObjecttoArray("Lala", 200, 1750, 102, 500, 900);
        db.setObjecttoArray("Lulu", 375, 2150, 103, 300, 1000);
        db.setObjecttoArray("Sabar", 200, 1500, 104, 600, 750);
        db.setObjecttoArray("Sule", 300, 2500, 105, 500, 850);
        db.setObjecttoArray("Paiman", 250, 1500, 106, 450, 350);
        db.setObjecttoArray("Ponimin", 200, 2000, 107, 500, 1000);
        db.setObjecttoArray("Sutiman", 300, 1500, 108, 500, 1250);
        db.setObjecttoArray("Raja", 200, 1000, 109, 500, 1000);
        db.setObjecttoArray("Harry", 200, 2250, 110, 200, 1000);

        db.get();
    }
}
