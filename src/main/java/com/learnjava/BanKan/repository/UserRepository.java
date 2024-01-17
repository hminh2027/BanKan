package com.learnjava.bankan.repository;

import com.learnjava.bankan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
