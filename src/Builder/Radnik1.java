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
class Radnik1 extends MitrosRadnik{

    Radnik1(){ponuda=new Ponuda();}
    
    @Override
    String testiraj(Ponuda p) {return "\nTestirana je od strane prvog radnika - \nGitara: "+ponuda.gitara+
            "\nPojacalo: "
            +ponuda.pojacalo;} 

    @Override
    void kreirajGitaru() {g = new Gibson();}

    @Override
    void kreirajPojacalo() {p = new Marshall();}

    @Override
    void kreirajPonudu() {
        this.ponuda.gitara = g.vratiGitaru();
        this.ponuda.pojacalo = p.vratiPojacalo();
    }
}
