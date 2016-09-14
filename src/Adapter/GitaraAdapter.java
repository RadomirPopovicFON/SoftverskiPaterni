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
class GitaraAdapter implements PocetnickaGitara{
    
    BoljaGitara bg;
    
    String naziv;
    String magneti;
    String zice;
    String telo;

    public String getMagneti(){
        return this.magneti;
    }
    
    public void setMagneti(String magneti){
        this.magneti = magneti;
    }
    
    public String getTelo(){
        return this.telo;
    }
    
    public void setTelo(String telo){
        this.telo = telo;
    }
    
    public String getZice() {
        return zice;
    }

    public void setZice(String zice) {
        this.zice = zice;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public GitaraAdapter(String naziv, String magneti, String telo, String zice) {
        
        this.naziv = naziv;
        this.magneti = magneti;
        this.telo = telo;
        this.zice = zice;
        
    }
    
    public void setBoljaGitara(BoljaGitara bg){
        this.bg = bg;
    }
    
    public BoljaGitara getBoljaGitara(){
        return this.bg;
    }

    @Override
    public String sviraj() {
        
        if(this.getTelo()=="Maple" && this.getMagneti()=="fabricki"){
            return "Kvalitet zvuka - Zadovoljavajuci";
        }
        if(this.getTelo()=="Mahagony" && this.getMagneti()=="Seymour Duncan California 50s"){
            return this.bg.sviraj();
        }
        return "Odabrati gitaru pre sviranja";
    }

    @Override
    public void postaviTelo() {
        this.setTelo(bg.getTelo());
    }

    @Override
    public void postaviMagnete() {
        this.setMagneti(bg.getMagneti());
    }
    
}
