package br.org.serratec.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
    
    @GetMapping(value="/")
    public String GetMetHodName() {
        return "Ola Mundo VsCode";
    }

    @GetMapping(value="/resposta")
    public String resposta() {
        return "Oque está fazendo aqui meu caro amigo";
    }

    @GetMapping(value="/converter")
    public String converter(@RequestParam String name) {
        return name.toUpperCase();
    }
    // 
     /**
     * @param numero1
     * @param numero2
     * @return
     */
    @GetMapping("/soma");
     public Integer soma (@RequestParam Integer numero1, @RequestParam Integer numero2){
            return numero1 + numero2;
     }

}
