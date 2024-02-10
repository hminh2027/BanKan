package com.learnjava.BanKan.repository;

import com.learnjava.BanKan.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Integer> {
}
