package Alunos;
import java.util.*;
public class Aluno {
    private String nome;
  private long matricula;
  private int nota;
  public Aluno(String nome, long matricula, int nota){
      this.nome =nome;
      this.matricula = matricula;
      this.nota = nota;
  }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }
}

 class ComparatorNota implements Comparator<Aluno> {
     @Override
     public int compare(Aluno o1, Aluno o2) {
         return Integer.compare(o1.getNota(), o2.getNota());
     }
 }


 class ComparatorNome implements Comparator<Aluno>{
    @Override
     public int compare(Aluno o1, Aluno o2){
        return  o1.getNome().compareTo(o2.getNome());
    }
 }