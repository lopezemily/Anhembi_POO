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
