/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1059237643
 */
public class Persona {
    private String Identificador;
    private String Nombre;
    public ArrayList<Perro>lsperros;
    
    public Persona(){ 
    }

    public Persona(String Identificador, String Nombre) {
        this.Identificador = Identificador;
        this.Nombre = Nombre;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setLsperros(ArrayList<Perro> lsperros) {
        this.lsperros = lsperros;
    }

    public ArrayList<Perro> getLsperros() {
        return lsperros;
    }
    
}
