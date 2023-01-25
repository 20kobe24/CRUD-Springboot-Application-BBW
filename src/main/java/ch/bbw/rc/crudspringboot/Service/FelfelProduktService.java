package ch.bbw.rc.crudspringboot.Service;

import ch.bbw.rc.crudspringboot.model.FelfelProdukt;
import ch.bbw.rc.crudspringboot.repository.FelfelProduktRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FelfelProduktService {

    private final FelfelProduktRepository felfelProduktRepository;

    public FelfelProduktService(FelfelProduktRepository felfelProduktRepository) {
        this.felfelProduktRepository = felfelProduktRepository;
    }

    public List<FelfelProdukt> getAllFelfelProdukts() {
        return felfelProduktRepository.findAll();
    }


}
