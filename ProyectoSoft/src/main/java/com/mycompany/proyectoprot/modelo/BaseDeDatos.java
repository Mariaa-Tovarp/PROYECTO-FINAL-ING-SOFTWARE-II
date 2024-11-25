package com.mycompany.proyectoprot.modelo;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private List<Animal> animales;

    public BaseDeDatos() {
        this.animales = new ArrayList<>();
    }

    // Método para agregar un animal
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    // Método para obtener la lista de animales
    public List<Animal> obtenerAnimales() {
        return animales;
    }

    // Método para eliminar un animal por su ID
    public boolean eliminarAnimal(int id) {
        // Busca y elimina el animal que tiene el ID correspondiente
        return animales.removeIf(animal -> animal.getId() == id);  // Devuelve true si se eliminó un animal
    }

    // Método para actualizar un animal
    public boolean actualizarAnimal(int id, Animal animalActualizado) {
        for (int i = 0; i < animales.size(); i++) {
            Animal animal = animales.get(i);
            if (animal.getId() == id) {
                // Actualiza el animal en la lista
                animales.set(i, animalActualizado);
                return true;
            }
        }
        return false;  // Retorna false si no encontró el animal con ese ID
    }
}
