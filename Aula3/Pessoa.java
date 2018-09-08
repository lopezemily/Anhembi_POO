package aula3_exemplo1;

public class Pessoa {
    String nome;
    char sexo;
    int idade;
    
    public void apresentar(){
        System.out.println("Olá! Eu sou " + nome + " e tenho " + idade +" anos :D" );
    }
    
    public int dobroIdade(){
        int dobro;
        
        dobro = idade * 2;
        return dobro;
    }
    
    public void exibeSexo(){
        if(sexo == 'F'){
            System.out.println("Sou mulher");
        }else{
            System.out.println("Sou homem");
        }
    }
    
    public void fazerAniversario(){
        idade = idade + 1;
    }
    
}
