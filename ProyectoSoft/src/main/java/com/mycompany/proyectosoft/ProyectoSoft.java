package com.mycompany.proyectosoft;

import com.mycompany.proyectoprot.modelo.BaseDeDatos;
import com.mycompany.proyectoprot.vista.VistaGanaderia;
import com.mycompany.proyectoprot.controlador.ControladorGanado;

public class ProyectoSoft {
    public static void main(String[] args) {
        BaseDeDatos modelo = new BaseDeDatos();
        VistaGanaderia vista = new VistaGanaderia();
        ControladorGanado controlador = new ControladorGanado(modelo, vista);

        controlador.iniciar();
    }
}
