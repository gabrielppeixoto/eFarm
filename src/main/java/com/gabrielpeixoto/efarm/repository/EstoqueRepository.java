/**
 * Interface de conexão com a tabela 'estoque'
 * @author Gabriel Peixoto
 */
package com.gabrielpeixoto.efarm.repository;

import com.gabrielpeixoto.efarm.entity.Estoque;
import com.gabrielpeixoto.efarm.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, String> {

}
