/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Abstract.*;

/**
 *
 * @author Radomir
 */
class Musterija {
    MitrosRadnik radnik;
    
    Musterija(MitrosRadnik mr){radnik=mr;}
    void Konstruisi(){
        radnik.kreirajGitaru();
        radnik.kreirajPojacalo();
        radnik.kreirajPonudu();
        System.out.println(radnik.testiraj(radnik.ponuda));
    }
    public static void main(String[] args) {
        Musterija pavle;
        Radnik1 bane = new Radnik1();
        Radnik2 voja = new Radnik2();
        
        pavle = new Musterija(voja);
        pavle.Konstruisi();
        
        pavle = new Musterija(bane);
        pavle.Konstruisi();
        
    }
}
