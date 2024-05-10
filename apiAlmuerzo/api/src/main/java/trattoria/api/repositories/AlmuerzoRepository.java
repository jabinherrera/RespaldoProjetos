package trattoria.api.repositories;

import trattoria.api.models.Almuerzo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlmuerzoRepository extends JpaRepository<Almuerzo,Long> {
}
