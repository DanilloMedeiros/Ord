package Insertion;

public class Insertion {
    
    int[] des;
    
    public Insertion(int[] a){
        
        des = a;
    }
    
    public int[] alg(){
        
        int[] ord = new int[des.length];//vetor ordenado
        
        ord[0] = des[0];
        int j;
       
         for(int i = 1; i < des.length; i++){
             
             int aux = des[i];
             int t = i;
             
            for( j = i; j > 0; j--){
                
                if(ord[j-1] >= aux){
                    ord[j] = ord[j-1];
                    t--;
                }else
                    break;
            }//enquanto o escolhido for menor
            
            ord[t] = aux;
        }
        
        return ord;
    }
}	



/*for (int i = 1; i < des.length; i++){
			
			int aux = des[i];
			int j = i;
			
			while ((j > 0) && (des[j-1] > aux)){
				des[j] = des[j-1];
				j -= 1;
			}
			des[j] = aux;
		}
	*///codigo usando somente um vetor
