package ex1_aula5;

public class Ex1_Aula5 {

    public static void main(String[] args) {
        Relogio relogio = new Relogio(5,80,12);
        
        relogio.exibir();
        relogio.setHora(89);
        relogio.exibir();
        relogio.setHora(8);
        relogio.exibir(); 
        
        relogio.setMin(12);
        relogio.exibir();
        
        relogio.setSeg(30);
        relogio.exibir();
    }
    
}
