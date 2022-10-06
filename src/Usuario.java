public abstract class Usuario {
    protected String nome;
    protected String login;
    protected String senha;

    //Construtor
    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }


}
