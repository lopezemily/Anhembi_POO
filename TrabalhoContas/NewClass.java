//CLASSE CONTA
package sistemabancario;

public abstract class Conta {
    //Declaração dos atributos da conta

    private int numeroConta;
    private String nomeCliente;
    private String CPF;
    protected float saldoConta;

    //Construtor
    public Conta(int numeroConta, String nomeCliente, String CPF) {
        setNumeroConta(numeroConta);
        setNomeCliente(nomeCliente);
        setCPF(CPF);
        setSaldoConta(0.0f);
    }

    //Declaração dos Gets
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    //Declaração dos Sets
    private void setNumeroConta(int numeroConta) {
        if (numeroConta <= 0) {
            throw new IllegalArgumentException("O numero da conta nao pode ser negativo");
        }
        this.numeroConta = numeroConta;
    }

    private void setCPF(String CPF) {
        if (CPF.length() < 11 && !CPF.contains(".")) {
            throw new IllegalArgumentException("O CPF deve conter 11 digitos nao deve conter ponto(.) ");
        }
        this.CPF = CPF;
    }

    private void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == "") {
            throw new IllegalArgumentException("O nome nao pode ser vazio");
        }
        this.nomeCliente = nomeCliente;
    }

    //Demais métodos
    public boolean sacar(float valorSacado) {
        if (valorSacado < 0) {
            throw new IllegalArgumentException("Nao e possivel sacar um valor negativo");
        }

        if (valorSacado <= saldoConta) {
            saldoConta = saldoConta - valorSacado;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(float valorDepositado) {
        if (valorDepositado < 0) {
            throw new IllegalArgumentException("Nao e possivel depositar valores negativos");
        }

        saldoConta = saldoConta + valorDepositado;
        return true;
    }

    public String imprimir() {
        return "Cliente: " + nomeCliente + " (CPF: " + CPF + ")" + "\nConta: " + numeroConta + "\nSaldo: R$ " + saldoConta;
    }

}

}
//CONTA CORRENTE
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

//CONTA POUPANÇA
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

//CONTA ESPECIAL
package sistemabancario;

public class ContaEspecial extends ContaCorrente {

    private String nomeGerenteResponsavel;

    //Contrutores
    public ContaEspecial(int numeroConta, String nomeCliente, String CPF, String nomeGerenteResponsavel) {
        super(numeroConta, nomeCliente, CPF);
        setNomeGerenteResponsavel(nomeGerenteResponsavel);
    }

    public ContaEspecial(int numeroConta, String nomeCliente, String CPF, float limite, String nomeGerenteResponsavel) {
        super(numeroConta, nomeCliente, CPF, limite);
        setNomeGerenteResponsavel(nomeGerenteResponsavel);
    }

    //Declaração dos Get e Set
    public String getNomeGerenteResponsavel() {
        return nomeGerenteResponsavel;
    }

    public void setNomeGerenteResponsavel(String nomeGerenteResponsavel) {
        if (nomeGerenteResponsavel == "") {
            throw new IllegalArgumentException("O nome nao pode ser vazio");
        }
        this.nomeGerenteResponsavel = nomeGerenteResponsavel;
    }

    @Override
    public String imprimir() {
        return "Cliente: " + getNomeCliente() + " (CPF: " + getCPF() + ")" + "\nConta: " + getNumeroConta() + "\nSaldo: R$ " + getSaldoConta() + "\nLimite: " + getLimite() + "\nGerente Responsavel: " + nomeGerenteResponsavel;
    }
}
