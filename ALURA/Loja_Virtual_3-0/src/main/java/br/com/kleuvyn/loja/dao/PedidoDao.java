package br.com.kleuvyn.loja.dao;

import br.com.kleuvyn.loja.modelo.Pedido;
import javax.persistence.EntityManager;

public class PedidoDao {

    private EntityManager em;

    public PedidoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Pedido pedido) {
        this.em.persist(pedido);
    }

//  PARA USAR SQL
//    public void listar(Pedido pedido) {
//        this.em.createNativeQuery("");
//    }

}