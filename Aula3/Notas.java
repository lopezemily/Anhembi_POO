
package ex1_medias;

public class Notas {
    String nome;
    float atv1, atv2, atv3, atv4;
    
    private float notaN1(){
        float notaN1;
        notaN1 = (atv1 + atv2 + atv3)/3 * 0.40f;
        return notaN1;
    }

    private float notaN2(){
        float notaN2;
        notaN2 = atv4 * 0.60f;
        return notaN2;
    }

    public void exibirMediaFinal(){
        float media = notaN1() + notaN2();
        System.out.println("A média do " + nome + " foi de: " + media);
        
        if(media >= 5){
            System.out.println("Aluno aprovado! :D");
        }else{
            System.out.println("Aluno reprovado D:");
        }
    }
    
}
