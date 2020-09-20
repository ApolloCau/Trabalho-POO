import com.company.Aluno;

public class AlunoTeste {
    public static void main(String[] args, String nome, Object cpf, Object matricula, Object curso) {
        AlunoController controller = new AlunoController();

        Aluno aluno = controller.criarAluno(nome: "Carlos", cpf:"04987712105", matricula: "4587", curso:"001");
        System.out.println(aluno.getNome());

    }
}
