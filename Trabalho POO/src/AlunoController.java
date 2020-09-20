

public class AlunoController implements iAluno{
    @Override
    public Aluno criarAluno() {
        return null;
    }

    @Override
    public Aluno criarAluno(String nome, String cpf, String matricula, String curso) {
        Aluno aluno = new Aluno();
        aluno.setNome(nome);

        return aluno;
    }

    @Override
    public Aluno recuperarAluno(String cpf) {
        return null;
    }

    @Override
    public void atualizarAluno(Aluno aluno) {

    }

    @Override
    public void deletarAluno(String cpf) {

    }
}
