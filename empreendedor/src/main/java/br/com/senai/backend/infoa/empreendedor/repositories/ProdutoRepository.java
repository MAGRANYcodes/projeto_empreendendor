package br.com.senai.backend.infoa.empreendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senai.backend.infoa.empreendedor.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
