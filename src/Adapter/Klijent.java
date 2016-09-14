/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Radomir
 */
class Klijent {
    PocetnickaGitara g;
    Klijent(PocetnickaGitara potencijalnaGitara){
        g = potencijalnaGitara;
    }
    public static void main(String[] args) {
        
        BoljaGitara bg = new BoljaGitara("Seymour Duncan California 50s", "Mahagony", "Fender Vintage 50s");
        //(String naziv, String magneti, String telo, String zice)
        PocetnickaGitara pg = new GitaraAdapter("Squier Stratocaster", "fabricki", "Maple", "D'addario");


        
        System.out.println("Pre promene delova: "+pg.sviraj());//pre promene delova
        
        ((GitaraAdapter)pg).setBoljaGitara(bg);
        pg.postaviMagnete();
        pg.postaviTelo();
        
        System.out.println("Posle promene delova: "+pg.sviraj());
        
    }
}
