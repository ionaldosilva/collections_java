package lists.ordenacao.pessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

 
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }
    
    public Pessoa(String nome, int idade, double altura){
        this.altura=altura;
        this.nome=nome;
        this.idade=idade;
    }
    public double getAltura() {
        return altura;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }
}


