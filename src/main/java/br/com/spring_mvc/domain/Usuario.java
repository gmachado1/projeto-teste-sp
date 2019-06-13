package br.com.spring_mvc.domain;

public class Usuario {
	private Long id;
	private String nome;
	private String sobreNome;

	public Usuario() {
		super();

	}

	public Usuario(Long id, String nome, String sobreNome) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobreNome;
	}

	public void setSobrenome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + "]";
	}

}
