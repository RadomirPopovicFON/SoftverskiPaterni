/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AceOfSpades;

/**
 *
 * @author Radomir
 */
public class Kockar {
    
    Karta k;
    
    void izvuciKartu(Karta k){
        
        System.out.println("Izvlaci kartu: "+k.izvuciKartu(k));
    }
    
    public static void main(String[] args) {
        
        Karta k = new Atref(); k.izvuciKartu(k);
        
    }
    
}
