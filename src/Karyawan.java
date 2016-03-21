public class Karyawan {
    private int NIK, Gajipokok, Tunjangan, Bonus, Denda;
    private String NamaKar;
public Karyawan (){
}    
//Konstraktor
    public void Karyawan(int q, String w, int e,int r, int t, int y ) {
        NIK       = q;
        NamaKar   = w;
        Gajipokok = e;
        Tunjangan = r;
        Bonus     = t;
        Denda     = y;
        
    }
//set
    public void setNIK(int q) {
        NIK = q;
    }
    public void setGajipokok(int e) {
        Gajipokok = e;
    }
    public void setTunjangan(int r) {
        Tunjangan = r;
    }
    public void setBonus(int t) {
        Bonus = t;
    }
    public void setDenda(int y) {
        Denda = y;
    }
    public void setNamaKar(String w) {
        NamaKar = w;
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
    public void dis(){
        System.out.println("NIK        : "+NIK);
        System.out.println("Nama       : "+NamaKar);
        System.out.println("Gaji Pokok : "+Gajipokok);
        System.out.println("Tunjangan  : "+Tunjangan);
        System.out.println("Bonus      : "+Bonus);
        System.out.println("Denda      : "+Denda);
        
    
    
    }

    
}

