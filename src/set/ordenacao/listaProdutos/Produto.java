package set.ordenacao.listaProdutos;

public class Produto implements Comparable<Produto>{
    //atributes
    private String nome;
    private int cod;
    private double preco;
    private int quant;
    public Produto(String nome, int cod, double preco, int quant) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quant = quant;
    }
    public String getNome() {
        return nome;
    }
    public int getCod() {
        return cod;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuant() {
        return quant;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", cod=" + cod + ", preco=" + preco + ", quant=" + quant + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + cod;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (cod != other.cod)
            return false;
        return true;
    }
    @Override
    public int compareTo(Produto p) {
        // TODO Auto-generated method stub
        return nome.compareToIgnoreCase(p.getNome());
    }
    

    
}
