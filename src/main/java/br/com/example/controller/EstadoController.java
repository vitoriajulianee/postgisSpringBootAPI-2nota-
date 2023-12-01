package br.com.example.controller;

import java.util.List;
import br.com.example.repository.EstadoRepository;
import br.com.example.model.EstadoVO;
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
public class EstadoController {
    
    @Autowired
    private EstadoRepository repository;
     
    @GetMapping("/estadosVizinhos/{nome}")
    public List<EstadoVO> estadosVizinhos(@PathVariable String nome){
        List<EstadoVO> result = repository.listarEstadosVizinhos(nome);
        return result;
    }
    
     @GetMapping("/estadosDentroDeUmaRegiao/{regiao}")
    public List<EstadoVO> estadosDentroDeUmaRegiao(@PathVariable String regiao){
        List<EstadoVO> result = repository.listarEstadosDentroDeUmaRegiao(regiao);
        return result;
    }
   
    @GetMapping("/distanciaEntreEstados/{estadoA}/{estadoB}")
     public Double distanciaEntreEstados(@PathVariable String estadoA, @PathVariable String estadoB){
        double result = repository.distanciaEntreEstados(estadoA, estadoB);
        return result;
    }   
     
   
    
}