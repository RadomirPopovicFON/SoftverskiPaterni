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
abstract class MitrosRadnik {
    Skladiste s;
    MitrosRadnik(Skladiste s){
        this.s=s;
    }
    abstract double obracunajPopust(Proizvod g);
}
