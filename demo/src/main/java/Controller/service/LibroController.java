package Controller.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Libro;
@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/milibro")
public class LibroController {

    private libroService libroService;

    @Autowired
    //crear
    @PostMapping("/guardarlibro")
    public Libro AgregarLibro(@RequestBody Libro libro) {
        System.err.println("Libro a guardar" + libro);
        return libroService.savelibro(libro);
    }

    @GetMapping("/data")
    public List<Libro> getallLibros() {
        return libroService.getlibros();
    }

    //Borrar
    @DeleteMapping("/eliminarlibro")
    public void eliminarLibro(@RequestBody Long id) {
        libroService.eliminarlibro(id);
    }
    @PutMapping("/actualizarlibro")
    public void actualizarLibro(@RequestBody Long id, @RequestBody Libro libro) {
        libroService.actualizarlibro(id, libro);
    }
    @GetMapping("/buscarlibro/{id}")
    public Libro buscarLibro(@RequestBody Long id) {
        return libroService.buscarLibrobyid(id);
    }
}
