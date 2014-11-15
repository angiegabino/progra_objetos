
package com.gabino.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;


@Controller 
@RequestMapping("/")

public class ControladorHola {

    //primero hacemos un get 
 //   @RequestMapping(value"/hola", method = RequestMethod.GET.headers = {"Accept=text/html"})
   // public @ResponseBody String holaConGet(){
   // return "Este es mi primer controller con get"; }
}

