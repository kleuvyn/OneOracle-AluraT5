package br.com.kleuvyn.loja.testes;

import br.com.kleuvyn.loja.dao.ProdutoDao;
import br.com.kleuvyn.loja.modelo.Categoria;
import br.com.kleuvyn.loja.modelo.Produto;
import br.com.kleuvyn.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDeProduto {

    public static void main(String[] args) {
        cadastrarProduto();
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);

        Produto p = produtoDao.buscarPorId(1l);
        System.out.println(p.getPreco());

        List<Produto> todos = produtoDao.buscarPorNomeDaCategoria("CELULARES");
        todos.forEach(p2 -> System.out.println(p.getNome()));

        BigDecimal precoDoProduto = produtoDao.buscarPrecoDoProdutoComNome("Xiaomi Redmi");
        System.out.println("Preco do Produto: " +precoDoProduto);
    }

    private static void cadastrarProduto() {
        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares );

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);

        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);

        em.getTransaction().commit();
        em.close();
    }

}//        Categoria celulares = new Categoria ("Celulares");
//        EntityManager em = JPAUtil.getEntityManeger();
//
//        em.persist(celulares);
//        celulares.setNome("XPTP");
//
//        em.flush();
//        em.clear();
//
//        celulares = em.merge(celulares);
//        celulares.setNome("1234");
//
//        em.flush();
//        em.remove(celulares);
//        em.flush();



