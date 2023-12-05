/**
 * Interface de conexão com a tabela 'endereco'
 * @author Gabriel Peixoto
 */
package com.gabrielpeixoto.efarm.repository;

import com.gabrielpeixoto.efarm.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
