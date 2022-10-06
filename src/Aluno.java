public class Aluno extends Usuario{
    private int matricula;
    private String curso;

    public Aluno(String nome, String login, String senha, int matricula, String curso) {
        super(nome, login, senha);
        this.matricula = matricula;
        this.curso = curso;
    }
}
