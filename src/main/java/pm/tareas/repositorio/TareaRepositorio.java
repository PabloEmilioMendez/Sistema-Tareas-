package pm.tareas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pm.tareas.modelo.Tarea;

public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {
}
