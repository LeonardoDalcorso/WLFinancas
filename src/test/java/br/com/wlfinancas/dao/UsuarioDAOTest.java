package br.com.wlfinancas.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.wlfinancas.domain.Usuario;

public class UsuarioDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Usuario usuario = new Usuario();
		usuario.setUsu_nome("Wesley");
		usuario.setUsu_delete(1);
		usuario.setUsu_cpf("764573647");
		usuario.setUsu_senha("wesley");
		usuario.setUsu_status(true);
		usuario.setUsu_login("wesley");
		usuario.setUsu_telefone("6567567676");
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
		
	}
	
	@Test
	@Ignore
	public void listar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> resultado = usuarioDAO.listar();
		
		System.out.println("Total de Registros encontrados: "+resultado.size());
		for(Usuario usuario : resultado) {
			System.out.println("Nomes: "+usuario.getUsu_nome());
			
		}
		
	}
	
	

}
