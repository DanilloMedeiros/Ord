package Selection;

public class Principal {
    
    public static void main(String[] args){
        
        //int[] vet = {8,3,2,9,7,5};
        int[] vet;
        int[] vetf;
        
        String path = "C:\\Users\\Administrador\\Desktop\\instancias-num\\num.1000.1.in";
        LerArq arq = new LerArq();
        vet = arq.ler(path);
        
        Selection s = new Selection(vet);
        
        vetf = s.alg();
        
        for(int i=0;i<vet.length;i++){
            System.out.println(vetf[i]);
            
        }
    }
}



