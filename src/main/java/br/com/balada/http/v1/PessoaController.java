package br.com.balada.http.v1;

import br.com.balada.entity.Pessoa;
import br.com.balada.service.PessoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(path = "/api/v1/balada")
@CrossOrigin
public class PessoaController {


    @Autowired
    private PessoaService service;

    @GetMapping
    public List<Pessoa> filtro(){
        return service.filtro();
    }
}
