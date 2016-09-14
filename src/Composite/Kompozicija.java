/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;

/**
 *
 * @author Radomir
 */
class Kompozicija extends Gitara{

    List<Gitara> delovi;
    double procenatZnacajnosti;
    static int nivo=0;
    int brDelova;

    
    public List<Gitara> getDelovi() {
        return delovi;
    }
    public void setDelovi(List<Gitara> delovi) {
        this.delovi = delovi;
    }
    public int getBrDelova() {
        return brDelova;
    }
    public void setBrDelova(int brDelova) {
        this.brDelova = brDelova;
    }
    
    Kompozicija(double procenatZnacajnosti) {
        super(procenatZnacajnosti);
        delovi = new ArrayList<Gitara>();
        brDelova=0;
        
    }
    @Override
    void prikaz() {
        
        System.out.println(naziv+", znacajnost: "+this.getProcenatZnacajnosti()+"% sastoji se iz: ");
        
        for(int i=0;i<brDelova;i++){
            nivo++;
            pomeraj(i);
            delovi.get(i).prikaz();
            nivo--;
        }
        
    }
    void pomeraj(int i){
        for(int j=0;j<nivo;j++){
            System.out.print("\t");
        }
    }
    void Dodaj(Gitara k){
        delovi.add(k); brDelova++;
    }
}
