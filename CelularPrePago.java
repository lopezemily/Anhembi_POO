package avaliacaocelular;

public class CelularPrePago {

    private String nomeCliente;
    private int telefone;
    private float saldo;
    
        public void fazerligacao(String nomeCliente, int telefone, float saldo) {
            this.nomeCliente = nomeCliente;
            this.telefone = telefone;
            this.saldo = saldo;
            
            float ligacao = 0.75f;

        if (saldo < ligacao) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo = saldo - ligacao;
        }
    }

    public float recarregar(float valorCarga) {
        if (valorCarga < 0) {
            System.out.println("Valor inválido");
        } else {
            this.saldo = valorCarga + saldo;
        }
        return saldo;
    }

    public void exibir() {
        System.out.println(nomeCliente + "(" + telefone + "), seu saldo é: " + saldo);
    }
    
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public int getTelefone(){
        return telefone;
    }
    
    public float getSaldo(){
        return saldo;
    }
}
