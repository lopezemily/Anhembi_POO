package ex3_equacao;

public class Equacao {
    int a, b, c;
    
    private boolean validarEquacao(){
        if(a < 0){
            return false;
        }else{
            return true;
        }
    }
    
    private int calcularDelta(){
        int delta;
        delta = b * b - 4 * a * c;
        return delta;
    }
    
    public void calcularBaskara(){
        double x1;
        double x2;
        
        if(validarEquacao() == true){
            int delta = calcularDelta();
            if(delta > 0){
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1: " + x1 + " x2: " + x2);
            }else if(delta == 0){
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x: " + x2);
            }else{
                System.out.println("Não existe raizes reais!");
            }
        }else{
            System.out.println("Não é uma equação do 2º grau.");
        }
    }
}
