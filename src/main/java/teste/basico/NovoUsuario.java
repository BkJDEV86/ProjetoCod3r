package teste.basico;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;

public class NovoUsuario {

	
	public static void main(String[] args) {
		
		// Cria o Entity Manager e passa as informações que vai precisar para abrir uma conexão com o banco de dados
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		// Responsável por gerenciar as tabelas criadas no Java e relacionar com o Banco de Dados
		// Cria toda a conexão e faz o trabalho de persistência!
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Djalma", "djalma@lanche.com.br");
		// É necessário setar o ID
		novoUsuario.setId(1L);
		//
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
	
}
