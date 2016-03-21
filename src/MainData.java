public class MainData {
    public static void main(String[] args) {
    Karyawan NY = new Karyawan();
    //pemanggilan Semua data
    NY.Data();
     //pemanggilan X Nomer NIK 109
    NY.Data(109);
     //pemanggilan Gaji 1500
    NY.Data("Gaji Pokok", 1500);
    //pemanggilan Tunjangan >= 1000
    NY.Data("Tunjangan",">=",1000);
    //Pemanggilan Denda > 200
    NY.Data("Denda",">",200);
        System.out.println("");
        System.out.println("\t\t\t\t TERIMA KASIH ");
    }
}
