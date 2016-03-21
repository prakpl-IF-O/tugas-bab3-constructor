public class MainData {
    public static void main(String[] args) {
    Karyawan NY = new Karyawan();
    //pemanggilan Semua data
    NY.Data();
     //pemanggilan X Nomer NIK 109
    NY.Data(109);
     //pemanggilan Gaji 1500
    NY.Data("Gaji Pokok", 1500);
        
    }
}
