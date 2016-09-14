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
public class Stack {
    int vrh;
    int[] niz;

    Stack(int dim) {
        niz = new int[dim];
        vrh = -1;
    }
    
    void push(int value){
        if(vrh==niz.length-1) {System.out.println("pun"); return;}
        niz[++vrh]=value;
    }
    
    int pop(){
        if(vrh==-1) { System.out.println("prazan"); return -999;}
        int pom = niz[vrh--];
        return pom;
    }
    static int[][] promena(int[][] niz2D){
        int[][] noviNiz = new int[3][3];
        for(int i=0;i<niz2D.length;i++){
            for(int j=0;j<niz2D[i].length;j++){
                
                int pom = niz2D[j][i];
                niz2D[i][j] = niz2D[j][i];
                niz2D[j][i] = pom;
                
                //noviNiz[i][j]=niz2D[j][i];
            }
        }
        return niz2D;
    }
    boolean isEmpty(Stack s){
        if(vrh==-1) return true;
        return false;
    }
    void StackSort( Stack S )
    {
    
    if( isEmpty( S ) )
     return;
     
    int X=S.vrh;
    S.pop();
    
    StackSort( S );
    Insert( X , S );
    
    }
    public static int countWays(int n) {
        if (n<0)
        { 
            return 0; 
        }
        else if (n==0){ return 1; } 
        else {
            return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
        } 
    }
    void Insert( int X , Stack S ) 
    {
    if( isEmpty( S ) )
     {
          S.push( X );
          return;
          
          }
          
     if( X > S.vrh )
      {
           int t=S.vrh;
           S.pop();
           
           Insert( X , S );
           S.push( t );
           
           }
           
     else
      {
           S.push( X );
           return;
           
           }
           
           
    }
    static void printFib(int a,int b){
        
        int c;
        while(a<44){
        c=a+b;
        System.out.print(a+"-"+b+"-"+(c)+"-");
        a = c+b;
        b= c+b+c;
        }
    }
    
    public Double rpn(TokenList tokens) {
    DoubleStack stack = ...;
    }
    private void performOperation(Token operator, DoubleStack stack) {
    double a = stack.pop();
    double b = stack.pop();
    if (operator.equals(PLUS_TOKEN)) {
    stack.append(a + b);
    } else if (...) {
    }
    }
    
    public static void main(String[] args) {
        
        Stack s = new Stack(10);
        s.push(2);s.push(8);s.push(4);s.push(6);s.push(10);
        s.push(3);s.push(7);s.push(1);s.push(5);s.push(9);
        s.StackSort(s);
        
        for(int i=0;i<s.niz.length-1;i++){
            System.out.println("Clan stacka: "+s.niz[i]);
        }
        System.out.println(countWays(3));   
        System.out.println("fib");
        printFib(0, 1);
    }
}
