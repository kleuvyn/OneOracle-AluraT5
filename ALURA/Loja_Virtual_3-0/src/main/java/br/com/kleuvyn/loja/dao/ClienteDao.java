package br.com.kleuvyn.loja.dao;

import br.com.kleuvyn.loja.modelo.Cliente;
import javax.persistence.EntityManager;

public class ClienteDao {

            private EntityManager em;

            public ClienteDao(EntityManager em) {
                this.em = em;
            }

            public void cadastrar(Cliente cliente) {
                this.em.persist(cliente);
            }

            public Cliente buscarPorId(Long id) {
                return em.find(Cliente.class, id);
            }

        }
