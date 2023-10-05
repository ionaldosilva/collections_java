package set.pesquisa.agenda;

public class main {
    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("nome 01", "8399999999");
        agendaContatos.adicionarContato("nome 02", "8399999943");
        agendaContatos.adicionarContato("nome 03", "8399999945");
        agendaContatos.adicionarContato("nome 01 compl 01", "8399999956");
        agendaContatos.adicionarContato("nome 01 compl 02", "8399999359");
        agendaContatos.adicionarContato("nome 04", "8399999239");
        agendaContatos.adicionarContato("nome 01", "8399999945");

        agendaContatos.exibirContato();
        agendaContatos.atualizarNumeroContato("nome 02", "11999999932");
        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("nome 01"));
    }
}
