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
public class Radnik2 extends MitrosRadnik{

    Radnik2(){ponuda=new Ponuda();}
    @Override
    String testiraj(Ponuda p) {return "\nTestirana je je od strane drugog radnika - \nGitara: "+ponuda.gitara+
            "\nPojacalo: "
            +ponuda.pojacalo;}

    @Override
    void kreirajGitaru() {g = new Fender();}

    @Override
    void kreirajPojacalo() {p = new Orange();}

    @Override
    void kreirajPonudu() {
        this.ponuda.gitara = g.vratiGitaru();
        this.ponuda.pojacalo = p.vratiPojacalo();
    }
}
