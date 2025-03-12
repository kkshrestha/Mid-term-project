package com.texas.Miniproject.repository;

import com.texas.Miniproject.entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Classes, Long> {
}
