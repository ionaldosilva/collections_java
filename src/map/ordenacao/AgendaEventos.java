package map.ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> EventosMap;

    public AgendaEventos() {
        this.EventosMap = new HashMap<>();
    }
    
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        EventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirEventos(){
       Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(EventosMap);
       System.out.println(eventosTreeMap);
    }

    public Evento exibirEventoPorNome(String nome){
        Evento eventoPorNome = null;
        if(!EventosMap.isEmpty()){
            for(Evento e:EventosMap.values()){
                if(e.getNome().equalsIgnoreCase(nome)){
                    eventoPorNome = e;
                    break;
                }
            }
        }
        return eventoPorNome;
    }
    public void exibirProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>();
        for(Map.Entry<LocalDate, Evento> entry : EventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }
    
}
