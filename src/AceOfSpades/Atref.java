/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AceOfSpades;

/**
 *
 * @author Radomir
 */
public class Atref extends Karta{

    public Atref() {
        this.poruka = "Kec tref predstavlja bogatstvo, prosperitet, neočekivani novac i dobitak. Međutim, u zavisnosti od okolnih karti, može predstavljati novac koji će se veoma brzo potrošiti.\n" +
"    ...\nNe kockaš se da dobiješ, kockaš se da bi mogao da se kockaš i sutradan\n";
    }
 
    
    
    @Override
    String izvuciKartu(Karta k) {
        return super.izvuciKartu(this); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
