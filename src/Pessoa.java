public class Pessoa {

    private String Nome;
    private int Idade;


    public double getSalarioFerias(double salario) {
        return salario * 1.33;
    }

    public String getNome() {
        return Nome;
    }

    public static void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }
}
