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
public class DSLista {
    
    CvorDSListe prvi;
    
    void ubaciNaPocetak(int value){
        if(prvi==null) { prvi = new CvorDSListe(value, null, prvi); return; }
        else {CvorDSListe novi = new CvorDSListe(value, null, prvi); prvi.previous=novi; prvi = novi;}
    }
    
    void ubaciNaKraj(int value){
        if(prvi==null) {prvi = new CvorDSListe(value, null, null);  return;}
        
        CvorDSListe pom = prvi;
        while(pom.next!=null){
            pom = pom.next;
        }
        
        CvorDSListe novi = new CvorDSListe(value, pom, null);
        pom.setNext(novi);
    }
    
    CvorDSListe izbaciSaPocetka(){
        if(prvi==null) return null;
        CvorDSListe pom = prvi;
        if(prvi.next!=null)
        prvi.next = prvi.next.next;
        return pom;
    }
    CvorDSListe izbaciSaKraja(){
        if(prvi==null || prvi.next==null){
            prvi=null; 
            return prvi;
        }
        
        CvorDSListe pom = prvi;
        if(pom.next!=null)
        while(pom.next.next!=null){
            pom = pom.next;
        }
        
        CvorDSListe pom2 = pom.next;
        pom.setNext(null);
        pom2.setPrevious(null);
        return pom2;
    }
    
    
}
