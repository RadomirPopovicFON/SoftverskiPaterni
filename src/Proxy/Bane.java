/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

import java.util.List;

/**
 *
 * @author Radomir
 */
class Bane extends MitrosRadnik{

    public Bane(Skladiste s) {
        super(s);
    }
    @Override
    double obracunajPopust(Proizvod p) {
        List<Proizvod> artikli = s.getProizvodi();
        double suma = 0;
        for(Proizvod pp : artikli){
            suma+=pp.vratiCenu();
        }
        double prosek = suma/artikli.size();
        double regularnaCena = p.vratiCenu();
        double razlika = Math.abs(prosek-regularnaCena);
        p.postaviCenu(regularnaCena-razlika);
        return razlika;
    }
    void obracunajSmanjenje(){
        for(Proizvod proizv : s.getProizvodi()){
            proizv.postaviCenu(proizv.vratiCenu()*1.1);
        }
    }  
}
