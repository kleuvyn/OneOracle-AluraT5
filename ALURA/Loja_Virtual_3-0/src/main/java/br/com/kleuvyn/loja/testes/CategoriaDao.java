package br.com.kleuvyn.loja.testes;

import br.com.kleuvyn.loja.modelo.Categoria;

import javax.persistence.EntityManager;

public class CategoriaDao {

    private EntityManager em;

    public CategoriaDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria) {
        this.em.persist(categoria);
    }
//
//    public void atualizar(Categoria categoria) {
//        categoria = em.merge(categoria);
//        this.em.merge(categoria);
//    }
//
//        public void remover (Categoria categoria){
//            categoria = em.merge(categoria);
//            this.em.remove(categoria);
//
//    }
}
