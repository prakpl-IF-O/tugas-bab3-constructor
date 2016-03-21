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
    }}
