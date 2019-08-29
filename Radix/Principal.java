package Radix;

import java.util.ArrayList;
import java.util.List;

public class Principal{
    
    public static void main(String[] args){
        
         //int[] vetor = {5,10,-3,2,2,4,9,55,-7,0,1};
        
        String path = "C:\\Users\\Administrador\\Desktop\\instancias-num\\num.1000.1.in";
        LerArq arq = new LerArq();
        
        List<String> lista;
        lista = arq.ler(path);
        
        int[] vetor = new int[lista.size()];
        
        List<Integer> pos = new ArrayList<Integer>();
        List<Integer> neg = new ArrayList<Integer>();
        
        for(int i=0;i<lista.size();i++){
            vetor[i] = Integer.valueOf(lista.get(i));//converte de String pra int
        }
        
        for(int i=0;i<vetor.length;i++){
                if(vetor[i]<0)
                    neg.add(Math.abs(vetor[i]));
                else 
                    pos.add(vetor[i]);
    }
       
        int maiorn = neg.get(0);//maior dos negativos
        int maiorp = pos.get(0);//maior dos positivos
        
        for(int i=1;i<neg.size();i++){
            if(neg.get(i) > maiorn)
                maiorn = neg.get(i);
        }//achar o maior
        
        for(int i=1;i<pos.size();i++){
            if(pos.get(i) > maiorp)
                maiorp = pos.get(i);
        }
        
        Radix rn = new Radix(neg,maiorn);
        Radix rp = new Radix(pos,maiorp);
        
        int[] vetn;
        int[] vetp;
        
        long tempoc = System.nanoTime();//tempo de execuçao

        vetn = rn.Alg();
       
        vetp = rp.Alg();
        
        long tempof = System.nanoTime();
        long tempoTotal = tempof - tempoc;
        
        int[] vetorf = new int[lista.size()];
        int j=0;
        
        for(int i=vetn.length-1;i>=0;i--){
            vetorf[j] = vetn[i] * -1;
            j++;
        }
        
        for(int i=0;i<vetp.length;i++){
            vetorf[j] = vetp[i];
            j++;
        }
        
        //printar
        for(int i=0;i<vetorf.length;i++){
            System.out.printf("vet[%d] : %d \n",i,vetorf[i]);
            
        }
        
        System.out.println("Tempo de execuçao: " + tempoTotal);
    }
}
