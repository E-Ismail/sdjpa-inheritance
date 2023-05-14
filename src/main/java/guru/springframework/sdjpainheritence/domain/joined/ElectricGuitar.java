package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.Entity;

/**
 * @author E.I.
 * <p>
 * {@code @Date}  5/13/2023
 */
@Entity
public class ElectricGuitar extends Guitar {

    private Integer numberOfPickups;

    public Integer getNumberOfPickups() {
        return numberOfPickups;
    }

    public void setNumberOfPickups(Integer numberOfPickups) {
        this.numberOfPickups = numberOfPickups;
    }
}
