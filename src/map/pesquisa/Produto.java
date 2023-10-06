package map.pesquisa;

public class Produto {
    //Atributes
    private String nome;
    private double valor;
    private int quant;
    public Produto(String nome, double valor, int quant) {
        this.nome = nome;
        this.valor = valor;
        this.quant = quant;
    }
    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }
    public int getQuant() {
        return quant;
    }
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", valor=" + valor + ", quant=" + quant + "]";
    }

    
}
