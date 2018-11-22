package sistemabancario;

public class ContaCorrente extends Conta {

    //Adicionando novo atributo
    private float limite;

    //Construtores
    public ContaCorrente(int numeroConta, String nomeCliente, String CPF) {
        super(numeroConta, nomeCliente, CPF);
        setLimite(0.0f);
    }

    public ContaCorrente(int numeroConta, String nomeCliente, String CPF, float limite) {
        super(numeroConta, nomeCliente, CPF);
        setLimite(limite);
    }

    //Declaração dos Get e Set
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if (limite < 0) {
            throw new IllegalArgumentException("Nao e possivel atribuir um limite negativo");
        } else {
            this.limite = limite;
        }
    }

    //Demais metodos
    public boolean usandoLimite() {
        if (getSaldoConta() < 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean sacar(float valorSacado) {
        if (valorSacado < 0) {
            throw new IllegalArgumentException("Nao e possivel sacar um valor negativo");
        }

        float saldoTotal = saldoConta + limite;
        if (valorSacado <= saldoTotal) {
            saldoConta = saldoConta - valorSacado;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String imprimir() {
        return "Cliente: " + getNomeCliente() + " (CPF: " + getCPF() + ")" + "\nConta: " + getNumeroConta() + "\nSaldo: R$ " + getSaldoConta() + "\nLimite: " + limite;
    }
}