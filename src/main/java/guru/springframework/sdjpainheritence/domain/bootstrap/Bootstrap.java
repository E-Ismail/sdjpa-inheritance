package guru.springframework.sdjpainheritence.domain.bootstrap;

import guru.springframework.sdjpainheritence.domain.joined.ElectricGuitar;
import guru.springframework.sdjpainheritence.domain.repositories.ElectricGuitarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author E.I.
 * <p>
 * {@code @Date}  5/13/2023
 */

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    ElectricGuitarRepository electricGuitarRepository;
    @Override
    public void run(String... args) throws Exception {
        ElectricGuitar electricGuitar = new ElectricGuitar();
        electricGuitar.setNumberOfStrings(6);
        electricGuitar.setNumberOfPickups(3);
        electricGuitarRepository.save(electricGuitar);
    }
}
