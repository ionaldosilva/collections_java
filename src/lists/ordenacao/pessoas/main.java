package lists.ordenacao.pessoas;

public class main {
 
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicinarPessoa("nome 01", 23, 1.56);
        ordenacaoPessoas.adicinarPessoa("nome 02", 18, 1.73);
        ordenacaoPessoas.adicinarPessoa("nome 03", 26, 1.58);
        ordenacaoPessoas.adicinarPessoa("nome 04", 22, 1.68);
        ordenacaoPessoas.adicinarPessoa("nome 05", 46, 1.75);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
