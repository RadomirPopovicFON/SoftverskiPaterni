/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukture;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Radomir
 */

public class Strukture {
    
    public static int[] selectionSort(int[] niz){
        
        
        for(int i=0;i<niz.length-1;i++){
            int min=i;
            int j=i+1;
            while(j<niz.length){
                
                
                if(niz[j]<niz[min]){
                    
                    int pom = niz[min];
                    niz[min]=niz[j];
                    niz[j]=pom;
                }
                
                
                j++;
                
            }
        }
        return niz;
    }
    
    public static int[] bubbleSort(int[] niz){
        int levo;
        int desno;
        for(int i=0;i<niz.length-1;i++){
            for(int z=0;z<niz.length-1;z++)
            {
                levo=z; desno=z+1;
                if(niz[desno]<niz[levo]){
                    int pom=niz[levo];
                    niz[levo]=niz[desno];
                    niz[desno]=pom;
                }
            }
        }
        return niz;
    }
    public static int[] insertionSort(int[] niz){
        int i,j,index;
        for(i=1;i<niz.length;i++){
            index=niz[i];
            System.out.println("index:"+index);
            j=i;
            System.out.println("j:"+j);
            while((j>0)&&(niz[j-1]>index)){
                niz[j]=niz[j-1];
                j--;
            }
            niz[j]=index;
        }
        return niz;
    }
    public static int[] mergeSort(int[] niz){
        
        if(niz.length!=1){
            int[] noviNiz = new int[niz.length/2];
            noviNiz = popuniNiz(niz.length,niz,noviNiz);
            mergeSort(noviNiz);
        }
        
        return niz;
    }
    
    
    public static int[] popuniNiz(int krajnjiIndeksStarogNiza,int[] stariNiz,int[] NoviNiz){
    
        for(int br : stariNiz){
            if(br==krajnjiIndeksStarogNiza) break;
            NoviNiz[br]=stariNiz[br];
        }
        return NoviNiz;
    }
    public static int interpolacionoR(int pod,int[] niz,int l,int d,int brIt){
        
        
        if(l<=d){
            int index=l+(d-l)*(((pod-niz[l])/(niz[d]-niz[l])));
            if(niz[index]==pod) return index;
            if(niz[index]<pod) interpolacionoR(pod,niz,l+1,d,++brIt);
            else interpolacionoR(pod,niz,l,d-1,++brIt);
        }
        else
        System.out.println(brIt);
        return -1;
    }
    
    public static int zbirBrojevaKojiSePonavljaju(int[] niz){
        List<Integer> lista = new ArrayList<>();
        int zbir = 0;
        for(int br:niz){
            if(daLiSePonavlja(niz, br)){
                if(!lista.contains(br)){
                lista.add(br);
            System.out.println("dodaje se: "+br);
                zbir+=br;
                }
            }
        }
        return zbir;
        
        
    }
    
    public static boolean daLiSePonavlja(int[] niz,int broj){
        int brPon = 0;
        for(int br:niz){
            
            if(broj==niz[br]){brPon++;}
            if(brPon==2) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] niz = {1,2,3,2,3};
        //System.out.println(daLiSePonavlja(niz, 1));
        //System.out.println(zbirBrojevaKojiSePonavljaju(niz));
        
        int[] niz2 = {1,5,6,7,11,17,21,24,26,27,29,31,33,34,36,37,39,51,61,72,84,88,91,92,93};
        
        //interpolacionoR(31, niz2, 0, niz2.length-1, 0);
        
        
        
        
        
        //nesortiran = {3,6,2,75,22,25,91,4,6,10,1,3,91,88,87,86,12,15,9};
        int[] nesortiran ={8,2,4,9,5,6};
        int[] sortiran = insertionSort(nesortiran);
        
        for(int broj : sortiran){
            System.out.println(broj);
        }
        
    }
   
}
