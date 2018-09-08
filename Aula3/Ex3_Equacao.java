package ex3_equacao;

public class Ex3_Equacao {

    public static void main(String[] args) {
        Equacao caso1 = new Equacao();
        caso1.a = 1;
        caso1.b = -2;
        caso1.c = -3;
        caso1.calcularBaskara();
        
        Equacao caso2 = new Equacao();
        caso2.a = 1;
        caso2.b = 8;
        caso2.c = 16;
        caso2.calcularBaskara();
        
        Equacao caso3 = new Equacao();
        caso3.a = 10;
        caso3.b = 6;
        caso3.c = 10;
        caso3.calcularBaskara();
    }
    
}
