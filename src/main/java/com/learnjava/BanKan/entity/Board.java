package com.learnjava.BanKan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Board {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "board_name", nullable = false, updatable = false)
    private String name;
    @Column(name = "board_desc")
    private String description;
    @Column(name = "board_url")
    private String url;
    @Column(name = "board_status")
    private Boolean closed;
}
