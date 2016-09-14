/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author Radomir
 */
public class Instrument {
    
    Stanje s;
    String naziv;
    double cena;
    
    public Instrument(Stanje s, String naziv, double cena) {
        this.s = s;
        this.naziv = naziv;
        this.cena = cena;
    }

    public Stanje getS() {
        return s;
    }

    public void setS(Stanje s) {
        System.out.println(this.getNaziv()+" : "+s.promeniStanje(s));
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    void ispis(){
        System.out.println(this.getNaziv()+s.vratiStanje()); 
    }
    public static void main(String[] args) {
        DostupnoUDrugojProdavnici d = new DostupnoUDrugojProdavnici();
        Instrument squier = new Instrument(d, "Squier Stratocaster Classic Vibe 50s", 35000);
        squier.ispis();
        squier.setS(new NaLageru());
        System.out.println("\nKonacno kupljena!!!\n");
        squier.setS(new Nedostupno());
    } 
}
