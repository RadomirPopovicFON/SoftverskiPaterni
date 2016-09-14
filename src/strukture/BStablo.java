/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Radomir
 */
public class BStablo {
    
    
    CvorBStabla koren;
    
    public BStablo() {
    }

    public CvorBStabla getKoren() {
        return koren;
    }

    public void setKoren(CvorBStabla koren) {
        this.koren = koren;
    }
    
    public void dodajUStablo(int pod,CvorBStabla cvor){
        
        if(this.koren==null) {koren = new CvorBStabla(pod, null, null); return;}
        
        if(cvor.levoDete==null 
                &&
                cvor.desnoDete==null){
            if(cvor.pod>pod) cvor.levoDete = new CvorBStabla(pod, null, null);
            else cvor.desnoDete = new CvorBStabla(pod, null, null);
            
            return;
        }
        
        if(cvor.pod>pod) {
            if(cvor.levoDete==null) 
            {
                cvor.levoDete = new CvorBStabla(pod, null, null); 
                return;
            }
            dodajUStablo(pod, cvor.levoDete);
        }
        else {
            if(cvor.desnoDete==null) {
                cvor.desnoDete = new CvorBStabla(pod, null, null);
                return;
            }
            dodajUStablo(pod, cvor.desnoDete);
        }
        
        
    }
    public void stampajStabloPrefix(CvorBStabla cvor,int[][] niz){
        
        if(cvor==null) return;
        int pomeraj = this.vratiBrojManjih(this.koren,cvor.pod);
        //for(int i=0;i<this.vratiNivo(cvor)-1;i++) 
        //{
            System.out.println("niz["+(this.vratiNivo(cvor)-1)+"]["+pomeraj+"]="+cvor.pod);
            int i = Math.abs(4-this.vratiNivo(cvor));
            niz[i][pomeraj]=cvor.pod;//System.out.print("\t");
        //}
        //System.out.println(cvor.pod);
        stampajStabloPrefix(cvor.levoDete,niz);
        stampajStabloPrefix(cvor.desnoDete,niz);
        
    }
    
    public CvorBStabla nadjiCvor(CvorBStabla koren, int pod){
        if(koren==null) return null;
        
        if(koren.pod==pod) return koren;
        if(koren.pod>pod) return nadjiCvor(koren.levoDete, pod);
        else return nadjiCvor(koren.desnoDete, pod);
    }
    
    public int vratiBrojCvorova(CvorBStabla cvor){
        
        if(cvor==null) return 0;
        int brojac=0;
        return 1+vratiBrojCvorova(cvor.levoDete)+vratiBrojCvorova(cvor.desnoDete);
        
    }
    public int vratiBrojManjih(CvorBStabla cvor, int pod){
        
        if(cvor==null) return 0;
        int brojac=0;
        //System.out.println(cvor.pod+" VS "+pod);
        if(cvor.pod<pod) return 1+vratiBrojManjih(cvor.levoDete,pod)+vratiBrojManjih(cvor.desnoDete,pod); 
        else return vratiBrojManjih(cvor.levoDete,pod)+vratiBrojManjih(cvor.desnoDete,pod); 
        
    }
    
    public CvorBStabla vratiRoditelja(CvorBStabla koren, int pod){
//        System.out.println("koren je:"+koren.pod);
        if(koren==null) return null;
        if(koren.pod==pod) return null;
        if(koren.levoDete!=null && koren.levoDete.pod==pod)  return koren;
        if(koren.desnoDete!=null && koren.desnoDete.pod==pod)  return koren;
        CvorBStabla pom = vratiRoditelja(koren.levoDete,pod);
        if(pom!=null) return pom;
        return vratiRoditelja(koren.desnoDete, pod);
    }
    
    public int vratiPomeraj(CvorBStabla cvor){
        
        if(cvor.levoDete==null) return 0;
        return 0;
        
    }
    
    public int vratiNivo(CvorBStabla cvor){
        
        if(cvor==null) return 0;
        return Math.max(1+vratiNivo(cvor.levoDete),1+vratiNivo(cvor.desnoDete));
        
    }
    
    public CvorBStabla izbaciCvor(int pod,CvorBStabla cvor){
        
        CvorBStabla pom=null;
        
        if(this.koren.pod==pod) {pom=koren; koren=null; return pom;}
        
        if(cvor.levoDete!=null){
            if(cvor.levoDete!=null && cvor.levoDete.pod==pod)
            {
                pom = cvor.levoDete;
                if(cvor.levoDete.levoDete!=null) cvor.levoDete = cvor.levoDete.levoDete;
                if(cvor.levoDete.desnoDete!=null) cvor.desnoDete = cvor.levoDete.desnoDete;
                return pom;
            }
        }
        
        if(cvor.desnoDete.pod==pod){ 
            if(cvor.desnoDete!=null && cvor.desnoDete.pod==pod)
            {
                pom = cvor.levoDete;
                if(cvor.desnoDete.levoDete!=null) cvor.desnoDete = cvor.levoDete.desnoDete;
                if(cvor.desnoDete.desnoDete!=null) cvor.desnoDete = cvor.desnoDete.desnoDete;
                return pom;
            }
        }
        if(cvor.pod>pod) {
            if(cvor.levoDete!=null)
            izbaciCvor(pod, cvor.levoDete);
        }
        else{
            if(cvor.desnoDete!=null)
            izbaciCvor(pod, cvor.desnoDete);
        }
        return pom;
    }
    
    public static boolean daLiJeBST(CvorBStabla koren){
        
        return false;
    }
    public static void ubaciUNiz(int[] niz){
            niz[0]=7;
    }
    public static void main(String[] args) {
        
        
        BStablo tree = new BStablo();
        tree.dodajUStablo(50, tree.koren);
        tree.dodajUStablo(20, tree.koren);  
        tree.dodajUStablo(30, tree.koren);
        tree.dodajUStablo(90, tree.koren);
        tree.dodajUStablo(60, tree.koren);
        tree.dodajUStablo(95, tree.koren);
        tree.dodajUStablo(55, tree.koren);
        tree.dodajUStablo(80, tree.koren);
        
        int[][] niz2d = new int[4][9];
        tree.stampajStabloPrefix(tree.koren, niz2d);
        
        
//        int[][] niz2d = new int[3][8];
//        int brojac = 0;
//        
//        for (int r=0; r<niz2d.length; r++) {
//            for (int c=0; c<niz2d[r].length; c++) {
//                niz2d[r][c]=brojac++;//your value
//            }
//        }
//        
        for (int r=0; r<niz2d.length; r++) {
            for (int c=0; c<niz2d[r].length; c++) {
                System.out.print(niz2d[r][c]+"\t");
            }
            System.out.println();
        }
//        
        
        //System.out.println("Nivo je: "+tree.vratiNivo(tree.nadjiCvor(tree.koren, 80)));
        //tree.stampajStabloPrefixIt(tree.koren);
        
//        CvorBStabla c = tree.vratiRoditelja(tree.koren,60);
//        
//        //System.out.println(tree.vratiRoditelja(tree.koren,tree.vratiRoditelja(tree.koren,80).pod).pod);
//        System.out.println("Broj manjih: "+tree.vratiBrojManjih(tree.koren, 80));
    }
}
