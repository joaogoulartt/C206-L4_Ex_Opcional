import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criando Aluno e Professor
        Aluno aluno = new Aluno("João", "joao", "123", 123, "ADS");
        Professor professor = new Professor("Maria", "maria", "123");

        //Entrando com a senha do professor
        System.out.println("Digite a senha do professor: ");
        String senha = scanner.nextLine();

        //Autenticacao do professor com loop
        while (!professor.autenticar(senha)) {
            System.out.println("Senha incorreta, digite novamente: ");
            senha = scanner.nextLine();
        }
        System.out.println("Professor autenticado");

        //Publicando nota do aluno
        professor.publicarNota(aluno);
    }
}