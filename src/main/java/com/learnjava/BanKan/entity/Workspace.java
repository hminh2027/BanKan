package com.learnjava.BanKan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Workspace {
    @Id
    @GeneratedValue
    @Column(name = "workspace_id", nullable = false, updatable = false)
    private Integer id;
    @Column(name = "workspace_name"  )
    private String name;
    @Column(name = "workspace_description"  )
    private String description;
    @Column(name = "workspace_is_public")
    private Boolean isPublic;
}
