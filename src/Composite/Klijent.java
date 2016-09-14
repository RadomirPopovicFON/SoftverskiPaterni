/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.Date;

/**
 *
 * @author student1
 */
class Klijent {
    
    static void objasniteMi(Kompozicija kom){
        kom.prikaz();
    }
    public static void main(String[] args){
        Kompozicija Gitara = new Kompozicija(100);
        Gitara.setNaziv("Fender Stratocaster");
        
        Kompozicija kom1 = new Glava(8);
        Kompozicija kom2 = new Vrat(40);
        Kompozicija kom3 = new Telo(52);
        
        Deo list1 = new GornjaKobila(4); 
        Deo list2 = new Civije(4); 
        Deo list3 = new Zice(15);
        Deo list4 = new Pragovi(25);
        Deo list5 = new Tremolo(8); 
        Deo list6 = new SwitchIVolumeZaMagnete(8);
        Deo list7 = new Magneti(36);
        
        Gitara.Dodaj(kom1); Gitara.Dodaj(kom2); Gitara.Dodaj(kom3);
        
        kom1.Dodaj(list1); kom1.Dodaj(list2);
        kom2.Dodaj(list3); kom2.Dodaj(list4);
        kom3.Dodaj(list5); kom3.Dodaj(list6); kom3.Dodaj(list7);
        
        Klijent.objasniteMi(Gitara);
    }
}
