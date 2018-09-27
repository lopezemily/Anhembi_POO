package appgerenciaalunos;

import java.util.ArrayList;

public class ListaAlunos {
    ArrayList<Aluno> alunos;
    
    public ListaAlunos(){
        alunos = new ArrayList<>();
    }
    
    public void adicionarAluno(Aluno novoAluno){
        alunos.add(novoAluno);
    }
    
    public boolean removerAluno(int ra){
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getRa()== ra){
                alunos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public String procurarAlunoPorRa(int ra){
        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);
            if(a.getRa() == ra){
                return a.getNome();
            }
        }
        return "Aluno não encontrado!";
    }
    
    public int procurarAlunoPorNome(String nome){
        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);
            if(a.getNome().equalsIgnoreCase(nome)){
                return a.getRa();
            }
        }
        return 0;
    }
    
    public String listarAlunos(){
        String saida = "";
        for (Aluno aluno : alunos){
            saida = aluno.getRa() + ": " + aluno.getNome() + ": " + aluno.getCurso() + "\n";
        }
        return saida;
    }
}
