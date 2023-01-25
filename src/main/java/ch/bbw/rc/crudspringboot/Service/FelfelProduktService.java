package ch.bbw.rc.crudspringboot.Service;

import ch.bbw.rc.crudspringboot.repository.FelfelProduktRepository;
import org.springframework.stereotype.Service;

@Service
public class FelfelProduktService {

    private final FelfelProduktRepository felfelProduktRepository;

    public FelfelProduktService(FelfelProduktRepository felfelProduktRepository) {
        this.felfelProduktRepository = felfelProduktRepository;
    }
}
