package com.company;

public class Aluno {

    private String nome;
    private Integer idade;
    private String cpf;

    public Aluno(){}

    public Aluno(String nome, Integer idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Aluno addAluno(Aluno newAluno){
        if(newAluno.getNome().equals("")){
            System.out.println("Nome não pode ser nulo");
            return null;
        }
        else if(newAluno.getIdade() < 10 || 18 <= newAluno.getIdade()){
            System.out.println("A idade tem de ser entre 11 e 18 anos. Idade colocada:" + newAluno.getIdade());
            return null;
        }
        else if(newAluno.getCpf() == null || newAluno.getCpf().length() <= 9){
            System.out.println("Document não pode ser nulo ou não pode ter menos de 10 caracteres. Documento inserido: " + newAluno.getCpf());
            return null;
        }
        else
            return newAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
