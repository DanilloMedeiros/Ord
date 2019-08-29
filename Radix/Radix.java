package Radix;

import java.util.List;

public class Radix{
    
    int[] b;//vetor de saida
    int[] c;//vetor auxiliar
    int[] a;//vetor entrada
    int k;
    
    public Radix(List<Integer> a,int k){
        
        this.a = new int[a.size()];
        
        for(int i=0;i<a.size();i++){
            this.a[i] = a.get(i);
        }
        this.k = k;
        
    }
    
    public int[] Alg(){ 
        
        for (int i = 1; k/i > 0; i*= 10) 
            Cont(i); 
        
        //mostrar();
        return a;
    }
    
    public void Cont(int d){
        
        int i;
        
        b = new int[a.length];
        c = new int[10];
        
        
        for( i=0;i<10;i++){
            c[i] = 0;
        }
        
        for( i=0;i<a.length;i++){
            c[( a[i]/d) % 10 ]++;
            
        }//
        
        for( i=1;i<10;i++){
            c[i] += c[i-1];
        }
        
        for(i = a.length-1;i>=0;i--){
            b[c[(a[i]/d) % 10]-1] = a[i];
            c[(a[i]/d) % 10]--;
            
        }
        
        for (i = 0; i < a.length; i++) 
            a[i] = b[i]; 
          
    }
    
     
}
