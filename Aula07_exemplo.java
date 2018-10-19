package aula07_exemplo;

public class Aula07_exemplo {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Emily", 21, "Rua dos bobos", 0, "12345-678");
        
        System.out.println("A pessoa: " + p2.getNome());
        System.out.println("Mora em: " + p2.getEndereco().getLogradouro());
        System.out.println(p2.exibir());
    }
    
}
