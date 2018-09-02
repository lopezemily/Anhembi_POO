import java.util.Scanner;

public class Ex2_AnoBissexto {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int ano;
        
        System.out.println("Qual ano quer checar?");
        ano = leia.nextInt();
                
        if(ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0){
            System.out.println("É um ano bissexto! (:");
        }
        else 
            System.out.println("Não é um ano bissexto :(");
    }
    
}
