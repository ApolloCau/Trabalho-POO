package com.company;

import java.util.Random;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;
    private String matricula;


    public Aluno(String matricula){
        this.matricula = matricula;
        Random random = new Random();
        Integer aleatorio = random.nextInt();
        setMatricula(aleatorio.toString());
    }

    private void setMatricula(String toString) {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }
}
