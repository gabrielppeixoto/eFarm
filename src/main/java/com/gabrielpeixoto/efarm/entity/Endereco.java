package com.gabrielpeixoto.efarm.entity;

/**
 * Define o modelo de dados Endereco
 * @author Gabriel Peixoto
 */

import com.gabrielpeixoto.efarm.enums.TipoLogradouro;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String endereco;

    @Column(name = "tipo_logradouro")
    @Enumerated(value = EnumType.STRING)
    private TipoLogradouro tipoLogradouro;

    @Column(nullable = false, length = 100)
    private String logradouro;

    @Column(nullable = false)
    private Integer numero;

    @Column(length = 100)
    private String complemento;

    @Column(nullable = false, length = 9)
    private String cep;

    @Column(nullable = false, length = 20)
    private String bairro;

    @Column(nullable = false, length = 30)
    private String cidade;

    @Column(nullable = false, length = 2)
    private String estado;
}