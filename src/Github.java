/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import java.util.Arrays;

/**
 *
 * @author Meidita
 */
public class Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Maingithub db = new Maingithub() ;
       
      db.get();
      db.getId(104);
      db.Get("tunjangan",1000);
      db.geT("tunjangan","<",1000); 
      db.GET("gaji",">",500);
      
      } 
         
}
         
         
         
         
         
  
    
    

