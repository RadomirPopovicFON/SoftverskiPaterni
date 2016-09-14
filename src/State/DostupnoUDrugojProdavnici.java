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
class DostupnoUDrugojProdavnici extends Stanje{
    @Override
    String vratiStanje() {
        return " gitara - je dostupna u drugoj prodavnici! ";
    }
    @Override
    String promeniStanje(Stanje s) { return "***OBAVESTENJE!***Sada je proizvod na lageru"; }

}
