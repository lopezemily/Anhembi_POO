package avaliacaocelular;

public class AvaliacaoCelular {

    public static void main(String[] args) {

        CelularPrePago c1 = new CelularPrePago();

        c1.fazerligacao("Cliente", 123456, 10);
        float ligacao1 = c1.getSaldo();
        System.out.println(ligacao1);
        c1.recarregar(20);
        c1.exibir();
        c1.setNomeCliente("João");
        c1.exibir();

        CelularPrePago c2 = new CelularPrePago();
        c2.fazerligacao("Cliente2", 987654, 0.5f);
        float ligacao2 = c2.getSaldo();
        System.out.println(ligacao2);
        c2.recarregar(5f);
        c2.fazerligacao("Cliente2", 789456, 20);
        c2.setTelefone(3256);
        c2.exibir();
    }

}
