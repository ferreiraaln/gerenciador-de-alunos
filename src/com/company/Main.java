package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    List<Aluno> alunos = new ArrayList<Aluno>();
        Scanner ler = new Scanner(System.in);
        Boolean cond = Boolean.TRUE;

        do{
            System.out.println("Escolha a opção desejada!");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("9 - Sair");
            int opt = ler.nextInt();
            ler.nextLine();
            switch (opt){
                case 1:
                    System.out.println("Informe o nome do aluno");
                    String nome = ler.nextLine();
                    System.out.println("Informe a idade do aluno");
                    int idade = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Informe o cpf do aluno");
                    String cpf = ler.nextLine();
                    Aluno aluno = new Aluno(nome,
                            idade,
                            cpf);
                    alunos.add(aluno.addAluno(aluno));
                    break;
                case 2:
                    for(Aluno alunoFor: alunos){
                        if(alunoFor == null)
                            continue;
                        else
                            System.out.println(alunoFor.toString());
                    } break;
                case 9:
                    cond = Boolean.FALSE;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Número digitado inválido. Insira 1, 2 ou 9");
            }


        }while(cond);
    }
}
