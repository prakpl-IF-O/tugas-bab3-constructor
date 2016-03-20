package Tugas2GitHub;
public class MainGaji {
    public static void main(String[] args) {
        
    
    SimpanDanTampilGaji a= new SimpanDanTampilGaji();
    a.isiData("Dino", 155, 145, 21, 21, 21);
    a.isiData("DOno", 155, 145, 21, 21, 21);
    a.isiData("DOni", 155, 145, 21, 21, 21);
    
        System.out.println("=======");
        a.ShowData();
    }
}
