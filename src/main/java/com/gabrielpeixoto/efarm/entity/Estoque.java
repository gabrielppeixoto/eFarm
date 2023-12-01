package com.gabrielpeixoto.efarm.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Define o modelo de dados Farmacia
 * @author Gabriel Peixoto
 */

@Data
@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String estoque;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "produtos_estoque",
            joinColumns = @JoinColumn(name = "estoque"),
            inverseJoinColumns = @JoinColumn(name = "produto")
    )
    List<Produto> produtos;
}
