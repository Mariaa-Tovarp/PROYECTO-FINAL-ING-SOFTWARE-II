package com.mycompany.proyectoprot.modelo;

public class Animal {
    private static int contadorId = 0;  // Contador estático para generar IDs únicos
    private int id;
    private String nombre;
    private int edad;
    private String raza;
    private String estadoSalud;

    // Constructor
    public Animal(String nombre, int edad, String raza, String estadoSalud) {
        this.id = ++contadorId;  // Genera un ID único
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.estadoSalud = estadoSalud;
    }

    // Método getter para obtener el ID del animal
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Raza: " + raza + ", Estado de Salud: " + estadoSalud;
    }
}
