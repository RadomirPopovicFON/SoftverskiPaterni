/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Radomir
 */
class Nedostupno extends Stanje{
    
    String vratiStanje() {
        return " gitara - je trenutno nedostupna! Bicete kontaktirani cim budemo imali primerak!";
    }
    String promeniStanje(Stanje s) { return "***OBAVESTENJE!***Sada je proizvod nedostupan"; }

}
