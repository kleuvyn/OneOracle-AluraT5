package br.com.kleuvyn.loja.testes;

import br.com.kleuvyn.loja.dao.ClienteDao;
import br.com.kleuvyn.loja.dao.PedidoDao;
import br.com.kleuvyn.loja.dao.ProdutoDao;
import br.com.kleuvyn.loja.modelo.*;
import br.com.kleuvyn.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDePedido {
    public void main(String[] args) {
        popularBancoDeDados();
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        ClienteDao clienteDao = new ClienteDao(em);

        Produto produto = produtoDao.buscarPorId(1l);
        Cliente cliente = clienteDao.buscarPorId(1l);
        em.getTransaction().begin();

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(new ItemPedido(10, pedido, produto));

        PedidoDao pedidoDao = new PedidoDao(em);
        pedidoDao.cadastrar(pedido);
        em.getTransaction().commit();

        }

        private static void popularBancoDeDados() {
            Categoria celulares = new Categoria("CELULARES");
            Produto celular = new Produto("Samsung Galaxy A71;", "Muito legal", new BigDecimal("999.98"), celulares );
            Cliente cliente = new Cliente("Beatryz", "12345678900");

            EntityManager em = JPAUtil.getEntityManager();
            ProdutoDao produtoDao = new ProdutoDao(em);
            CategoriaDao categoriaDao = new CategoriaDao(em);
            ClienteDao clienteDao = new ClienteDao(em);
            em.getTransaction().begin();

            categoriaDao.cadastrar(celulares);
            produtoDao.cadastrar(celular);
            clienteDao.cadastrar(cliente);
            em.getTransaction().commit();
            em.close();
        }

    }
