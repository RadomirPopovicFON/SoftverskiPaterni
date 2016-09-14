/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukture;

/**
 *
 * @author Radomir
 */
public class Klasa {
    
    private int atributPrvi;
    protected String atributDrugi;
    boolean atributTreci;

    public Klasa(int atributPrvi, String atributDrugi, boolean atributTreci) {
        this.atributPrvi = atributPrvi;
        this.atributDrugi = atributDrugi;
        this.atributTreci=atributTreci;
    }
    
    public void ispisiVrednosti(){
        System.out.println("Vrednost prvog atributa: "+this.atributPrvi+
                "\nDok je vrednost drugog atributa: "+this.atributDrugi
        +"\nDok je vrednost treceg atributa: "+this.atributTreci);
    }
    
    public static void main(String[] args) {
        Klasa instanca = new Klasa(5, "text", true);
        instanca.ispisiVrednosti();
    }
    
}
