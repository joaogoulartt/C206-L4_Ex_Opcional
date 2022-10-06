import java.util.Objects;

public class Professor extends Usuario implements Funcionario {

    //Construtor
    public Professor(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    //Métodos
    public boolean autenticar(String senha) {
        return Objects.equals(this.senha, senha);
    }

    public void publicarNota(Aluno aluno) {
        System.out.println("Nota publicada do aluno " + aluno.nome);
    }
}
