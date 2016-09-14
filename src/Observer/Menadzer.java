/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Radomir
 */
class Menadzer extends WebSajtAdministrator
{
    Menadzer(){
        super();
    }
    void DodajUPonuduGitara(Instrument gitara){
        ponudaGitara.add(gitara);
        super.obavesti();
    }
    void DodajUPonuduBasGitara(Instrument bas){
        ponudaBasGitara.add(bas);
        super.obavesti();
    }
    
    void registruj(Subscriber s){
        super.registruj(s);
    }
    void izvrsiKupovinu(Instrument ins){
        super.izbaciIzListe(ins);
    }
    String vratiPonudu(){
        String text="";
        text+="Trenutna ponuda:\n";
        for(Instrument i : ponudaGitara){
                text+="Naziv: "+i.getNaziv()+", cena: "+i.getCena()+"\n";
            
        }
        for(Instrument i : ponudaBasGitara){
            text+="Naziv: "+i.getNaziv()+", cena: "+i.getCena()+"\n";
            
        }
        return text;
    }
}
