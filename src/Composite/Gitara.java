/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;
import java.util.List;
/**
 *
 * @author Radomir
 */
abstract class Gitara {
    
    String naziv;
    double procenatZnacajnosti;
    
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public double getProcenatZnacajnosti(){
        return procenatZnacajnosti;
    }
    public void setProcenatZnacajnosti(){
        this.procenatZnacajnosti=procenatZnacajnosti;
    }
    Gitara(double procenatZnacajnosti){
       this.naziv = this.getClass().getSimpleName();
       this.procenatZnacajnosti=procenatZnacajnosti;
    }
    
    abstract void prikaz(); 
}
