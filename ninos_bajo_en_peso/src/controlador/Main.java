/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.*;

/**
 *
 * @author omar5
 */
public class Main {

    public static void main(String[] args) {
        Registro registro = new Registro();
        AgregarIncio agregarIncio = new AgregarIncio();

        abrirVistaPrincipal(registro, agregarIncio);
    }

    static void abrirVistaPrincipal(Registro registro, AgregarIncio agregarIncio) {
        registro.setLocationRelativeTo(null);
        registro.setVisible(true);

        mostrarVistarAddInicio(registro, agregarIncio);
    }

    static void mostrarVistarAddInicio(Registro registro, AgregarIncio agregarIncio) {
        registro.getEscritorio().add(agregarIncio);
        agregarIncio.setVisible(true);
    }

}
