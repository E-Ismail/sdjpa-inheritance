package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.*;

/**
 * @author E.I.
 * <p>
 * {@code @Date}  5/13/2023
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
