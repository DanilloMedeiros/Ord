package Merge;

public class MergeSort {
   
    int[] mergeSort(int vet[], int p, int r){ 
	 
	if (p < r){ 
                        
            //ponto do meio
            int q = (p+r)/2; 

            // ordenar as subdivisoes 
            mergeSort(vet, p, q); 
            mergeSort(vet , q+1, r); 

            // junta as divisoes 
            merge(vet, p, q, r); 
        }
                return vet;
    }
    
                      
    void merge(int vet[], int p, int q, int r){
     
        int n1 = q - p + 1; 
        int n2 = r - q; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        
        for (int i=0; i<n1; ++i) 
            L[i] = vet[p + i]; 
        
        for (int j=0; j<n2; ++j) 
            R[j] = vet[q + 1+ j]; 
        
        int i = 0, j = 0; 
   
        int k = p; 
        
        while (i < n1 && j < n2){ 
         
            if (L[i] <= R[j]){
            
                vet[k] = L[i]; 
                i++; 
            } 
            else{
            
                vet[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1){ 
         
            vet[k] = L[i]; 
            i++; 
            k++; 
        } 
 
        while (j < n2){
        
            vet[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 

}
    

