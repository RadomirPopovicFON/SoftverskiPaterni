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
public class JSLista {
    CvorJSListe prvi;
    
    void ubaciNaPocetak(int value){
        if(prvi==null) {prvi = new CvorJSListe(value, prvi); return;}
        else {CvorJSListe novi = new CvorJSListe(value, prvi); prvi = novi;}
    }
    
    void ubaciNaKraj(int value){
        if(prvi==null) {prvi = new CvorJSListe(value, prvi); return;}
        
        CvorJSListe pom = prvi;
        while(pom.next!=null){
            pom = pom.next;
        }
        CvorJSListe novi = new CvorJSListe(value, null);
        pom.setNext(novi);
    }
    
    CvorJSListe izbaciSaPocetka(){
        if(prvi==null) return null;
        CvorJSListe pom = prvi;
        if(pom.next!=null)
        prvi.next = prvi.next.next;
        return pom;
    }
    CvorJSListe izbaciSaKraja(){
        if(prvi==null) return null;
        
        CvorJSListe pom = prvi;
        if(pom.next!=null)
        while(pom.next.next!=null){
            pom = pom.next;
        }
        
        CvorJSListe pom2 = pom.next;
        pom.setNext(null);
        return pom2;
    }
    
}
