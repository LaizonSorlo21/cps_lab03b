package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.*;

public class StudentRepository {
    private final Map<Long, StudentEntity> db = new HashMap<>();
    public StudentEntity save(StudentEntity s){ db.put(s.getId(), s); return s; }
    public Optional<StudentEntity> findById(Long id){ return Optional.ofNullable(db.get(id)); }
    public List<StudentEntity> findAll(){ return new ArrayList<>(db.values()); }
}
