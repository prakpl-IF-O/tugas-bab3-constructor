/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author ANDY ROSHADI
 */
public class mainDatabase {
    public static void main(String[] args) {
      Database a = new Database();
      a.get();
      a.get(107);
      a.get("GAJI POKOK", 2000);
      a.get("TUNJANGAN", "KURANG DARI ATAU SAMA DENGAN", 1500);
      a.get("BONUS", "LEBIH DARI", 500);
      
      
      
        
    }

}
