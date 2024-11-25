package com.mycompany.proyectoprot.vista;

import com.mycompany.proyectoprot.modelo.Animal;

import javax.swing.*;
import java.util.List;

public class VistaGanaderia {

    public int mostrarMenu() {
        String menu = """
                Gestión Ganadera - V.A.C.A.S.
                1. Registrar Animal
                2. Listar Animales
                3. Eliminar Animal
                4. Actualizar Datos Animal
                5. Salir
                """;
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    public Animal registrarAnimal() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal:"));
        String raza = JOptionPane.showInputDialog("Ingrese la raza del animal:");
        String estadoSalud = JOptionPane.showInputDialog("Ingrese el estado de salud del animal:");
        return new Animal(nombre, edad, raza, estadoSalud);
    }

    public void mostrarAnimales(List<Animal> animales) {
        if (animales.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay animales registrados.");
        } else {
            StringBuilder lista = new StringBuilder("Animales registrados:\n");
            for (Animal animal : animales) {
                lista.append(animal).append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Método corregido para solicitar el ID de un animal
    public int solicitarIdAnimal() {
        int id = -1;
        boolean valido = false;

        // Intentar obtener un ID válido
        while (!valido) {
            try {
                String input = JOptionPane.showInputDialog("Ingrese el ID del animal:");
                id = Integer.parseInt(input);
                valido = true;  // Si no hay error, se considera válido
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido (número entero).");
            }
        }
        return id;
    }

    // Método para actualizar los datos de un animal
    public Animal actualizarDatosAnimal() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del animal:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad del animal:"));
        String raza = JOptionPane.showInputDialog("Ingrese la nueva raza del animal:");
        String estadoSalud = JOptionPane.showInputDialog("Ingrese el nuevo estado de salud del animal:");
        return new Animal(nombre, edad, raza, estadoSalud);
    }
}
