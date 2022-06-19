package com.afterformater.afterformater.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "software")
@Entity
@Data
public class Software {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "url")
    private String url;

    @Column(name = "img")
    private String img;

    @Column(name = "version")
    private String version;

}
