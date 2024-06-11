package Tarefas;
import java.util.*;
public class ListaTarefa {
    private Set<Tarefa> listaTarefas;
    private final String tarefaNaoEncontrada = "Tarefa nao encontrada";
    public ListaTarefa(){
        listaTarefas = new HashSet<>();
    }
    public void adicionarTarefa(String descricao, boolean tarefaStatus){
        listaTarefas.add(new Tarefa(descricao,tarefaStatus ));
    }
    public void removerTarefa(String descricao){
        String tarefaRemover = " ";
        for (Tarefa t: listaTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover = t.getDescricao();
                System.out.println("Tarefa removida");
                break;
            }else {
                System.out.println(tarefaNaoEncontrada);
            }
            listaTarefas.remove(tarefaRemover);
        }
    }
    public boolean testListaVazia() {
        if (listaTarefas.isEmpty()){
            System.out.println("Lista está vazia");
            return true;
        } else {
            return false;
        }
    }
    public void exibirTarefas(){
        if (!testListaVazia()){
            for (Tarefa t: listaTarefas){
                System.out.println(t);
            }
        }

    }
    public  void contarTarefas(){
        int contarTarefas = listaTarefas.size();
        System.out.println(contarTarefas);
    }
    public Set<Tarefa> tarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>(listaTarefas);
        for (Tarefa t : listaTarefas){
            if (!t.getTarefaStatus()){
                tarefasConcluidas.remove(t);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> tarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>(listaTarefas);
        for (Tarefa t : listaTarefas){
            if (t.getTarefaStatus()){
                tarefasPendentes.remove(t);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t: listaTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaStatus(true);
                break;
            }
        }
        System.out.println("Tarefa marcada como concluida com sucesso");
    }
    public void marcarTarefaPendente(String descricao){
        for (Tarefa t: listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setTarefaStatus(false);
                break;
            }
        }
        System.out.println("Tarefa marcada como pendente com sucesso");
    }
    public void limparListaTarefas(){
        listaTarefas.removeAll(listaTarefas);
        System.out.println("Lista limpada com sucesso");
    }

    public static void main(String[] args) {


        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("task1", true);
        listaTarefa.adicionarTarefa("task2", true);
        listaTarefa.adicionarTarefa("task3", true);
        listaTarefa.adicionarTarefa("task4", false);
        listaTarefa.adicionarTarefa("task5", false);
        listaTarefa.adicionarTarefa("task6", false);
        listaTarefa.adicionarTarefa("task7", false);

        listaTarefa.contarTarefas();
        listaTarefa.exibirTarefas();
        listaTarefa.limparListaTarefas();
        listaTarefa.exibirTarefas();

    }



}
