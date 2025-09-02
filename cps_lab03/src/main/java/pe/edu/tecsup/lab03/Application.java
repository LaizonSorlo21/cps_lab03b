package pe.edu.tecsup.lab03;

import pe.edu.tecsup.lab03.controllers.StudentController;
import pe.edu.tecsup.lab03.entities.StudentEntity;

public class Application {
    public static void main(String[] args) {
        StudentController ctrl = new StudentController();

        // Crear algunos estudiantes (ejemplo)
        ctrl.createStudent(1L, "Juan Perez", "juan.perez@example.com");
        ctrl.createStudent(2L, "María López", "maria.lopez@example.com");
        ctrl.createStudent(3L, "Ana Torres", "ana.torres@example.com");

        System.out.println("Lista inicial de estudiantes:");
        ctrl.listStudents().forEach(System.out::println);

        // Buscar por id
        System.out.println("\nBuscar id=2:");
        StudentEntity s2 = ctrl.getStudent(2L).orElse(null);
        System.out.println(s2);

        // Actualizar estudiante 1
        System.out.println("\nActualizar id=1:");
        boolean ok = ctrl.updateStudent(1L, "Juanito Pérez", "juanito@example.com");
        System.out.println("Update OK? " + ok);
        System.out.println("id=1 ahora -> " + ctrl.getStudent(1L).orElse(null));

        // Buscar por nombre parcial
        System.out.println("\nBuscar por nombre 'ana':");
        ctrl.findByName("ana").forEach(System.out::println);

        // Eliminar
        System.out.println("\nEliminar id=3:");
        boolean del = ctrl.deleteStudent(3L);
        System.out.println("Delete OK? " + del);

        System.out.println("\nLista final:");
        ctrl.listStudents().forEach(System.out::println);
    }
}
