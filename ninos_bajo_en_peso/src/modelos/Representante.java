package modelos;

import javax.swing.JOptionPane;

public class Representante {


    private String Identificacion, Nombre;
    private int numN;

    public Representante(String Identificacion, String Nombre, int numN) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.numN = numN;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumN() {
        return numN;
    }

    public void setNumN(int numN) {
        this.numN = numN;
    }

    public void aumentarNumN() {
        // numN =2
        if (numN < 2) {
            numN = numN++;
        } else {
            JOptionPane.showMessageDialog(null, "Un representante solo puede tener hasta 2 niños");
        }
    }

    public String infoRepresentante() {
        String info = "";

        info = "Datos del representante:\n"
                + "Identificacion: " + getIdentificacion()
                + "\nNobre: " + getNombre()
                + "\nNumero de niños: " + getNumN();
        return info;
    }

}
