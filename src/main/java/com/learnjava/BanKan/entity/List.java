package com.learnjava.BanKan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class List {
    @Id
    @GeneratedValue
    @Column(name = "list_id", nullable = false, updatable = false)
    private Integer id;
    @Column(name = "list_name"  )
    private String name;
    @Column(name = "list_is_archived")
    private Boolean isArchived;
}
