package com.texas.Miniproject.services;

import com.texas.Miniproject.entity.Classes;
import com.texas.Miniproject.repository.ClassRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassServiceImpl implements ClassService{
    private final ClassRepository classRepository;

    public ClassServiceImpl(ClassRepository classRepository){
        this.classRepository = classRepository;
    }

    @Override
    public Classes saveClass(Classes classes) {
        return classRepository.save(classes);
    }

    @Override
    public List<Classes> listAll() {
        return classRepository.findAll();
    }

    @Override
    public Optional<Classes> getClassById(Long id) {
        return classRepository.findById(id);
    }

    @Override
    public Classes updateClass(Classes classes) {
        return classRepository.saveAndFlush(classes);
    }

    @Override
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
