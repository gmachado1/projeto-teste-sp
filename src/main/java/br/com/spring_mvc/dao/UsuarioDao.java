package br.com.spring_mvc.dao;

import java.util.List;

import br.com.spring_mvc.domain.Usuario;

public interface UsuarioDao {

	public void salvar(Usuario u);

	public void editar(Usuario u);

	public void excluir(Long id);

	public Usuario getById(Long id);

	public List<Usuario> getTodos();
}
