package Servicios;

import dtos.LibroDto;

import java.sql.Connection;
import java.util.ArrayList;

public interface InterfazCrud {
    /**
     * Método que realiza Create, Read, Update, Delete
     * @return lista de libros
     */
    public ArrayList<LibroDto> crearLibros(Connection conexionGenerada);

    // Select
    public ArrayList<LibroDto> select(Connection conexionGenerada, boolean tipoSelect);
    public ArrayList<LibroDto> update(Connection conexionGenerada);
    public ArrayList<LibroDto> delete(Connection conexionGenerada);
}
