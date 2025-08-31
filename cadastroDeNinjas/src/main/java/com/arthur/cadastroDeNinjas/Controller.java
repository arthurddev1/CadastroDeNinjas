package com.arthur.cadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class Controller{

    @GetMapping("/boasvindas")

    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

}
