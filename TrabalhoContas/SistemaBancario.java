package sistemabancario;

import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        GerenciarContas gerenciador = new GerenciarContas();
        int opcaoEscolhida = 0;

        do {
            try {
                ImprimeOpcoes();
                opcaoEscolhida = leia.nextInt();

                switch (opcaoEscolhida) {
                    case 0:
                        System.out.println("Operação finalizada com sucesso!");
                        break;
                    case 1:
                        CriaConta(leia, gerenciador);
                        break;
                    case 2:
                        RemoverConta(leia, gerenciador);
                        break;
                    case 3:
                        BuscarConta(leia, gerenciador);
                        break;
                    case 4:
                        SaqueConta(leia, gerenciador);
                        break;
                    case 5:
                        DepositoConta(leia, gerenciador);
                        break;
                    case 6:
                        TranferenciaConta(leia, gerenciador);
                        break;
                    case 7:
                        ListarContas(gerenciador);
                        break;
                    case 8:
                        ListarContasEspeciais(gerenciador);
                        break;
                    case 9:
                        ListarContasLimite(gerenciador);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcaoEscolhida != 0);
    }

    private static void ListarContasLimite(GerenciarContas gerenciador) {
        System.out.println(gerenciador.buscarClientesUsandoLimite());
    }

    private static void ListarContasEspeciais(GerenciarContas gerenciador) {
        System.out.println(gerenciador.buscarContasEspeciais());
    }

    private static void ListarContas(GerenciarContas gerenciador) {
        System.out.println(gerenciador.listaContas());
    }

    private static void TranferenciaConta(Scanner leia, GerenciarContas gerenciador) {
        System.out.println("Qual o número da conta de origem?");
        int numeroContaOrigem = leia.nextInt();
        System.out.println("Qual o número da conta de destino?");
        int numeroContaDestino = leia.nextInt();
        System.out.println("Qual o valor?");
        float valor = leia.nextFloat();
        gerenciador.transferirValor(numeroContaOrigem, numeroContaDestino, valor);
        System.out.println("Transferencia feita com sucesso.");
    }

    private static void DepositoConta(Scanner leia, GerenciarContas gerenciador) {
        System.out.println("Qual o número da conta?");
        int numeroConta = leia.nextInt();
        System.out.println("Qual o valor?");
        float valor = leia.nextFloat();
        gerenciador.depositar(numeroConta, valor);
        System.out.println("Deposito feito com sucesso.");
    }

    private static void SaqueConta(Scanner leia, GerenciarContas gerenciador) {
        System.out.println("Qual o número da conta?");
        int numeroConta = leia.nextInt();
        System.out.println("Qual o valor?");
        float valor = leia.nextFloat();
        gerenciador.sacar(numeroConta, valor);
        System.out.println("Saque feito com sucesso.");
    }

    private static void BuscarConta(Scanner leia, GerenciarContas gerenciador) {
        System.out.println("Qual o número da conta?");
        int numeroConta = leia.nextInt();
        Conta conta = gerenciador.buscarConta(numeroConta);
        System.out.println(conta.imprimir());
    }

    private static void RemoverConta(Scanner leia, GerenciarContas gerenciador) {
        System.out.println("Qual o número da conta?");
        int numeroConta = leia.nextInt();
        boolean sucesso = gerenciador.removerConta(numeroConta);
        if (sucesso) {
            System.out.println("Conta removida com sucesso.");
        } else {
            System.out.println("Conta " + numeroConta + " não foi encontrada!");
        }
    }

    private static void CriaConta(Scanner leia, GerenciarContas gerenciador) {
        System.out.print("Número da conta: ");
        int numeroConta = leia.nextInt();
        System.out.print("Nome do cliente: ");
        String nomeCliente = leia.next();
        System.out.print("CPF: ");
        String CPF = leia.next();

        System.out.println("Qual tipo de conta?");
        System.out.println("A - Conta Corrente");
        System.out.println("B - Conta Poupança");
        System.out.println("C - Conta Especial");

        String opcaoConta = leia.next();
        switch (opcaoConta.toUpperCase()) {
            case "A":
                ContaCorrente cc = new ContaCorrente(numeroConta, nomeCliente, CPF);
                gerenciador.adicionarConta(cc);
                System.out.println("Conta adicionada com sucesso.");
                break;
            case "B":
                ContaPoupanca cp = new ContaPoupanca(numeroConta, nomeCliente, CPF);
                gerenciador.adicionarConta(cp);
                System.out.println("Conta adicionada com sucesso.");
                break;
            case "C":
                System.out.print("Nome do gerente: ");
                String nomeGerente = leia.next();
                ContaEspecial ce = new ContaEspecial(numeroConta, nomeCliente, CPF, nomeGerente);
                gerenciador.adicionarConta(ce);
                System.out.println("Conta adicionada com sucesso.");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    private static void ImprimeOpcoes() {
        System.out.println("------------------------------------------");
        System.out.println("Escolha uma opção abaixo: ");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Remover conta");
        System.out.println("3 - Exibir conta");
        System.out.println("4 - Saque em conta");
        System.out.println("5 - Depósito em conta");
        System.out.println("6 - Transferência entre contas");
        System.out.println("7 - Listar todas contas");
        System.out.println("8 - Listar as contas especiais");
        System.out.println("9 - Listar as contas com limite");
        System.out.println("0 - Sair");
        System.out.println("");
        System.out.print("Opcao desejada: ");
    }

}
