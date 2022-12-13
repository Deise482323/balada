package br.com.balada.http.v1;

import br.com.balada.entity.Produto;
import br.com.balada.service.ProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(path = "/api/v1/feira")
@CrossOrigin
public class FeiraController {
    @Autowired
    private ProdutoService produtoService;

    public List<Produto> verificacao() {
        return produtoService.verificacao();
    }
}
