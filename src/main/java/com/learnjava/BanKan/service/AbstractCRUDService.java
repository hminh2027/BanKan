package com.learnjava.BanKan.service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class AbstractCRUDService<Entity, Id, Repository extends JpaRepository<Entity, Id>> implements CRUDService<Entity, Id> {
    protected Repository repository;
    @Override
    public Entity create(Entity entity) {
        return repository.save(entity);
    }

    @Override
    public Entity getById(Id id) {
        try {
            Optional<Entity> entity = repository.findById(id);
            if(entity.isPresent()) {
                return entity.get();
            }
        } catch (Exception e) {
//            throw in here
        }
        return null;
    }

    @Override
    public List<Entity> getMany() {
        try {
            List<Entity> entities = repository.findAll();

            if(!entities.isEmpty()) {
                return entities.stream().toList();
            }
        } catch (Exception e) {
//
        }
        return null;
    }

    @Override
    public Entity updateOneById(Id id, Entity entity) {
        return null;
    }

    @Override
    public void deleteOneById(Id id) {

    }
}
