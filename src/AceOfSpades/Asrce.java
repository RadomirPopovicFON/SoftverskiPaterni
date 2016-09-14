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
public class Asrce extends Karta{

    public Asrce() {
        this.poruka = "Kec srce predstavlja ljubav, sreću, dom i ljubavno pismo...Kockaru ovo ne treba\n";
        
    }
    
    @Override
    String izvuciKartu(Karta k) {
        return super.izvuciKartu(this); //To change body of generated methods, choose Tools | Templates.
    }


    
}
