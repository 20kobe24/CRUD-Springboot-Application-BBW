package ch.bbw.rc.crudspringboot.Service;

import ch.bbw.rc.crudspringboot.model.Buchung;
import ch.bbw.rc.crudspringboot.repository.BuchungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuchungService {

    @Autowired
    private final BuchungRepository buchungRepository;

    public BuchungService(BuchungRepository buchungRepository) {
        this.buchungRepository = buchungRepository;
    }

    public List<Buchung> getAllBuchungen() {
        return buchungRepository.findAll();
    }
}
