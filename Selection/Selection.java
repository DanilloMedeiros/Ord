package Selection;

public class Selection {
    
    int[] a;
    
    public Selection(int[] v){
        
        a = v;
    }
    
    public int[] alg(){
        
        int aux,menor;
        
        for(int i=0; i<a.length ; i++){
            aux = i;
          
            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[aux]){
                    aux = j;
                }
            }
            if(aux != i){
                
                menor = a[aux];
                a[aux] = a[i];
                a[i] = menor;
                
            }
        }
        return a;
    }
}
