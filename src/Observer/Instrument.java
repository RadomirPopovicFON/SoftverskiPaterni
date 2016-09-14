/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Radomir
 */
abstract class Instrument {
    
    private String naziv;
    private double cena;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    Instrument(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }  
}
