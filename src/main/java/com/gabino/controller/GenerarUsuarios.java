
package com.gabino.controller;

import java.util.ArrayList;


public class GenerarUsuarios {
    
    public static ArrayList<Usuario> obtenerUsuario(){
     ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
     
     //Primero creamos tres direcciones
     Direccion d1 = new Direccion("Onimex", 55030 , "El Potrero", "Estado de México");
     Direccion d2 = new Direccion("Francisco Villa", 55090 , "San Carlos", "Estado de México");
     Direccion d3 = new Direccion("Calle de la Muerte", 55030 , "San Geronimo", "Chihuahua");
    
     //Ahora asociamos las direcciones a sus usuarios
     Usuario u1 = new Usuario("Angelica", 20, 8000, d1);
     Usuario u2 = new Usuario("Erick", 22, 10000, d2);
     Usuario u3 = new Usuario("Paquita La Del Barrio", 65, 20000, d3);
     
     usuarios.add(u1);
     usuarios.add(u2);
     usuarios.add(u3);
     
     return usuarios;
    
    }
}
