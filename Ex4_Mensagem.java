package ex4_mensagem;

public class Ex4_Mensagem {

    public static void main(String[] args) {
        exibirMensagem("Emily", 21165368);
    }
    
    public static void exibirMensagem(String nome, int ra){
        tracinho(20);
        System.out.println(nome + " " + ra);        
        tracinho(20);
    }
    
    public static void tracinho(int traco){
        for (int i = 0; i < traco; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }
}
