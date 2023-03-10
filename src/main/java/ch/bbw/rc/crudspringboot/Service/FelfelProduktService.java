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

    public FelfelProdukt getFelfelProduktById(Long id) {
        return felfelProduktRepository.findById(id).orElse(null);
    }

    public FelfelProdukt updateFelfelProdukt(Long id, FelfelProdukt felfelProdukt) {
        felfelProdukt.setId(id);
        return felfelProduktRepository.save(felfelProdukt);
    }

    public FelfelProdukt createFelfelProdukt(FelfelProdukt felfelProdukt) {
        return felfelProduktRepository.save(felfelProdukt);
    }

    public void deleteFelfelProdukt(Long id) {
        felfelProduktRepository.deleteById(id);
    }

}
