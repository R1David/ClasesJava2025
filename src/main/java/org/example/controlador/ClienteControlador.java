package org.example.controlador;


import org.example.entidades.Cliente;
import org.example.servicio.ClientesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/clientes")
public class ClienteControlador {
    @Autowired
    private ClientesServicio categoriaServicio;

    @GetMapping
    public List<Cliente> index() {

        return categoriaServicio.listarClientes();
    }
}



/*import java.util.List;



















@RestController
@RequestMapping("/api/categorias")
public class CategoriaControlador {

    @Autowired
    private CategoriaServicio categoriaServicio;

    @GetMapping
    public List<Categoria> index() {

        return categoriaServicio.listarCategorias();
    }
}
*/