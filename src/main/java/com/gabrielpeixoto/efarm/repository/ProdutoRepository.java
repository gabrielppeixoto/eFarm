/**
 * Interface de conexão com a tabela 'produto'
 * @author Gabriel Peixoto
 */
package com.gabrielpeixoto.efarm.repository;

import com.gabrielpeixoto.efarm.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
