/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AceOfSpades;

import java.util.Random;

/**
 *
 * @author Radomir
 */
public class Karta {
    Karta k;
    String poruka;
    
    String izvuciKartu(Karta karta){
        if(karta.poruka!="I don't share your greed, the only card I need is\n" +
"The Ace Of Spades") return izvuciKartu(karta);
        else return karta.poruka;
    }
    
    Karta igraj(){
        Random rand = new Random();
        int randomNum = rand.nextInt((4 - 1) + 1) + 1;
        Karta k = new Akaro();
        switch (randomNum){
            case 1 : {k = new Akaro(); break;}
            case 2 : {k = new Asrce(); break;}
            case 3 : {k = new Atref(); break;}
            case 4 : {k = new Apik(); break;}
        }
        return k;
    }
    
}
