package Counting;

import java.util.List;

public class Principal {
    
    public static void main(String[] args){
        
         //int[] vetor = {5,10,-3,2,2,4,9,55,-7,0,1};
        
        String path = "C:\\Users\\Administrador\\Desktop\\instancias-num\\num.1000.1.in";
        LerArq arq = new LerArq();
        
        List<String> lista;
        lista = arq.ler(path);
        
        int[] vetor = new int[lista.size()];
        
        
        for(int i=0;i<lista.size();i++){
            vetor[i] = Integer.valueOf(lista.get(i));//converte de String pra int
        }
        
        int maior = vetor[0];
        int menor = vetor[0];
        
        for(int i=1;i<vetor.length;i++){
            if(vetor[i] > maior)
                maior = vetor[i];
            
            if(vetor[i] < menor)
                menor = vetor[i];
        }//acha o menor e o maior valor do arranjo
       
        int k = maior - menor;//calculo do k para valores negativos
        
        int[] vetorf;
        Contagem c = new Contagem();
        
        long tempoc = System.nanoTime();//tempo de execuçao
        
        vetorf = c.Alg(vetor,k,menor);
        
        long tempof  = System.nanoTime();
        long tempoTotal = tempof - tempoc;
        
        for(int i=0;i<vetorf.length;i++){
            System.out.printf("b[%d] : %d \n",i,vetorf[i]);
            
        }
        
        System.out.println("Tempo de execução: " + tempoTotal);
    }
}
