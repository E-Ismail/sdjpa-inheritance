package guru.springframework.sdjpainheritence.domain.repositories;

import guru.springframework.sdjpainheritence.domain.joined.ElectricGuitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author E.I.
 * <p>
 * {@code @Date}  5/13/2023
 */

public interface ElectricGuitarRepository extends JpaRepository<ElectricGuitar, Long> {
}
