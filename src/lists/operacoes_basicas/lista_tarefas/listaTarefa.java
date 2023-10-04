package lists.operacoes_basicas.lista_tarefas;

import java.util.ArrayList;
import java.util.List;


public class listaTarefa {
    
    private List<Tarefas> tarefalist;

    /**
     * 
     */
    public listaTarefa(){
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefas(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefas> tarefasRemover = new ArrayList<>();
        for(Tarefas t: tarefalist){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }            
        }
        tarefalist.removeAll(tarefasRemover);
    }
    public int obterNumeroDeTarefas(){
        return tarefalist.size();
    }
    public void obterDescricaoTarefas(){
        System.out.println(tarefalist);
    }
    public static void main(String[] args) {
        
        listaTarefa listaTarefa = new listaTarefa();

        System.out.println("O numero de elementos na lista é de: " + listaTarefa.obterNumeroDeTarefas());
        listaTarefa.adicionarTarefa("Tarefa 01");
        listaTarefa.adicionarTarefa("Tarefa 02");
        listaTarefa.adicionarTarefa("Tarefa 03");

        System.out.println("O numero de elementos na lista é de: " + listaTarefa.obterNumeroDeTarefas());
        listaTarefa.obterDescricaoTarefas();

        listaTarefa.removerTarefa("Tarefa 01");
        listaTarefa.obterDescricaoTarefas();
        listaTarefa.removerTarefa("Tarefa 03");
        listaTarefa.obterDescricaoTarefas();
        listaTarefa.adicionarTarefa("Tarefa 01");
        listaTarefa.obterDescricaoTarefas();
    }
}
