package br.com.senai.backend.infoa.empreendedor.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Info Produtos",
        version = "1.0",
        description = "API para gerenciamento de produtos em um sistema."
    )
)
public class Swagger {

}