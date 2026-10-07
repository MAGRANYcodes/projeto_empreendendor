package br.com.senai.backend.infoa.empreendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.backend.infoa.empreendedor.models.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
