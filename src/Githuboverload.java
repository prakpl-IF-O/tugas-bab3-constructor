/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Githuboverload {
    public static void main(String[] args) {
        
    Githuboverload2 a = new Githuboverload2();
        System.out.println("=====================");
        a.get();
        System.out.println("=====================");
        a.get(105);
        System.out.println("=====================");
        a.get("Tunjangan", 200);
        System.out.println("=====================");
        a.get("Bonus", ">=",1000);
}
}