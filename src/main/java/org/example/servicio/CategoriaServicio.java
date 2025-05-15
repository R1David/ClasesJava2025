package org.example.servicio;

import org.example.entidades.Categoria;
import org.example.repositorio.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicio {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public List<Categoria> listarCategorias() {

        return categoriaRepositorio.findAll();
    }

    public Categoria agregarCategoria(Categoria categoria) {

        return categoriaRepositorio.save(categoria);
    }

    public Categoria editarCategoria(Integer id) {

        return categoriaRepositorio.findById(id).get();
    }

    public Categoria actualizarCategoria(Categoria categoria) {

        return categoriaRepositorio.save(categoria);
    }

    public void eliminarCategoria(Integer id) {

        categoriaRepositorio.deleteById(id);
    }
}
