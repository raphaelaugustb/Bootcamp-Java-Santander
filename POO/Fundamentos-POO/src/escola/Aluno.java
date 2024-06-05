package escola;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(Scanner newNome) {
        System.out.println("Digite o nome do aluno");
        nome = newNome.nextLine();
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(Scanner newIdade) {
        System.out.println("Digite a idade do Aluno");
        this.idade = newIdade.nextInt();
    }

}