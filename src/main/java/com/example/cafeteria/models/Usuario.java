package com.example.cafeteria.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "nome", length = 100, nullable = true)
	private String nome;
	
	@Column(name = "cpf", length = 15, nullable = true)
	private String cpf;
	
	@Column(name = "nascimento", nullable = true)
	private String nascimento;
	
	@Column(name = "telefone", length = 15, nullable = true)
	private String telefone;
	
	@Column(name = "email", length = 50, nullable = true)
	private String email;
	
	@Column(name = "senha", columnDefinition = "TEXT", nullable = true)
	private String senha;

	public Usuario() {
	}

	public Usuario(Integer id, String nome, String cpf, String nascimento, String telefone, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}

    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
