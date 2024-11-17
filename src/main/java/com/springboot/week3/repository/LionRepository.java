package com.springboot.week3.repository;

import com.springboot.week3.entity.Lion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LionRepository extends JpaRepository<Lion, Long> {
    Optional<Lion> findBySnum(Long snum);
}
