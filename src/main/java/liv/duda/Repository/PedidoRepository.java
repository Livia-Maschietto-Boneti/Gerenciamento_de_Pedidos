package liv.duda.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import liv.duda.Model.PedidoModel;

public interface PedidoRepository extends JpaRepository<PedidoModel,Long> {

}

