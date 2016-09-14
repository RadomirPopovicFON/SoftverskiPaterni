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
public class Queue {
    
    int brEl;
    int[] niz;
    int p;
    int k;

    Queue(int dim) {
        niz = new int[dim];
        brEl = 0;
        p=0;
        k=-1;
    }
    
    void push(int value){
        if(niz.length==brEl) 
        {
            System.out.println("Pun"); return;
        }
        k++; brEl++;//OVO PRVO
        if(niz.length==k) k=0;
        niz[k]=value;
    }
    
    int pop(){
        if(brEl==0)
        {
            System.out.println("prazan"); return -99;
        }
        int pom = niz[p++];
        if(p==niz.length) p=0;
        brEl--;
        return pom;
    }
    
}
