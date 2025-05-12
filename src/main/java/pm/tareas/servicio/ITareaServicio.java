package pm.tareas.servicio;

import pm.tareas.modelo.Tarea;

import java.util.List;

public interface ITareaServicio {

    public List<Tarea> listarTareas();

    public Tarea buscarTareaPorId(Integer idTarea);

    public  void guardarTarea(Tarea tarea);

    public void eliminarTare(Tarea tarea);


}
