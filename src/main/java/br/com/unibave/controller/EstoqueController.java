package br.com.unibave.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/estoque")
public class EstoqueController {

    @PostMapping
    public String estoque()
    {
        return "estoque";
    }
}
