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
public class CvorJSListe {
    int value;
    CvorJSListe next;

    public CvorJSListe(int value, CvorJSListe next) {
        this.value = value;
        this.next = next;
    }

    public CvorJSListe getNext() {
        return next;
    }

    public void setNext(CvorJSListe next) {
        this.next = next;
    }
    
}
