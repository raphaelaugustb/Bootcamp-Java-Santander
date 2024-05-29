public class AlunosClasse {
    public static void main(String[] args) {
        String[] alunos = { "Raphael","Bárbara","Messias","Joao","Augusto"};

        for (int x=0; x < alunos.length; x++){
            System.out.println("O Aluno na que está na posição: " + x + " é " + alunos[x]);

        }

        // A cada execucao da variavel alunos ele atualiza o valor da variavel aluno
        for( String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno+ ".");
        }

    }
}
