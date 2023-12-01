package com.gabrielpeixoto.efarm.entity;

import java.util.Map;

/**
 * Define o modelo de dados Farmacia
 * @author Gabriel Peixoto
 */

public class Estoque {
    private String id;
    Map<Produto, Integer> produtos;
}
