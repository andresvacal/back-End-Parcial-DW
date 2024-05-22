package Controller.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import model.Libro;
import repository.Librorepository;

@Service
public class libroService {
    private final Librorepository libroRepository;
    @Autowired
    public libroService(Librorepository libroRepository) {
        this.libroRepository = libroRepository;
    }
//Ver todos
    public List<Libro> getlibros() {
        return libroRepository.findAll();
    }
    //Guardar libro
public Libro savelibro(Libro libro) {
    try {
        libroRepository.save(libro);
    } catch (DataAccessException e) {
        throw new RuntimeException("Error accessing database", e);
    }
    return libro;
}

//Eliminar libro
public void eliminarlibro(Long id) {
    boolean exists = libroRepository.existsById(id);
    if (!exists) {
        throw new libroNotFoundException("El libro con id " + id + " no existe");
    }
    libroRepository.deleteById(id);
}
//Actualizar
public void actualizarlibro(Long id, Libro libro) {
    Libro libro1 = libroRepository.findById(id)
            .orElseThrow(() -> new IllegalStateException(
                    "El libro con id " + id + " no existe"
            ));
    if (libro.getNombre() != null) {
        libro1.setNombre(libro.getNombre());
    }
    if (libro.getAutor() != null) {
        libro1.setAutor(libro.getAutor());
    }
    if (libro.getFechaEscritura() != null) {
        libro1.setFechaEscritura(libro.getFechaEscritura());
    }
    if (libro.getEdicion() != 0) {
        libro1.setEdicion(libro.getEdicion());
    }
    if (libro.getPrecio() != 0) {
        libro1.setPrecio(libro.getPrecio());
    }
    if (libro.getTipoLubro() != null) {
        libro1.setTipoLubro(libro.getTipoLubro());
    }
    if (libro.getFamaEscritor() != null) {
        libro1.setFamaEscritor(libro.getFamaEscritor());
    }
    libroRepository.save(libro1);
}
    //Buscar por id
    public Libro buscarLibrobyid(Long id) {
        return libroRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "El libro con id " + id + " no existe"
                ));
    }

public class libroNotFoundException extends RuntimeException {
    public libroNotFoundException(String message) {
        super(message);
    }
}

}
