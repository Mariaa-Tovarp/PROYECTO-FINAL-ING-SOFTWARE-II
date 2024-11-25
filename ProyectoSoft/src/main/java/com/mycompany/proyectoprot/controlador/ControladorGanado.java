package com.mycompany.proyectoprot.controlador;

import com.mycompany.proyectoprot.modelo.BaseDeDatos;
import com.mycompany.proyectoprot.modelo.Animal;
import com.mycompany.proyectoprot.vista.VistaGanaderia;

import java.util.List;

public class ControladorGanado {
    private BaseDeDatos modelo;
    private VistaGanaderia vista;

    public ControladorGanado(BaseDeDatos modelo, VistaGanaderia vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1 -> registrarAnimal();
                case 2 -> mostrarAnimales();
                case 3 -> eliminarAnimal();
                case 4 -> actualizarDatosAnimal();
                case 5 -> vista.mostrarMensaje("¡Hasta luego!");
                default -> vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private void registrarAnimal() {
        Animal animal = vista.registrarAnimal();
        modelo.agregarAnimal(animal);
        vista.mostrarMensaje("¡Animal registrado exitosamente!");
    }

    private void mostrarAnimales() {
        List<Animal> animales = modelo.obtenerAnimales();
        vista.mostrarAnimales(animales);
    }

    private void eliminarAnimal() {
        int id = vista.solicitarIdAnimal();  // Asegúrate de que solicitarIdAnimal() esté implementado en VistaGanaderia
        boolean eliminado = modelo.eliminarAnimal(id);  // Asegúrate de que eliminarAnimal(id) esté implementado en BaseDeDatos
        if (eliminado) {
            vista.mostrarMensaje("¡Animal eliminado exitosamente!");
        } else {
            vista.mostrarMensaje("Error: No se encontró un animal con ese ID.");
        }
    }

    private void actualizarDatosAnimal() {
        int id = vista.solicitarIdAnimal();  // Asegúrate de que solicitarIdAnimal() esté implementado en VistaGanaderia
        Animal animalActualizado = vista.actualizarDatosAnimal();  // Asegúrate de que actualizarDatosAnimal() esté implementado en VistaGanaderia
        boolean actualizado = modelo.actualizarAnimal(id, animalActualizado);  // Asegúrate de que actualizarAnimal(id, animalActualizado) esté implementado en BaseDeDatos
        if (actualizado) {
            vista.mostrarMensaje("¡Animal actualizado exitosamente!");
        } else {
            vista.mostrarMensaje("Error: No se encontró un animal con ese ID.");
        }
    }
}
