import java.util.Scanner;

public class Ex4_MenorValor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int valorDigitado, maiorValor = 0, menorValor = 100;
        int n = 20;
        float somaValores = 0, mediaValores;
                
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um valor de 0 a 100: ");
            valorDigitado = leia.nextInt();
            
            if(valorDigitado >= 0 && valorDigitado <= 100){
                somaValores += valorDigitado;

                if (valorDigitado < menorValor){
                    menorValor = valorDigitado;
                }
                if(valorDigitado > maiorValor){
                    maiorValor = valorDigitado;
                }
            }else{
                System.out.println("Não é um valor válido! :@");
                i--;
            }
        }

        mediaValores = somaValores / n;
                        
        System.out.println("A soma dos valores digitados é: " + somaValores);
        System.out.println("A média dos valores digitados é: " + mediaValores);
        System.out.println("O menor valor digitado foi: " + menorValor);
        System.out.println("O maior valor digitado foi: " + maiorValor);
    }
    
}
