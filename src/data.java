public class data {

    private String[] nama = new String[10];
    private int[] nik = new int[10];
    private int[] gapok = new int[10];
    private int[] tunjangan = new int[10];
    private int[] bonus = new int[10];
    private int[] denda = new int[10];
    int urut=0;
    public void data(String nama_,int nik_, int gapok_, int tunjangan_, int bonus_, int denda_) {
        nama[urut] = nama_;
        nik[urut] = nik_;
        gapok[urut] = gapok_;
        tunjangan[urut] = tunjangan_;
        bonus[urut] = bonus_;
        denda[urut] = denda_;
        urut++;
    }
public void dapat() {
        for (int x = 0; x < urut; x++) {
            System.out.println("nama       : " + nama[x]);
            System.out.println("NIK        : " + nik[x]);
            System.out.println("gaji pokok : " + gapok[x]);
            System.out.println("tunjangan  : " + tunjangan[x]);
            System.out.println("bonus      : " + bonus[x]);
            System.out.println("denda      : " + denda[x]);
            System.out.println("++----------------------++");
        }
    }

    public void dapat(int nik_) {
        for (int a = 0; a < urut; a++) {
            if (nik_ == nik[a]) {
                System.out.println("\nnama       : " + nama[a]);
                System.out.println("NIK        : " + nik[a]);
                System.out.println("gaji pokok : " + gapok[a]);
                System.out.println("tunjangan  : " + tunjangan[a]);
                System.out.println("bonus      : " + bonus[a]);
                System.out.println("denda      : " + denda[a]);
            }
        }
    }}