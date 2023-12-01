package br.com.example.controller;

import java.util.List;
import br.com.example.repository.ArmazemRepository;
import br.com.example.model.ArmazemVO;
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
public class ArmazemController {
    
    @Autowired
    private ArmazemRepository repository;
     
    @GetMapping("/armazensDentroDeUmEstado(Sigla)/{nome}")
    public List<ArmazemVO> armazensDentroDeUmEstado(@PathVariable String nome){
        List<ArmazemVO> result = repository.listarArmazensDentroDeUmEstado(nome);
        return result;
    }
  
}