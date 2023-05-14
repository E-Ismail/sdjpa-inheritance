package guru.springframework.sdjpainheritence.domain.joined;

import jakarta.persistence.Entity;

/**
 * @author E.I.
 * <p>
 * {@code @Date}  5/13/2023
 */

@Entity
public class Guitar extends Instrument{

    private Integer numberOfStrings;

    public Integer getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(Integer numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
