package lista_telefonica;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	List<Contato> contatos = new ArrayList<>();

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		agenda.adicionarContato("Jeovan", "35752666", "123");
		agenda.imprimir();
		agenda.remover("Jeovan");
		agenda.imprimir();

	}

	public void adicionarContato(String nomeDoContato, String telefone, String email) {
		Contato contato = new Contato();
		contato.setTelefone(telefone);
		contato.setContato(nomeDoContato);
		contato.setEmail(email);
		contatos.add(contato);
	}

	
	public void alterar(String nomeDoContato, String telefone, String email) {
		Contato contato = contatos.get(contatos.indexOf(o));
		contato.setTelefone(telefone);
		contato.setContato(nomeDoContato);
		contato.setEmail(email);
	}

	
	public void imprimir() {
		contatos.stream().forEach(contato -> {
			System.err.println(contato.getContato());
		});
	}

	public void remover(String nomeContato) {
		Contato contatoRemover = new Contato();
		contatoRemover.setContato(nomeContato);
		if (contatos.contains(contatoRemover)) {
			contatos.remove(contatoRemover);

		}
	}

}
