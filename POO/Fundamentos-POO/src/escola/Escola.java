package escola;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner getData = new Scanner(System.in);
        aluno.setNome(getData);
        aluno.setIdade(getData);

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " anos ");
    }
}