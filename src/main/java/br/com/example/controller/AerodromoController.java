package br.com.example.controller;

import java.util.List;
import br.com.example.repository.AerodromoRepository;
import br.com.example.model.AerodromoVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Rádio Tabajara API", version = "1.0", description = "Dados de Tudo Quanto é Coisa!"))
public class AerodromoController {
    
    @Autowired
    private AerodromoRepository repository;
     
    @GetMapping("/aerodromosDentroDeUmEstado(Sigla)/{estado}")
    public List<AerodromoVO> aerodromosDentroDeUmEstado(@PathVariable String estado){
        List<AerodromoVO> result = repository.listarAerodromosDentroDeUmEstado(estado);
        return result;
    }
    
     
     
   
    
}