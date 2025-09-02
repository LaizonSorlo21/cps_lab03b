package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

import java.util.List;
import java.util.Optional;

/**
 * Controller "simulado" que exponer operaciones sobre StudentService.
 * En un proyecto real con Spring esto sería un @RestController.
 */
public class StudentController {
    private final StudentService service = new StudentService();

    public StudentEntity createStudent(Long id, String name, String email) {
        return service.createStudent(id, name, email);
    }

    public Optional<StudentEntity> getStudent(Long id) {
        return service.getStudent(id);
    }

    public List<StudentEntity> listStudents() {
        return service.listStudents();
    }

    public List<StudentEntity> findByName(String name) {
        return service.findByName(name);
    }

    public boolean updateStudent(Long id, String newName, String newEmail) {
        return service.updateStudent(id, newName, newEmail);
    }

    public boolean deleteStudent(Long id) {
        return service.deleteStudent(id);
    }
}
