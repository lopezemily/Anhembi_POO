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