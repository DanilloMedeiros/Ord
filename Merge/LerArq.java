package Merge;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArq{
   
    private List<String> lista = new ArrayList<String>();
    
    String c;//pegar os valores do arquivo
    
    public int[] ler(String path){
        
        try{
            Scanner in = new Scanner(new File(path));
            
            while (in.hasNext()) {//procura os inteiros no arquivo ate chegar em null
      
                c = in.nextLine();
               
                    lista.add(c);
    }
            in.close();
            
        }catch(Exception e){
            System.out.printf("Erro no arquivo");
        }
        
        
        int[] vetor = new int[lista.size()];
        
        for(int i=0;i<lista.size();i++){
            vetor[i] = Integer.valueOf(lista.get(i));//converte de String pra int
        }
        return vetor;
   }
    
}

