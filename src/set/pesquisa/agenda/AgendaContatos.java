package set.pesquisa.agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atribute
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String telefone){
        contatoSet.add(new Contato(nome, telefone));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> pesquisaPorNome = new HashSet<>();
        for(Contato c:contatoSet){
            if(c.getNome().startsWith(nome)){
                pesquisaPorNome.add(c);
            }   
        }
        return pesquisaPorNome;
    }
    public Contato atualizarNumeroContato(String nome, String novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c:contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    
    
}
