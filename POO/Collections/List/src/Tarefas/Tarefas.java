package List.OperacoesBasicas.Tarefas;

public class Tarefas {

    private String descricao;
    private String nome;
    public Tarefas(String nome ,String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getDescricao(){
      return descricao;
   }

    @Override
    public String toString() {
        return "\n "+ "{Tipo de Tarefa: " + nome +
                ", Descricao: " + descricao +  "}" + "\n"
                ;
    }
}
