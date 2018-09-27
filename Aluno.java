package appgerenciaalunos;

public class Aluno {

    private int ra;
    private String nome, curso;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
        this.curso = "Não inscrito";

    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public String exibir(){
        return "Aluno: " + nome + " (" + ra + ") " + "Curso: " + curso;
    }
    
    
}
