package tugas2;

import java.util.ArrayList;

public class prosesData {

    ArrayList<Karyawan> listkaryawan;

    public prosesData() {
        listkaryawan = new ArrayList<Karyawan>();
    }

    public void setObjecttoArray(String nama, int den, int gapok, int nik, int bon, int tun) {
        listkaryawan.add(new Karyawan(nama, den, gapok, nik, bon, tun));
    }

    public void get() {
        for (Karyawan total : listkaryawan) {
            total.tampilData();
        }
    }

    public void get(int nik) {
        for (Karyawan nomor : listkaryawan) {
            if (nomor.getNik() == nik) {
                nomor.tampilData();
            }

        }
    }

    public void get(String ColumnName, int point) {
        for (Karyawan status : listkaryawan) {
            if (ColumnName.equals("Gaji Pokok")) {
                if (point == status.getGajiPokok()) {
                    status.tampilData();
                }
            } else if (ColumnName.equals("Tunjangan")) {
                if (point == status.getTunjangan()) {
                    status.tampilData();
                }
            } else if (ColumnName.equals("Denda")) {
                if (point == status.getDenda()) {
                    status.tampilData();
                }
            } else if (ColumnName.equals("Bonus")) {
                if (point == status.getBonus()) {
                    status.tampilData();
                }

            }
        }
    }
}
