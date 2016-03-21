/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Husein
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        data d1=new data();
        d1.get();
        d1.get("4");
        d1.get("gaji pokok", 2000);
        d1.get("bonus", "<", 500);
    }
    
}
