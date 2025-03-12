package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Classes;

import java.util.List;
import java.util.Optional;

public interface ClassService {

    Classes saveClass(Classes classes);

    List<Classes> listAll();

    Optional<Classes> getClassById(Long id);

    Classes updateClass(Classes classes);

    void deleteClass(Long id);
}
