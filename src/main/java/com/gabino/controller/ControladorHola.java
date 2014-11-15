
package com.gabino.controller;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.codehaus.jackson.map.ObjectMapper;

@Controller 
@RequestMapping("/")

public class ControladorHola {

    //primero hacemos un get 
 @RequestMapping(value = "/hola", method = RequestMethod.GET , headers = {"Accept=text/html"})
    public @ResponseBody String holaConGet(){
   return "Este es mi primer controller con get"; }
    
    //Crear el metodo GET para los usuarios que se devuelva a todos
    
    @RequestMapping(value="/usuario", method = RequestMethod.GET , headers = {"Accept = Application/json"}) 
    public @ResponseBody String obtenerTodos() throws IOException {
        
        //Vamos a usar la implementaci�n de json para java de Fasterxml a codehouse
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(GenerarUsuarios.obtenerUsuario());
    }


}

