/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Radomir
 */
class ObicanSubscriber implements Subscriber{
    Menadzer m;
    String username;
    String ponuda="";
    ObicanSubscriber(Menadzer m,String username){
        this.m = m;
        this.username=username;
        this.kreniDaMeObavestavas();
    }
    public void obavestiSve() {
        ponuda="Postovani "+this.username+"\n*****_______Doslo je do promene_______*****\n"+this.ispisiPonudu();
        System.out.println(ponuda);
    }

    @Override
    public void kreniDaMeObavestavas() {
        m.registruj(this);
        System.out.println("Postovani "+username+", dobrodosli, ponuda izgleda ovako: \n"+m.vratiPonudu());
    }
    
    @Override
    public String ispisiPonudu() {
        return m.vratiPonudu();
    }
}
