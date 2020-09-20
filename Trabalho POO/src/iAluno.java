import com.company.Aluno;

import javax.print.DocFlavor;

public interface iAluno {

    Aluno criarAluno(String nome, String cpf, String matricula, String curso);
    Aluno recuperarAluno(String cpf);
    void atualizarAluno(Aluno aluno);
    void deletarAluno(String cpf);
}
