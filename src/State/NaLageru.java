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
class NaLageru extends Stanje{

    @Override
    String vratiStanje() {
        return " gitara - je na lageru!. Mozete doci kod nas da je probate!";
    }

    String promeniStanje(Stanje s) { return "***OBAVESTENJE!***Sada je proizvod na lageru"; }

}
