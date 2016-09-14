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
class Klijent {
    MitrosRadnik radnik;

    public Klijent(MitrosRadnik radnik) {
        this.radnik = radnik;
    }
    
    public static void main(String[] args) {
        
        Skladiste s = new Skladiste();
        Voja voja = new Voja(s);
        Bane bane = new Bane(s);
        Klijent pavle = new Klijent(voja);
        double cena = 0;
        Proizvod g = new Gitara("Squier Classic Vibe 50s", cena);
        
        for(Proizvod p : s.getProizvodi()){
            if(p.vratiNaziv().equals((g).vratiNaziv()))
                cena = p.vratiCenu();
        }
        g.postaviCenu(cena);
        Gitara squier = (Gitara) ((Voja)(pavle.radnik)).predajGitaru((Proizvod)g);
        System.out.println("\nDA! "
                +squier.vratiCenu()+
                "\nMoja nova gitara se dakle zove: "+squier.vratiNaziv()+"!");
        
        System.out.println("Mada..kako to da je ostecena? Ne bih ipak tek takvu da je kupujem.");
    }
}
