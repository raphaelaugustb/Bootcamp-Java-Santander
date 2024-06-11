package Tarefas;

public class Tarefa {
    private String descricao;
    private boolean tarefaStatus;
    public Tarefa(String descricao, boolean tarefaStatus) {
        this.descricao = descricao;
        this.tarefaStatus = tarefaStatus;
    }

    public void setTarefaStatus(boolean tarefaStatus) {
        this.tarefaStatus = tarefaStatus;
    }

    public boolean getTarefaStatus() {
        return tarefaStatus;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", tarefaStatus=" + tarefaStatus +
                '}';
    }
}
