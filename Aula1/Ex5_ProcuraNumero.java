import java.util.Scanner;

public class Ex5_ProcuraNumero {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] valores = new int[3];
        int x;
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite um valor: ");
            valores[i] = leia.nextInt();
        }
        System.out.println("Qual valor você quer procurar?");
        x = leia.nextInt();
        
        // valores = {10, 20, 30, ..., 90, 100}
        
        for (int i = 0; i < valores.length; i++) {
            if(x == valores[i]){
                System.out.println("Valor encontrado! :D");
                break;
            }else{
                System.out.println("Valor não encontrado! D:");
            }
        }
        
    }
    
}
