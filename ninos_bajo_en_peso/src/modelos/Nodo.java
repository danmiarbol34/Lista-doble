/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

public class Nodo {

    Representante representante;
    ArrayList<Nino> ninos = new ArrayList<>();
    Nodo ant, sig;

    public Nodo(Representante representante, Nodo ant, Nodo sig) {
        this.representante = representante;
        this.ant = ant;
        this.sig = sig;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public ArrayList<Nino> getNinos() {
        return ninos;
    }

    public void setNinos(ArrayList<Nino> ninos) {
        this.ninos = ninos;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
    
}
