package org.example.repositorio;


import org.example.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente,Integer>{
}


//public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer> {

//}