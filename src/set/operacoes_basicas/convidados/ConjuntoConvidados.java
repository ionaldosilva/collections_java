package set.operacoes_basicas.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoconvite){
        convidadosSet.add(new Convidado(nome, codigoconvite));
    }

    public void removerConvidado(int codigoconvite){
        Convidado convidadoRemover = null;
        for(Convidado c : convidadosSet){
            if(c.getCodigoconvite()==codigoconvite){
                convidadoRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoRemover);
    }
    public int contarConvidados(){
        return convidadosSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    
}
