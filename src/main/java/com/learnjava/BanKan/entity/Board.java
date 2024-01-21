package com.learnjava.BanKan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Board {
    @Id
    @GeneratedValue
    @Column(name = "board_id", nullable = false, updatable = false)
    private Integer id;
    @Column(name = "board_name")
    private String name;
    @Column(name = "board_description")
    private String description;
    @Column(name = "board_bg_color")
    private String bgColor;
    @Column(name = "board_visibility")
    private String url;
    @Column(name = "board_is_template")
    private Boolean isTemplate;
    @Column(name = "board_is_closed")
    private Boolean isClosed;
}
