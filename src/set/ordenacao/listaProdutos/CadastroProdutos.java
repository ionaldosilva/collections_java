package set.ordenacao.listaProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class CadastroProdutos{
    
    private Set<Produto> cadastroProdutos;

    public CadastroProdutos() {
        this.cadastroProdutos = new HashSet<>();
    }

    public void adicionarProduto(String nome, int cod, double preco,int quant){
        cadastroProdutos.add(new Produto(nome, cod, preco, quant));
    }
    public Set<Produto> exibirProdutoNome(String nome){
        Set<Produto> exibePorNome = new HashSet<>();
        for(Produto p:cadastroProdutos){
            if(p.getNome().equalsIgnoreCase(nome)){
                exibePorNome.add(p);
            }
        }
        return exibePorNome;
    }
    public Set<Produto> exibirProdutos(){
        Set<Produto> exibirProdutosOrdAlf = new TreeSet<>(cadastroProdutos);
        return exibirProdutosOrdAlf;
    }

    
}
