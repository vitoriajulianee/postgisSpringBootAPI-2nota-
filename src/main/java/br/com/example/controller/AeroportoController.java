package br.com.example.controller;

import java.util.List;
import br.com.example.repository.AeroportoRepository;
import br.com.example.model.AeroportoVO;
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
public class AeroportoController {
    
    @Autowired
    private AeroportoRepository repository;
     
    @GetMapping("/aeroportosDentroDeUmEstado/{nome}")
    public List<AeroportoVO> aeroportosDentroDeUmEstado(@PathVariable String nome){
        List<AeroportoVO> result = repository.listarAeroportosDentroDeUmEstado(nome);
        return result;
    }
    
     @GetMapping("/aeroportosDentroDeUmaRegiao/{regiao}")
    public List<AeroportoVO> aeroportosDentroDeUmaRegiao(@PathVariable String regiao){
        List<AeroportoVO> result = repository.listarAeroportosDentroDeUmaRegiao(regiao);
        return result;
    }
     
     
   
    
}