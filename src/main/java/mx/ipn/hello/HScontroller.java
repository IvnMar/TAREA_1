package mx.ipn.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HScontroller {
    @GetMapping("/hola") 
    public String dicirHola(){
        return "Hola spring";
    }  
}
