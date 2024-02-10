package com.learnjava.BanKan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.ZonedDateTime;

public class Card {
    @Id
    @GeneratedValue
    @Column(name = "card_id", nullable = false, updatable = false)
    private Integer id;
    @Column(name = "card_name"  )
    private String name;
    @Column(name = "card_description")
    private String description;
    @Column(name = "card_priority_level")
    private String prioLevel;
    @Column(name = "card_visibility")
    private String cover;
    @Column(name = "card_due_date")
    private Boolean dueDate;
    @Column(name = "card_is_closed")
    private Boolean isArchived;
    @Column(name = "card_updated_timestamp")
    private ZonedDateTime updatedTimestamp;
}
