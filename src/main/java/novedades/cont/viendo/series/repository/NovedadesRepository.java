package novedades.cont.viendo.series.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import novedades.cont.viendo.series.entity.NovedadesEntity;

@Repository
public interface NovedadesRepository extends JpaRepository<NovedadesEntity,Long>{
		
	
	
	
}
