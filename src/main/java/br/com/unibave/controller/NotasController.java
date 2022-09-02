package br.com.unibave.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/notas")
public class NotasController {

    @PostMapping
    public String lancar()
    {
        return "Lançar";
    }
}
