/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Perro;
import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author 1059237643
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona objpersona1 =new Persona("123456789", "Juan Perez");
        
        Perro objperro1 = new Perro("Manchas","Criollo");
        Perro objperro2 = new Perro("Negro","Pitbull");
        ArrayList<Perro>lsperros=new ArrayList<>();
        lsperros.add(objperro1);
        lsperros.add(objperro2);
        
        objpersona1.setLsperros(lsperros);
        System.out.println("El nombre de la persona es: "+"\t+"+objpersona1.getNombre());
        System.out.println("La identificacion de la persona es: "+"\t+"+objpersona1.getIdentificador());
        System.out.println("\n");
        
        for (int i = 0; i < objpersona1.getLsperros().size(); i++) {
            System.out.println("Perro"+(i+1)+"\n");
            System.out.println("El nombre del perro es: "+"\t"+objpersona1.getLsperros().get(i).getNombre());
            System.out.println("La raza del perro es: "+"\t"+objpersona1.getLsperros().get(i).getRaza());
            System.out.println("/n");
            
        }
    }
    
}
