package novedades.cont.viendo.series.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import novedades.cont.viendo.series.entity.ContinuarViendoEntity;

@Repository
public interface ContinuarViendoRepository extends JpaRepository<ContinuarViendoEntity,Long>{

}
