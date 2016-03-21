/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githuboverload;

/**
 *
 * @author user
 */
public class Githuboverload2 {

    Githuboverload1[] go = new Githuboverload1[10];

    public void data() {
        go[0] = new Githuboverload1(101, "paijo", 2000, 1000, 500, 200);
        go[1] = new Githuboverload1(102, "lala", 1750, 900, 500, 200);
        go[2] = new Githuboverload1(103, "Lulu", 2150, 1000, 300, 375);
        go[3] = new Githuboverload1(104, "Sabar", 1500, 750, 600, 200);
        go[4] = new Githuboverload1(105, "sule", 2500, 750, 500, 300);
        go[5] = new Githuboverload1(106, "Paiman", 1500, 350, 450, 250);
        go[6] = new Githuboverload1(107, "ponimin", 2000, 1000, 500, 200);
        go[7] = new Githuboverload1(108, "weka", 1750, 1000, 750, 500);
        go[8] = new Githuboverload1(109, "budi", 2500, 400, 1000, 200);
        go[9] = new Githuboverload1(110, "cahyo", 1750, 800, 500, 200);
       

    }
        public void get(){
        data();
        for (int i = 0; i < go.length; i++) {
            go[i].display();
        }
    }
        public void get(int nik) {
        data();
        for (int i = 0; i < go.length; i++) {
            if (nik == go[i].getNik()) {
                go[i].display();
                break;
            }
        }
    }

    }

