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
class SredjivanjeTremola extends Servis{

    public SredjivanjeTremola(Servis sledece) {
        super(sledece);
    }

    @Override
    boolean uradiServis() {
        System.out.println("Sredjivanje tremola zavrseno!");
        return true;
    }
    
}
