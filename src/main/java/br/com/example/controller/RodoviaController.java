package br.com.example.controller;

import br.com.example.model.Rodovia;
import java.util.List;
import br.com.example.model.RodoviaVO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.com.example.repository.RodoviaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins = "*")
@OpenAPIDefinition(info = @Info(title = "Rádio Tabajara API", version = "1.0", description = "Dados de Tudo Quanto é Coisa!"))
public class RodoviaController {
    
    @Autowired
    private RodoviaRepository repository;
     
    //@GetMapping("/rodovias(Pavimentada,Leito Natural,Planejada)/{tipo}")
    //public List<RodoviaVO> rodovias(@PathVariable String tipo){
    //    List<RodoviaVO> result = repository.listarRodovias(tipo);
    //    return result;
    //}
    @GetMapping("/rodovias(Pavimentada,Leito Natural,Planejada)/{tipo}")
    public ResponseEntity<Page<RodoviaVO>> getAll(@PathVariable String tipo, @PageableDefault(page = 0, size = 10, sort = "gid", direction = Sort.Direction.ASC)Pageable pageable){
        return new ResponseEntity<>(repository.listarRodovias(tipo, pageable), HttpStatus.OK);
    }
  
}