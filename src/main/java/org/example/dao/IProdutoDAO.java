package org.example.dao;

import org.example.domain.Produto;

import java.util.List;

public interface IProdutoDAO {
    public Integer cadastrar(Produto produto) throws Exception;
    public Produto consultar(Long id) throws Exception;
    public Integer excluir(Produto produtoBD) throws Exception;
    public Integer atualizar(Produto produto) throws Exception;
    public List<Produto> buscarTodos() throws Exception;
}
