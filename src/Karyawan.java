public class Karyawan {
    private int NIK, Gajipokok, Tunjangan, Bonus, Denda;
    private String NamaKar;
//Konstraktor
    public Karyawan(int q, int w,int e, int r, int t, String y) {
        NIK       = q;
        Gajipokok = w;
        Tunjangan = e;
        Bonus     = r;
        Denda     = t;
        NamaKar   = y;
    }
//set
    public void setNIK(int q) {
        NIK = q;
    }
    public void setGajipokok(int w) {
        Gajipokok = w;
    }
    public void setTunjangan(int e) {
        Tunjangan = e;
    }
    public void setBonus(int r) {
        Bonus = r;
    }
    public void setDenda(int t) {
        Denda = t;
    }
    public void setNamaKar(String y) {
        NamaKar = y;
    }
    //get
    public int getNIK() {
        return NIK;
    }
    public int getGajipokok() {
        return Gajipokok;
    }
    public int getTunjangan() {
        return Tunjangan;
    }
    public int getBonus() {
        return Bonus;
    }
    public int getDenda() {
        return Denda;
    }
    public String getNamaKar() {
        return NamaKar;
    }
    
}
