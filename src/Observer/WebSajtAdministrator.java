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
abstract class WebSajtAdministrator 
{   
    List<Instrument> ponudaGitara;
    List<Instrument> ponudaBasGitara;
    List<Subscriber> pratioci;

    public WebSajtAdministrator() {
        this.ponudaGitara=new ArrayList<>();
        this.ponudaBasGitara=new ArrayList<>();
        this.pratioci=new ArrayList<>();
    }
    
    
    void obavesti(){
        for(Subscriber s : pratioci) {
            s.obavestiSve();
        }
    }
    
    void registruj(Subscriber s){
       this.pratioci.add(s);
    }
    
    void izbaciIzListe(Instrument ins){
        System.out.println("Kupljena :"+ins.getNaziv()+" !");
        if(ins instanceof Gitara) ponudaGitara.remove(ins);
        else ponudaBasGitara.remove(ins);
    }
    
    
    public static void main(String[] args) {
        Menadzer misko = new Menadzer();
        
        Gitara g1 = new Gitara("LesPaul", 180000);
        Gitara g2 = new Gitara("Fender Texas Stratocaster",125000);
        BassGitara b1 = new BassGitara("Ibanez bas", 27000);
        
        Subscriber s1 = new ObicanSubscriber(misko,"Pavle");
        Subscriber s2 = new ProdavacSubscriber(misko,"Djordje",g1);
        Subscriber s25 = new ProdavacSubscriber(misko,"Milos",g2);
        Subscriber s3 = new ObicanSubscriber(misko,"Nikola");
        Subscriber s4 = new ObicanSubscriber(misko,"Marko");
        Subscriber s5 = new ProdavacSubscriber(misko,"Stefan",b1);
        
        misko.izvrsiKupovinu(b1);
        misko.obavesti();
        
    }
}
