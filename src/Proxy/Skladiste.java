/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Radomir
 */
class Skladiste {
    List<Proizvod> gitareIPojacala;
    Skladiste(){
        gitareIPojacala = new ArrayList<>();
        gitareIPojacala.add(new Gitara("Schecter Damien Elite FR",80000.00));
        gitareIPojacala.add(new Gitara("Epiphone Les Paul",65000.00));
        gitareIPojacala.add(new Gitara("Yamaha Pacifica",32000.00));
        gitareIPojacala.add(new Gitara("VOX Pathfinder 10 Guitar Combo",10000.00));
        gitareIPojacala.add(new Gitara("Squier Affinity Series",14000.00));
        gitareIPojacala.add(new Gitara("Squier Affinity Series",14000.00));
        gitareIPojacala.add(new Gitara("Squier Affinity Series",14000.00));
        gitareIPojacala.add(new Gitara("Squier Affinity Series",14000.00));
        gitareIPojacala.add(new Gitara("Ovation Celebrity CC44",34000.00));
        gitareIPojacala.add(new Gitara("Squier Classic Vibe 50s",35000.00));
    }
    List<Proizvod> getProizvodi(){
        return gitareIPojacala;
    }  
}
