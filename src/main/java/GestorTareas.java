import java.util.ArrayList;
import java.util.List;

public class GestorTareas {

    private List<String> tareasPendientes = new ArrayList<>();
    private List<String> tareasCompletadas = new ArrayList<>();

    public void agregarTarea(String tarea) {
        tareasPendientes.add(tarea);
    }

    public void completarTarea(String tarea) {
        if (tareasPendientes.remove(tarea)) {
            tareasCompletadas.add(tarea);
        } else {
            throw new IllegalArgumentException("Tarea no encontrada");
        }
    }

    public void eliminarTarea(String tarea) {
        tareasPendientes.remove(tarea);
        tareasCompletadas.remove(tarea);
    }

    public List<String> getPendientes() {
        return tareasPendientes;
    }

    public List<String> getCompletadas() {
        return tareasCompletadas;
    }
}
