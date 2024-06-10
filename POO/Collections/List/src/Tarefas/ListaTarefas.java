package List.OperacoesBasicas.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<Tarefas>();
    }


    public void adicionarTarefa(String nome,String descricao){
        tarefasList.add(new Tarefas(nome,descricao));
    }
    public  void removerTarefa(String descricao){
        List<Tarefas> taferasRemover = new ArrayList<>();
        for (Tarefas t : tarefasList){
        if(t.getDescricao().equalsIgnoreCase(descricao)){
            taferasRemover.add(t);
        }
        }
        tarefasList.removeAll(taferasRemover);
    }
    public  int obterNumeroTarefas(){
            int numeroTarefas = tarefasList.size();
            return numeroTarefas;
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();
        tarefas.adicionarTarefa( "Dever", "acabar o curso");
        tarefas.adicionarTarefa( "lixo", "tirar as 5");
        tarefas.adicionarTarefa( "treinar", "treinar as quatro");
        tarefas.obterDescricoesTarefas();

        System.out.println("Numero Total de Tarefas: "  + tarefas.obterNumeroTarefas());

    }

}
