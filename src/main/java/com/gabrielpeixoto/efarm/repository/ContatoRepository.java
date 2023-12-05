package com.gabrielpeixoto.efarm.repository;

/**
 * Interface de conexão com a tabela 'contato'
 * @author Gabriel Peixoto
 */

import com.gabrielpeixoto.efarm.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, String> {
}
