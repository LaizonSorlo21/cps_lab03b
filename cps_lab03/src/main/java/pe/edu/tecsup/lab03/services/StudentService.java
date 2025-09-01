package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;
import java.util.List;
import java.util.Optional;

public class StudentService {
    private final StudentRepository repo = new StudentRepository();

    public StudentEntity create(Long id, String name){ return repo.save(new StudentEntity(id, name)); }
    public Optional<StudentEntity> get(Long id){ return repo.findById(id); }
    public List<StudentEntity> list(){ return repo.findAll(); }
}
