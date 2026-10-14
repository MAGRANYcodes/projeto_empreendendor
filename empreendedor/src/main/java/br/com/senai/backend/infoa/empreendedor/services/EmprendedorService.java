package br.com.senai.backend.infoa.empreendedor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.backend.infoa.empreendedor.repositories.EmpreendedorRepository;

@Service 
public class EmprendedorService {

    @Autowired 
    private EmpreendedorRepository empreendedorRepository;
    
    public Long contar() {
        return empreendedorRepository.count();
    }
}
