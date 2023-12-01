package com.gabrielpeixoto.efarm.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Define o modelo de dados Contato
 * @author Gabriel Peixoto
 */

@Data
@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Column(nullable = false, length = 3)
    private Integer ddd;

    @Column(nullable = false, length = 10)
    private String telefone;

    @Column(length = 40)
    private String email;
}
