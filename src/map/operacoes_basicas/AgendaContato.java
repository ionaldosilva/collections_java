package map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

/**
 * AgendaContato
 */
public class AgendaContato {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer contato = null;
        if(!agendaContatoMap.isEmpty()){
            contato = agendaContatoMap.get(nome);
        }
        return contato;
    }

    
}