package org.example;

import org.example.dao.ProdutoDAO;
import org.example.dao.IProdutoDAO;
import org.example.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void cadastrarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setNome("Camisa");
        produto.setPreco(59.99);

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = dao.consultar(produto.getId());
        assertNotNull(produtoBD);
        assertNotNull(produtoBD.getId());
        assertEquals(produto.getId(), produtoBD.getId());
        assertEquals(produto.getNome(), produtoBD.getNome());

        Integer qtdDel = dao.excluir(produtoBD);
        assertNotNull(qtdDel);
    }
}
