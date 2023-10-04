package lists.pesquisas.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;
    
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    listAutor.add(l);
                }
            }
        }
        return listAutor;
    }
    public List<Livro> pesquisarPorAnoPublicacao(int anoInicial, int anoFinal){
        List<Livro> listaPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAno()>=anoFinal && l.getAno()<=anoFinal){
                    listaPorAno.add(l);
                }
            }
        }
        return listaPorAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livro = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livro = l;
                    break;
                }
            }          
        }
        return livro;
    }

    public static void main(String[] args) {
        
    }
}
