package liv.duda.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import liv.duda.Model.PedidoModel;
import liv.duda.Repository.PedidoRepository;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public PedidoModel criar(PedidoModel pedido){
        return repository.save(pedido);
    }

    public List<PedidoModel> listar(){
        return repository.findAll();
    }

    public PedidoModel buscar(long id){
        return repository.findById(id).get();
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

}


