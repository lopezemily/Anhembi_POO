package sistemabancario;

import java.util.ArrayList;

public class GerenciarContas {

    private ArrayList<Conta> contas;

    public GerenciarContas() {
        contas = new ArrayList<Conta>();
    }

    public void adicionarConta(Conta c) {
        contas.add(c);
    }

    public boolean removerConta(int numeroConta) {
        Conta conta = buscarConta(numeroConta);
        if (conta == null) {
            return false;
        } else {
            contas.remove(conta);
            return true;
        }
    }

    public String buscarContasEspeciais() {
        String resultados = "";
        for (Conta conta : contas) {
            if (conta instanceof ContaEspecial) {
                resultados = resultados + "\n" + conta.imprimir();
            }
        }
        return resultados;
    }

    public String buscarClientesUsandoLimite() {
        String resultados = "";
        for (Conta conta : contas) {
            if (conta instanceof ContaCorrente) {
                if (((ContaCorrente) conta).usandoLimite()) {
                    resultados = resultados + "\n" + conta.imprimir();
                }
            }
        }
        return resultados;
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public boolean transferirValor(int numeroContaOrigem, int numeroContaDestino, float valor) {
        Conta contaOrigem = buscarConta(numeroContaOrigem);
        Conta contaDestino = buscarConta(numeroContaDestino);

        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);

        return true;
    }

    public boolean sacar(int numeroConta, float valorSacado) {
        Conta conta = buscarConta(numeroConta);

        if (conta == null) {
            return false;
        } else {
            boolean sucesso = conta.sacar(valorSacado);
            return sucesso;
        }
    }

    public boolean depositar(int numeroConta, float valorDepositado) {
        Conta conta = buscarConta(numeroConta);

        if (conta == null) {
            return false;
        } else {
            boolean sucesso = conta.depositar(valorDepositado);
            return sucesso;
        }

    }

    public String listaContas() {
        String resultados = "";
        for (Conta conta : contas) {
            resultados = resultados + "\n" + conta.imprimir();
        }
        return resultados;

    }

}
