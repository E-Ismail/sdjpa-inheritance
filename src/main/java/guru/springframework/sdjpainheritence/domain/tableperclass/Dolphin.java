package guru.springframework.sdjpainheritence.domain.tableperclass;

import jakarta.persistence.Entity;

/**
 * @author E.I.
 * <p>
 * {@code @Date}  5/13/2023
 */

@Entity
public class Dolphin extends Mammal {

    private Boolean hasSpots;

    public Boolean getHasSpots() {
        return hasSpots;
    }

    public void setHasSpots(Boolean hasSpots) {
        this.hasSpots = hasSpots;
    }
}
