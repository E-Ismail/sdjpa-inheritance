package guru.springframework.sdjpainheritence.domain.singletable;

import jakarta.persistence.*;

/**
 * @author E.I.
 * <p>
 * {@code @Date}  5/13/2023
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "vehicle_type")
public abstract class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
