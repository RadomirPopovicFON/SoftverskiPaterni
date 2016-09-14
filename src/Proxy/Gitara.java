/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proxy;

/**
 *
 * @author Radomir
 */
class Gitara implements Proizvod{
    String naziv;
    double cena;
    Gitara(String naziv,double cena){
        this.naziv = naziv;
        this.cena = cena;
    }
    @Override
    public String vratiNaziv() {return this.naziv;}

    @Override
    public double vratiCenu() {return this.cena; }

    @Override
    public void postaviCenu(double cena) {
        this.cena = cena;
    }  
}
