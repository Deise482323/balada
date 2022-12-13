package br.com.balada.service;

import br.com.balada.entity.Pessoa;
import br.com.balada.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    // criar um metodo que vai listar todas as pessoas, e vai devolver só as que são maiores de 18 anos.
    public List<Pessoa> filtro() {

        List<Pessoa> pessoas = repository.findAll();
        List<Pessoa> pessoasMaioresDeDezoitoAnos = new ArrayList<>();

        for (Pessoa p : pessoas) {
            if (p.getIdade() >= 18) {
                pessoasMaioresDeDezoitoAnos.add(p);
            }
        }

        return pessoasMaioresDeDezoitoAnos;

    }

}
