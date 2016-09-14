/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsalibity;

/**
 *
 * @author Radomir
 */
class SredjivanjeHeadstocka extends Servis{

    public SredjivanjeHeadstocka(Servis s) {
        super(s);
    }
    

    @Override
    boolean uradiServis() {
        System.out.println("Sredjivanje headstock-a zavrseno!");
        return true;
    }    
}
