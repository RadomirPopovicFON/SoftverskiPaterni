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
class Voja extends MitrosRadnik{
    Bane b;

    public Voja(Skladiste s) {
        super(s);
        b = new Bane(s);
    }
    @Override
    double obracunajPopust(Proizvod g) {
        return b.obracunajPopust(g);
    }
    Proizvod predajGitaru(Proizvod p){
        System.out.println("Postovani, ovo je moze biti Vasa nova gitara!\n"
                + "Pun naziv je: "+p.vratiNaziv()+"["+p.vratiCenu()+"rsd]"
                + ".\nUspeli smo da izdejstvujemo, zbog blagog ostecenja, da smanjimo cenu za nekih "
                +this.obracunajPopust(p)
                +"dinara.\nPuna cena gitare za Vas iznosi "+p.vratiCenu()+"rsd\nDa li zelite da je kupite?");
        for(int i=0;i<s.getProizvodi().size();i++){
            if(s.getProizvodi().get(i).vratiNaziv().equals(p.vratiNaziv())) s.getProizvodi().remove(i);
        }
        b.obracunajSmanjenje();
        return p;
    } 
}
