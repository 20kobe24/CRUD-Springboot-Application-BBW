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
//
//    public List<Buchung> getAllHalbTaetigBuchungen(boolean active) {
//        return buchungRepository.findByHalbTaetigAndStatus(active, true);
//    }

    public Buchung getBuchungById(Long id) {
        return buchungRepository.findById(id).orElse(null);
    }

    public Buchung updateBuchung(Buchung buchung) {
        return buchungRepository.save(buchung);
    }

    public Buchung createBuchung(Buchung buchung) {
        return buchungRepository.save(buchung);
    }

    public void deleteBuchung(Long id) {
        buchungRepository.deleteById(id);
    }

}
