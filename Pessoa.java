package aula07_exemplo;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereço endereco;

    public Pessoa() {
        endereco = new Endereço();
    }

    public Pessoa(String nome, int idade, String logradouro, int numero, String CEP) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = new Endereço(logradouro, numero, CEP);
    }

    public String getNome() {
        return nome;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public String exibir() {
        return nome + " " + idade + " " + endereco.exibir();
    }
}
