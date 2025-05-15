package org.example;


import org.example.entidades.Categoria;

import org.example.entidades.Cliente;
import org.example.repositorio.CategoriaRepositorio;
import org.example.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {


    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    @Autowired
    private ClienteRepositorio clienteRepositorio;



    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //Categoria categoria = new Categoria("Computo", "Categoria Computo");
        //categoriaRepositorio.save(categoria);
        Cliente cliente = new Cliente("Alex David", "Espinoza Bazan", "12345678", "alex@correo.com", "999888777");
        clienteRepositorio.save(cliente);
    }
}