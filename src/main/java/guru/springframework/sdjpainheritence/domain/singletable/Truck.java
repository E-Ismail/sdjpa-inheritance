package guru.springframework.sdjpainheritence.domain.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 * @author E.I.
 * <p>
 * {@code @Date}  5/13/2023
 */

@Entity
@DiscriminatorValue("truck")
public class Truck extends Vehicle{

    private Integer payLoad;

    public Integer getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(Integer payLoad) {
        this.payLoad = payLoad;
    }
}
