public class ClassTugas {
    private String nama,nik;
private int gajiPokok,tunjangan,bonus,denda;
public ClassTugas(String nik, String nama, int gajiPokok, int tunjangan, int bonus, int denda){
    this.nama = nama;
    this.nik = nik;
    this.gajiPokok = gajiPokok;
    this.tunjangan = tunjangan;
    this.bonus = bonus;
    this.denda = denda;
}
public void tampilData(){
    System.out.println("nik : "+nik);
    System.out.println("nama : "+nama);
    System.out.println("gajiPokok : "+gajiPokok);
    System.out.println("tunjangan : "+tunjangan);
    System.out.println("bonus : "+bonus);
    System.out.println("denda : "+denda);
    System.out.println("==================");
}

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getBonus() {
        return bonus;
    }

    public int getDenda() {
        return denda;
    }
}
