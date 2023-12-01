package com.gabrielpeixoto.efarm.entity;

import com.gabrielpeixoto.efarm.enums.TipoSituacaoMedicamento;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Define o modelo de dados Produto
 * @author Gabriel Peixoto
 */

@Data
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String produto;

    @Column(length = 30)
    private String nomeComercial;

    @Column(nullable = false, length = 50)
    private String principioAtivo;

    @Column(nullable = false)
    private Long registro;

    @Column(nullable = false)
    private String numeroProcesso;

    @Column(nullable = false)
    private String empresaDetentoraRegistro;

    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private TipoSituacaoMedicamento situacao;

    @Column(nullable = false)
    private Date vencimento;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "produtos_estoque",
            joinColumns = @JoinColumn(name = "produto"),
            inverseJoinColumns = @JoinColumn(name = "estoque")
    )
    private List<Estoque> estoque;
}
