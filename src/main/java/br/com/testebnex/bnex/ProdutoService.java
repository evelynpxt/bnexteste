package br.com.testebnex.bnex;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto>listarTodos(){
        return produtoRepository.findAll();
    }
    public Optional<Produto> buscarPoId(Long id){
        return produtoRepository.findById(id);

    }

    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);

    }

    public void remover(Long id){
        produtoRepository.deleteById(id);
    }


    public Optional<Object> buscarPorId(Long id) {
            return null;
    }
}
