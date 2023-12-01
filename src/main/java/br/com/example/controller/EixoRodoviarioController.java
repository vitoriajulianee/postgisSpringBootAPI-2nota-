package br.com.example.controller;

import java.util.List;
import br.com.example.model.EixoRodoviarioVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.com.example.repository.EixoRodoviarioRepository;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Rádio Tabajara API", version = "1.0", description = "Dados de Tudo Quanto é Coisa!"))
public class EixoRodoviarioController {
    
    @Autowired
    private EixoRodoviarioRepository repository;
     
    @GetMapping("/eixoRodoviario(Pavimentada,Travessia,Duplicada)/{tipo}")
    public List<EixoRodoviarioVO> eixoRodoviario(@PathVariable String tipo){
        List<EixoRodoviarioVO> result = repository.listarEixoRodoviario(tipo);
        return result;
    }
  
}