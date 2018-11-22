package sistemabancario;

public class ContaPoupanca extends Conta {

    //Construtor
    public ContaPoupanca(int numeroConta, String nomeCliente, String CPF){
        super(numeroConta, nomeCliente, CPF);
    }
    
    //Demais Método
    public void calcularRendimento(float porcentagemRendimento){
        float rendimento = porcentagemRendimento * saldoConta;
        saldoConta = saldoConta + rendimento;
    }

}