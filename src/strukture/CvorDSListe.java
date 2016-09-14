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
public class CvorDSListe {

    int value;
    CvorDSListe next;
    CvorDSListe previous;
    
    public CvorDSListe(int value, CvorDSListe previous, CvorDSListe next) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public CvorDSListe getNext() {
        return next;
    }

    public void setNext(CvorDSListe next) {
        this.next = next;
    }

    public CvorDSListe getPrevious() {
        return previous;
    }

    public void setPrevious(CvorDSListe previous) {
        this.previous = previous;
    }
    
}
