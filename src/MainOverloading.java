/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andy Wiranto
 */
public class MainOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dataBase d1 = new dataBase(101, "Paijo", 2000, 1000, 500, 200);
        dataBase d2 = new dataBase(102, "Lala", 1750, 900, 500, 200);
        dataBase d3 = new dataBase(103, "Lulu", 2150, 1000, 300, 375);
        dataBase d4 = new dataBase(104, "Sabar", 1500, 750, 600, 200);
        dataBase d5 = new dataBase(105, "Sule", 2500, 850, 500, 300);
        dataBase d6 = new dataBase(106, "Paiman", 1500, 350, 450, 250);
        dataBase d7 = new dataBase(107, "Ponimin", 2000, 1000, 500, 200);
        dataBase d8 = new dataBase(108, "Sutiman", 1500, 1250, 500, 300);
        dataBase d9 = new dataBase(109, "Raja", 1000, 1000, 500, 200);
        dataBase d10 = new dataBase(110, "Harry", 2250, 1000, 200, 200);
       
        System.out.println(d1);
    }

}
