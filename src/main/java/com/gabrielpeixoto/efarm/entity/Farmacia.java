package com.gabrielpeixoto.efarm.entity;

/**
 * Define o modelo de dados Farmacia
 * @author Gabriel Peixoto
 */

import lombok.Data;

@Data
public class Farmacia {
    private Long id;
    private String razaoSocial;
    private Endereco endereco;
    private Contato contato;
    private Estoque estoque;
}
