package br.com.example.controller;

import java.util.List;
import br.com.example.repository.FronteiraRepository;
import br.com.example.model.FronteiraVO;
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
public class FronteiraController {
    
    @Autowired
    private FronteiraRepository repository;
     
    @GetMapping("/fronteirasMunicipais(Brasil)/{estado}")
    public List<FronteiraVO> fronteirasMunicipais(@PathVariable String estado){
        List<FronteiraVO> result = repository.listarFronteirasMunicipais(estado);
        return result;
    }
    
     @GetMapping("/fronteirasEstaduais(Brasil)/{regiao}")
    public List<FronteiraVO> fronteirasEstaduais(@PathVariable String regiao){
        List<FronteiraVO> result = repository.listarFronteirasEstaduais(regiao);
        return result;
    }
     
     
   
    
}