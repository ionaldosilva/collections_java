package lists.ordenacao.pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    
    List<Pessoa> pessoalist;

    public OrdenacaoPessoas(){
        this.pessoalist = new ArrayList<>();
    }
    public void adicinarPessoa(String nome, int idade, double altura){
        pessoalist.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoalist);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listPessoaAltura = new ArrayList<>(pessoalist);
        Collections.sort(listPessoaAltura, new ComparatorPorAltura());
        return listPessoaAltura;
    }
    

}
