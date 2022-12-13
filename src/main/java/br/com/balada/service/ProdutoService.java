package br.com.balada.service;

import br.com.balada.entity.Produto;
import br.com.balada.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> verificacao() {

        List<Produto> produtos = produtoRepository.findAll();
        List<Produto> sacolaDeFrutas = new ArrayList<>();

        for (Produto p : produtos) {
            if (p.getQualidade() == String.valueOf(true)) {
                sacolaDeFrutas.add(p);
            }
        }
        return sacolaDeFrutas;
    }
}



