package br.org.serratec.pizzariadosferas.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto incremente
	private Long id;
	@Column(nullable = false, unique = true)// não pode ser nulo e nem duplicado
	 private String email;
	 private String nome;
	 
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 
}
