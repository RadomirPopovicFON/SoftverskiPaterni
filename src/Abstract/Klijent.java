/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Radomir
 */
class Klijent {
    MitrosRadnik radnik;
    Gitara g;
    Pojacalo p;
    String kreiraj(MitrosRadnik mr){
        g = mr.kreirajGitaru();
        p = mr.kreirajPojacalo();
        String ponuda = "Ponuda gitare/pojacala : "+g.vratiGitaru()+"/"+p.vratiPojacalo();
        return this.testirajInstrument(ponuda);
        
    }
    String testirajInstrument(String ponuda){
        return "Pavle je testirao gitaru koja se sastoji iz ponude \n"+ponuda;
    }
    public static void main(String[] args) {
        Klijent pavle = new Klijent();
        
        Radnik1 bane = new Radnik1();
        Radnik2 voja = new Radnik2();
    
        System.out.println(pavle.kreiraj(voja));
        System.out.println("\nNakon toga,\n"+pavle.kreiraj(bane));
    }
}
