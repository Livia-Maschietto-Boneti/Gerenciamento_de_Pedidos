package liv.duda.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import liv.duda.Model.PedidoModel;
import liv.duda.Service.PedidoService;

import java.util.List;
@RestController

@RequestMapping(path = "/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public PedidoModel criar(@RequestBody PedidoModel pedidoModel){
        return pedidoService.criar(pedidoModel);
    }

    @GetMapping
    public List<PedidoModel> listar(){
        return pedidoService.listar();
    }

    @DeleteMapping
    public void deletar(@PathVariable Long id){
        pedidoService.deletar(id);
    }

}



