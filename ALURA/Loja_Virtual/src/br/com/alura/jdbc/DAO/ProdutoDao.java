package br.com.alura.jdbc.DAO;
import br.com.alura.jdbc.modelo.Categoria;
import br.com.alura.jdbc.modelo.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

    private Connection connection;

    public ProdutoDao(Connection connection) {
        this.connection = connection;

    }

    public void salvarProduto(Produto produto) throws SQLException {

        String sql = "INSERT INTO  tbPRODUTO (Id, NOME, PRECO_LISTA) VALUES(?, ?, ? )";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            preparedStatement.setString(1, produto.getId());
            preparedStatement.setString(2, produto.getNome());
            preparedStatement.setFloat(3, produto.getPreco_lista());
            preparedStatement.execute();

            try (ResultSet rst = preparedStatement.getGeneratedKeys()) {
                while (rst.next()) {
                    produto.setId(rst.getString(1));

                }
            }

        }
    }

    public List<Produto> listar() throws SQLException {
        List<Produto> produtos = new ArrayList<Produto>();

        String sql = "SELECT Id, NOME, PRECO_LISTA FROM tbPRODUTO";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.execute();

            try (ResultSet rst = preparedStatement.getResultSet()) {
                while (rst.next()) {
                    Produto produto =
                            new Produto(
                                    rst.getString(1),
                                    rst.getString(2),
                                    rst.getFloat(3));

                    produtos.add(produto);
                }
            }
        }
        return produtos;
    }

    public List<Produto> burcar(Categoria ct) throws SQLException {
        List<Produto> produtos = new ArrayList<Produto>();

        String sql = "SELECT Id, NOME, PRECO_LISTA FROM tbPRODUTO WHERE CATEGORIA_ID = ? ";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, ct.getId());
            preparedStatement.execute();

            try (ResultSet rst = preparedStatement.getResultSet()) {
                while (rst.next()) {
                    Produto produto =
                            new Produto(
                                    rst.getString(1),
                                    rst.getString(2),
                                    rst.getFloat(3));

                    produtos.add(produto);
                }
            }
        }
        return produtos;

}
}
