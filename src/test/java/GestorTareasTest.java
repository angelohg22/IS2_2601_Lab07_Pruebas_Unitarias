import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GestorTareasTest {

    private GestorTareas gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorTareas();
        gestor.agregarTarea("Estudiar para el parcial");
        gestor.agregarTarea("Hacer laboratorio de IS2");
    }

    @Test
    void testPendientesIniciales() {
        List<String> pendientes = gestor.getPendientes();
        
        assertEquals(2, pendientes.size(), "Debería haber 2 tareas pendientes inicialmente.");
        assertTrue(pendientes.contains("Estudiar para el parcial"));
        assertTrue(pendientes.contains("Hacer laboratorio de IS2"));
    }

    @Test
    void testCompletarTarea() {
        gestor.completarTarea("Estudiar para el parcial");
        
        List<String> pendientes = gestor.getPendientes();
        List<String> completadas = gestor.getCompletadas();
        
        assertEquals(1, pendientes.size(), "Debería quedar 1 tarea pendiente");
        assertFalse(pendientes.contains("Estudiar para el parcial"), "La tarea ya no debe estar pendiente");
        
        assertEquals(1, completadas.size(), "Debería haber 1 tarea completada.");
        assertTrue(completadas.contains("Estudiar para el parcial"), "La tarea debe estar en la lista de completadas");
    }

    @Test
    void testEliminarTarea() {
        gestor.eliminarTarea("Hacer laboratorio de IS2");
        List<String> pendientes = gestor.getPendientes();
        
        assertEquals(1, pendientes.size(), "Debería quedar solo 1 tarea pendiente");
        assertFalse(pendientes.contains("Hacer laboratorio de IS2"), "La tarea debió ser eliminada");
        
        gestor.completarTarea("Estudiar para el parcial");
        gestor.eliminarTarea("Estudiar para el parcial");
        List<String> completadas = gestor.getCompletadas();
        
        assertTrue(completadas.isEmpty(), "La lista de completadas debería estar vacía tras eliminar la tarea");
    }

    @Test
    void testCompletarInexistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            gestor.completarTarea("Ir al gimnasio");
        }, "Debería lanzar IllegalArgumentException cuando la tarea no existe");
    }
}