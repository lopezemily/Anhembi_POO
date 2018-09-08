package aula3_exemplo1;

public class Aula3_Exemplo1 {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 20;
        pessoa1.sexo = 'M';
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.idade = 30;
        pessoa2.sexo = 'F';
        
        pessoa1.apresentar();
        pessoa2.apresentar();
             
        pessoa1.fazerAniversario();
        pessoa1.apresentar();
        pessoa2.apresentar();
        
        System.out.println("O dobro da minha idade é: " + pessoa1.dobroIdade());
        
        int dobroIdade2 = pessoa2.dobroIdade();
        System.out.println(dobroIdade2);
        
        pessoa1.exibeSexo();
        pessoa2.exibeSexo();
    }
    
}
