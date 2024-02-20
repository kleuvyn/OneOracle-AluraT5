package br.com.alura.jdbc.DAO;

import br.com.alura.jdbc.modelo.Categoria;
import br.com.alura.jdbc.modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDao {

    private final Connection connection;

    public CategoriaDao(Connection connection) {
        this.connection = connection;

    }

    public List<Categoria> listar() throws SQLException {
        List<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT Id, Nome FROM tbCATEGORIA";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.execute();

            try(ResultSet rst = preparedStatement.getResultSet()){
                while (rst.next()){
                    Categoria categoria = new Categoria(rst.getInt(1), rst.getString(2));

                    categorias.add(categoria);
                }

            }


        }
        return categorias;
        }

    public List<Categoria> listarComProdutos() throws SQLException {
        Categoria ultima = null;
        List<Categoria> categorias = new ArrayList<>();

        String sql = "SELECT C.Id, C.Nome, P.ID, P.NOME, P.PRECO_LISTA FROM tbCATEGORIA C INNER JOIN  tbPRODUTO P ON C .ID = P.CATEGORIA_ID ";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.execute();

            try(ResultSet rst = preparedStatement.getResultSet()){
                while (rst.next()){
                    if(ultima == null || !ultima.getNome().equals(rst.getString(2))) {
                        Categoria categoria =
                                new Categoria(rst.getInt(1), rst.getString(2));
                        ultima = categoria;
                        categorias.add(categoria);
                    }
                    Produto produto = new Produto (rst.getString(3), rst.getString(4), rst.getFloat(5));
                    ultima .adicionar(produto);
                }

            }


        }
        return categorias;
    }
}
