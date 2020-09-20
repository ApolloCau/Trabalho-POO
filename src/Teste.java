public class Teste extends Pessoa{
    public static void main(String[] args) {
        Pessoa gerente = new Gerente();
        Pessoa estagiario = new Estagiario();

        Gerente.setNome("Carlos");
        Gerente.setIdade("19");
        System.out.println("Nome do gerente" gerente.getNome());
        System.out.println("Idade do Gerente" gerente.getIdade());
        System.out.println("Salario do gerente" gerente.getSalarioFerias(120000));

        Estagiario.setNome("Cau");
        Estagiario.setIdade("16");
        System.out.println("Nome do Estagiario" estagiario.getNome());
        System.out.println("Idade do Gerente" estagiario.getIdade());
        System.out.println("Salario do Estagiario" estagiario.getSalarioFerias(800));
    }
}
