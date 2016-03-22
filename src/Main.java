/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bptik-dev
 */
public class Main {
    public static void main(String[] args) {
        PegawaiDaoFilter p = new PegawaiDaoFilter();
        p.print(p.get());
        p.print(p.get("tunjangan", 1000.0));
        p.print(p.get("tunjangan", "<=", 1000.0));
        p.print(p.get("bonus", ">", 450.0));
    }
}
