public class Karyawan {
    private int NIK, Gajipokok, Tunjangan, Bonus, Denda;
    private String NamaKar;
    //set
    public void setNIK(int NIK) {
        this.NIK = NIK;
    }

    public void setGajipokok(int Gajipokok) {
        this.Gajipokok = Gajipokok;
    }

    public void setTunjangan(int Tunjangan) {
        this.Tunjangan = Tunjangan;
    }

    public void setBonus(int Bonus) {
        this.Bonus = Bonus;
    }

    public void setDenda(int Denda) {
        this.Denda = Denda;
    }

    public void setNamaKar(String NamaKar) {
        this.NamaKar = NamaKar;
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
