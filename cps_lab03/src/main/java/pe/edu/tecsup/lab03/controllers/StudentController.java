package pe.edu.tecsup.lab03.controllers;

import pe.edu.tecsup.lab03.entities.StudentEntity;
import pe.edu.tecsup.lab03.services.StudentService;

public class StudentController {
    private final StudentService service = new StudentService();

    public StudentEntity create(Long id, String name){ return service.create(id, name); }
}
