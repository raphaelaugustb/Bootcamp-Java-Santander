package Alunos;
import java.rmi.server.ExportException;
import java.util.*;
public class GerenciadorAlunos  {
    Set<Aluno> gerenciadorAlunos;
    public GerenciadorAlunos() {
        gerenciadorAlunos = new HashSet<>();
    }
    public void adicionarAluno(String nome, long matricula, int nota){
        gerenciadorAlunos.add(new Aluno(nome,matricula,nota));
    }
    public void exibirAlunos(){
        for (Aluno a: gerenciadorAlunos){
            System.out.println(a);
        }
    }
    public void removerAlunoPorMatricula(long matricula){
      Aluno alunoRemovidoMatricula = null ;
      for (Aluno a: gerenciadorAlunos) {
          if (a.getMatricula() == matricula) {
                alunoRemovidoMatricula = a;
                break;
          }
      }
        System.out.println("Aluno removido");
      gerenciadorAlunos.remove(alunoRemovidoMatricula);
    }
    public void exibirAlunosPorNota(){
        Set<Aluno> alunosOrganizadosNota = new TreeSet<Aluno>(new ComparatorNota());
        alunosOrganizadosNota.addAll(gerenciadorAlunos);
        System.out.println(alunosOrganizadosNota);
    }
    public void exibirAlunosPorNome(){
        Set<Aluno> alunosOrganizadosNome = new TreeSet<Aluno>(new ComparatorNome());
        alunosOrganizadosNome.addAll(gerenciadorAlunos);
        System.out.println(alunosOrganizadosNome);
    }
    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        gerenciadorAlunos.exibirAlunos();

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        gerenciadorAlunos.exibirAlunos();

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }

}
