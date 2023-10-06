package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class estoqueProdutos {
    
    private Map<Long, Produto> estoqueProdutoMap;

    public estoqueProdutos() {
    
        this.estoqueProdutoMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quant){
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quant));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }
    public double retornarValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()){           
            for(Produto p:estoqueProdutoMap.values()){
                valorTotalEstoque += p.getValor() * p.getQuant();
            }
        }
        return valorTotalEstoque;
    }
    public Produto exibirProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p:estoqueProdutoMap.values()){
                if(p.getValor()>maiorPreco){
                    produtoMaisCaro=p;
                }
            }
        }
        return produtoMaisCaro;
    }
}
