//Criacao de pacotes
package edu.gleyson.primeirasemana;

import java.util.Scanner;

public class PrimeiraSemana {
    public static void main (String[] args){

        System.out.println("Digite o nome do aluno");
        Scanner getAlunoNome = new Scanner(System.in);


        System.out.println("Digite o valor da nota do aluno");
        Scanner getAlunoMedia = new Scanner(System.in);

        String nomeAluno = getAlunoNome.nextLine();
        int notaAluno = getAlunoMedia.nextInt();
            getAlunoNome.close();
            getAlunoMedia.close();

        System.out.println(mediaAluno(notaAluno, nomeAluno));
    }

    public static String mediaAluno (int notaAluno, String nomeAluno){
        String alunoStatus;

        if(notaAluno < 6){
            alunoStatus = nomeAluno + " foi Reprovado." ;
        } else if (notaAluno == 6) {
            alunoStatus = "Aluno " + nomeAluno + " está na média." ;
        } else{
            alunoStatus =  "Aluno " + nomeAluno +  "foi Aprovado.";
        }
     return alunoStatus;
    }




}
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
