package ex2_natacao;

import java.util.Scanner;

public class Ex2_Natacao {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        PesoIdeal pessoa0 = new PesoIdeal();
        System.out.println("Qual seu nome?");
        pessoa0.nome = leia.next();
        System.out.println("Qual seu sexo (F ou M)?");
        pessoa0.sexo = leia.next().charAt(0);
        System.out.println("Qual seu peso?");
        pessoa0.peso = leia.nextFloat();
        System.out.println("Qual sua altura?");
        pessoa0.altura = leia.nextFloat();
        pessoa0.exibirPesoIdeal();
        
        System.out.println();
        
        PesoIdeal pessoa1 = new PesoIdeal();
        pessoa1.nome = "Emily";
        pessoa1.altura = 1.56f;
        pessoa1.peso = 47.700f;
        pessoa1.sexo = 'F';
        pessoa1.exibirPesoIdeal();
        
    }
    
}
