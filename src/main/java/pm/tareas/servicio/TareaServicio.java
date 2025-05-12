package pm.tareas.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pm.tareas.modelo.Tarea;
import pm.tareas.repositorio.TareaRepositorio;

import java.util.List;

@Service
public class TareaServicio implements ITareaServicio{

    @Autowired
    private TareaRepositorio tareaRepositorio;

    @Override
    public List<Tarea> listarTareas() {
        return this.tareaRepositorio.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Integer idTarea) {
        return this.tareaRepositorio.findById(idTarea).orElse(null);
    }

    @Override
    public void guardarTarea(Tarea tarea) {
        this.tareaRepositorio.save(tarea);
    }

    @Override
    public void eliminarTare(Tarea tarea) {
        this.tareaRepositorio.delete(tarea);
    }
}
