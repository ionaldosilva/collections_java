package set.operacoes_basicas.convidados;

public class Convidado {
    
    private String nome;
    private int codigoconvite;
    
    public Convidado(String nome, int codigoconvite) {
        this.nome = nome;
        this.codigoconvite = codigoconvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoconvite() {
        return codigoconvite;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoconvite=" + codigoconvite + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoconvite;
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
        Convidado other = (Convidado) obj;
        if (codigoconvite != other.codigoconvite)
            return false;
        return true;
    }
    
}
