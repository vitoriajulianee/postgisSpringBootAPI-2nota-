package br.com.example.controller;

import java.util.List;
import br.com.example.repository.PortoRepository;
import br.com.example.model.PortoVO;
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
public class PortoController {
    
    @Autowired
    private PortoRepository repository;
     
    @GetMapping("/portosMunicipais/{estado}")
    public List<PortoVO> portosMunicipais(@PathVariable String estado){
        List<PortoVO> result = repository.listarPortosMunicipais(estado);
        return result;
    }
    
     @GetMapping("/portosEstaduais/{regiao}")
    public List<PortoVO> portosEstaduais(@PathVariable String regiao){
        List<PortoVO> result = repository.listarPortosEstaduais(regiao);
        return result;
    }
     
     
   
    
}