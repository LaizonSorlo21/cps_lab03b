package pe.edu.tecsup.lab03.services;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

/**
 * Lógica de negocio mínima que usa StudentRepository.
 */
public class StudentService {
    private final StudentRepository repo = new StudentRepository();

    public StudentEntity createStudent(Long id, String name, String email) {
        StudentEntity s = new StudentEntity(id, name, email);
        return repo.save(s);
    }

    public Optional<StudentEntity> getStudent(Long id) {
        return repo.findById(id);
    }

    public List<StudentEntity> listStudents() {
        return repo.findAll();
    }

    public List<StudentEntity> findByName(String name) {
        return repo.findByName(name);
    }

    public boolean updateStudent(Long id, String newName, String newEmail) {
        Optional<StudentEntity> opt = repo.findById(id);
        if (opt.isPresent()) {
            StudentEntity s = opt.get();
            s.setName(newName != null ? newName : s.getName());
            s.setEmail(newEmail != null ? newEmail : s.getEmail());
            return repo.update(s);
        }
        return false;
    }

    public boolean deleteStudent(Long id) {
        return repo.delete(id);
    }
}
