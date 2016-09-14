/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Radomir
 */
class BoljaGitara {
    
    String magneti;
    String telo;
    String naziv;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    public String getMagneti() {
        return magneti;
    }

    public void setMagneti(String magneti) {
        this.magneti = magneti;
    }

    public String getTelo() {
        return telo;
    }

    public void setTelo(String telo) {
        this.telo = telo;
    }

    public BoljaGitara(String magneti, String telo, String naziv) {
        this.magneti = magneti;
        this.telo = telo;
        this.naziv = naziv;
    }

    public String sviraj(){
        return "Kvalitet zvuka - Fantastican, uz delove gitare: "+this.getNaziv();
    }
    
}
