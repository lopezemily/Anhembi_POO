import java.util.Scanner;

public class Ex1_Carro {

    
    public static void main(String[] args) {
        
        float custoCarro, custoFabrica;
               
        custoFabrica = pegarCustoFabrica();
        
        custoCarro = calcularCustoCarro(custoFabrica);
               
        mostrarCustoCarro(custoCarro);
    }
    
    public static float pegarCustoFabrica(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual é o custo de fabrica?");
        float custofab = leia.nextFloat();
        return custofab;
    }
    
    public static float calcularCustoCarro(float fabrica){
        float custoDistribuidor = 1.28f;
        float impostos = 1.45f;
        
        float custoCarro = fabrica * custoDistribuidor * impostos;
        return custoCarro;
    }
    
    public static void mostrarCustoCarro(float custo){
        System.out.println("O custo do carro é: " + custo);
    }
}
