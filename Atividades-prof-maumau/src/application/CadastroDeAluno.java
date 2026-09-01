package application;

import entities.Alunos;

public class CadastroDeAluno {
    public static void main(String[] args) {
        Alunos aluno = new Alunos("Matheus", 13543, 7.0, 5.0);
        System.out.println(aluno);
    }
}
