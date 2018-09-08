package ex2_natacao;

public class PesoIdeal {
    String nome;
    char sexo;
    float altura;
    float peso;
    
    public void exibirPesoIdeal(){
        float pesoIdeal = 0;
        
        if(sexo == 'F'){
            pesoIdeal = (62.1f * altura) - 44.7f;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        }else if (sexo == 'M'){
            pesoIdeal = (72.7f * altura) - 58f;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        }else{
            System.out.println("Não foi possível verificar");
        }
        
        if(peso > pesoIdeal){
            System.out.println("Você está acima do seu peso ideal (gordinho)");
        }else{
            System.out.println("Você está abaixo do seu peso ideal (magrinho)");
        }
    }    
}
