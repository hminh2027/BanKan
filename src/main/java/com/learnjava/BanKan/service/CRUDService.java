package com.learnjava.BanKan.service;

import java.util.List;

public interface CRUDService<Entity, Id> {
    Entity create(Entity entity);
    Entity getById (Id id);
    List<Entity> getMany();
    Entity updateOneById (Id id, Entity entity);
    void deleteOneById (Id id);
}
