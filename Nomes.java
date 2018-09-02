package Aula2_Ex1;

public class Nomes {

    public static void main(String[] args) {
        Nome("João", 30, "Coringão");
    }
    
    static void Nome(String nome,  int idade, String time){
        System.out.println("***************");
        System.out.println(nome + ", " + idade);
        System.out.println(time);
        System.out.println("***************");
    }
}
