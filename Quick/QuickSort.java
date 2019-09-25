package Quick;

public class QuickSort {
    
    int[] quickSort(int vet[], int l, int r){ 
     
        if (l < r){ 
         
            int q = partition(vet, l, r); 
  
            // ordena recursivamente os elementos antes e depois do partition
            quickSort(vet, l, q-1); 
            quickSort(vet, q+1, r); 
        } 
        return vet;
    } 
   
    int partition(int vet[], int ini, int fim){ 
     
        int pivo = vet[fim];  
        int i = (ini-1); // menor elemento
        for (int j=ini; j<fim; j++){ 
         
            if(vet[j] < pivo){ 
                i++; 
                
                int temp = vet[i]; 
                vet[i] = vet[j]; 
                vet[j] = temp; 
            } 
        } 
  
        int temp = vet[i+1]; 
        vet[i+1] = vet[fim]; 
        vet[fim] = temp; 
  
        return i+1; 
    } 
   
}
