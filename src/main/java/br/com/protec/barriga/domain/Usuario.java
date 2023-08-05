package br.com.protec.barriga.domain;

import java.io.Serializable;

import br.com.protec.barriga.domain.exceptions.ValidationException;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario(Long id, String nome, String email, String senha) {
	
		if (nome == null) throw new ValidationException("Nome é obrigatório");
		if (email == null) throw new ValidationException("Email é obrigatório");
		if (senha == null) throw new ValidationException("Senha é obrigatória");
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	
	
	
}
