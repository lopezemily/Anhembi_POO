package positivonegativo;

public class PositivoNegativo {

    public static void main(String[] args) {
        Teste(50);
        Teste(-10);
    }
    
    public static void Teste(int numero){
        if(numero >=0){
            MostrarResultado(numero, "positivo :D");
        }else
            MostrarResultado(numero, "negativo D:");
    }
    
    public static void MostrarResultado(int numero, String resultado){
        System.out.println("O número " + numero + " é " + resultado);
    }
    
}
