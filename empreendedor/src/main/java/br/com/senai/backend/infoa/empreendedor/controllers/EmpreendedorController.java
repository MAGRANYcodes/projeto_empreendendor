package br.com.senai.backend.infoa.empreendedor.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.backend.infoa.empreendedor.services.EmprendedorService;

@RestController 
@RequestMapping ("/empreendedor")
public class EmpreendedorController {

    @Autowired 
    private EmprendedorService empreendedorService;

    @GetMapping ("/contar")
    public Long contar() {
        return empreendedorService.contar();
    }

}
