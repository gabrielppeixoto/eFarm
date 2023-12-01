package com.gabrielpeixoto.efarm.entity;

/**
 * Define o modelo de dados Farmacia
 * @author Gabriel Peixoto
 */

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Farmacia {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String farmacia;

    @Column(nullable = false, length = 50)
    private String razaoSocial;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco")
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contato")
    private Contato contato;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estoque")
    private Estoque estoque;
}
