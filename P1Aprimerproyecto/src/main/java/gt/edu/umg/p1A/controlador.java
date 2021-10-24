/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.p1A;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author usuario
 */
@Controller
@Slf4j
public class controlador {
    @GetMapping("/")
    public String Inicio(){
        
        log.info("Entrando al controlador inicio de MVC");
         var msg = "Mensaje";
        var persona = new Persona();
        persona.setNombre("Amaranta");
        persona.setApellido("Buendia");
        persona.setTelefono("1234");
        persona.setEmail("abuendia@gmail.com");
        
        var persona2 = new Persona();
        persona2.setNombre("Francisco");
        persona2.setApellido("Bailon");
        persona2.setTelefono("6789");
        persona2.setEmail("fbailon@gmail.com");
        
        var personas = Arrays.asList(persona,persona2);
        
        modelo.addAttribute("msg",msg);
        modelo.addAttribute("personas",personas);
        
        
        
        return "index";
    }
    
    
    
}
    

