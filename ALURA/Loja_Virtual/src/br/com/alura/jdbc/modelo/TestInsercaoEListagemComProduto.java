package br.com.alura.jdbc.modelo;

import br.com.alura.jdbc.Conector;
import br.com.alura.jdbc.DAO.ProdutoDao;
import java.sql.*;
import java.util.List;

public class TestInsercaoEListagemComProduto {

    public TestInsercaoEListagemComProduto() {
    }

    public static  void main(String[] args) throws SQLException {

        Produto produto = new Produto("518563", "H2O 500Ml", 5.99f);

        try (Connection connection = new Conector().conexao()) {
            ProdutoDao produtoDao = new ProdutoDao(connection);
            produtoDao.salvarProduto(produto);
            List<Produto> listaDeProdduto = produtoDao.listar();
            listaDeProdduto.stream().forEach(lp -> System.out.println(lp));

        }
    }
}
