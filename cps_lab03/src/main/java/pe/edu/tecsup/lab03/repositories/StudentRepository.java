package pe.edu.tecsup.lab03.repositories;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Repositorio en memoria (simulado) usando un Map.
 */
public class StudentRepository {
    private final Map<Long, StudentEntity> db = new HashMap<>();

    public StudentEntity save(StudentEntity s) {
        db.put(s.getId(), s);
        return s;
    }

    public Optional<StudentEntity> findById(Long id) {
        return Optional.ofNullable(db.get(id));
    }

    public List<StudentEntity> findAll() {
        return new ArrayList<>(db.values());
    }

    public List<StudentEntity> findByName(String name) {
        if (name == null || name.isBlank()) return Collections.emptyList();
        String q = name.toLowerCase();
        return db.values()
                .stream()
                .filter(s -> s.getName() != null && s.getName().toLowerCase().contains(q))
                .collect(Collectors.toList());
    }

    public boolean update(StudentEntity s) {
        if (s == null || s.getId() == null) return false;
        if (!db.containsKey(s.getId())) return false;
        db.put(s.getId(), s);
        return true;
    }

    public boolean delete(Long id) {
        return db.remove(id) != null;
    }
}
