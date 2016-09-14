/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author Radomir
 */
class Deo extends Gitara{

    double procenatZnacajnosti;
    public void setProcenatZnacajnosti(double procenatZnacajnosti) {
        this.procenatZnacajnosti = procenatZnacajnosti;
    }
    Deo(double procenatZnacajnosti) {
        super(procenatZnacajnosti);
    }@Override
    void prikaz() {
        System.out.println(this.naziv+", znacajnost: "+this.getProcenatZnacajnosti()+"%");
    }
}
