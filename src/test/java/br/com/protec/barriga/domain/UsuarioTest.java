package br.com.protec.barriga.domain;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Domínio : Usuário")
public class UsuarioTest {

	
	@Test
	@DisplayName("Deve criar um usuário válido")
	public void deveCriarUsuarioValido() {
		
		Usuario usuario = new Usuario(1L, "Usuario valido", "user@email.com", "123456");
		
		assertEquals(1L, usuario.getId());
		assertEquals("Usuario valido", usuario.getNome());
		assertEquals("user@email.com", usuario.getEmail());
		assertEquals("123456", usuario.getSenha());
		
	}
	
	
}