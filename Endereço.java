package aula07_exemplo;

public class Endereço {
    private String logradouro;
    private int numero;
    private String CEP;
    
    public Endereço(){
        
    }    
    
    public Endereço(String logradouro, int numero, String CEP){
        this.logradouro = logradouro;
        this.numero = numero;
        this.CEP = CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }
    
    public String exibir(){
        return logradouro + "," + numero + "," + CEP;
    }
}
