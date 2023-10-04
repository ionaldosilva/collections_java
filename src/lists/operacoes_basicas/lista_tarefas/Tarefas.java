package lists.operacoes_basicas.lista_tarefas;

public class Tarefas {

    private String descricao;

    public Tarefas(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
    @Override
    public String toString(){
        return descricao + '\'';
    }
    
}
