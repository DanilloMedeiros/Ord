package Counting;

public class Contagem {
    
    int[] b;//vetor de saida
    int[] c;//vetor auxiliar
   
    
    public int[] Alg(int[] a,int k,int men){
        
        int i;
        
        b = new int[a.length];
        c = new int[k+1];
        
        for( i=0;i<k;i++){
            c[i] = 0;
        }
        
        for( i=0;i<a.length;i++){
            c[a[i] - men]++;
            
        }//
        
        for( i=1;i<=k;i++){
            c[i] += c[i-1];
        }
        
        for(i = a.length-1;i>=0;i--){
            b[c[a[i] - men]-1] = a[i];
            c[a[i] - men]--;
        }
        
        return b;
        
    }
    
}
