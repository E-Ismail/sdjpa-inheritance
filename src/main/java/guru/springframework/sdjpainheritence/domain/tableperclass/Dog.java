package guru.springframework.sdjpainheritence.domain.tableperclass;

import jakarta.persistence.Entity;

/**
 * @author E.I.
 * <p>
 * {@code @Date}  5/13/2023
 */
@Entity
public class Dog extends Mammal {

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
