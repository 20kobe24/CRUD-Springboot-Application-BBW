package ch.bbw.rc.crudspringboot.Controller;


import ch.bbw.rc.crudspringboot.Service.BuchungService;
import ch.bbw.rc.crudspringboot.model.Buchung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buchungen")
public class BuchungController {

    @Autowired
    private BuchungService buchungService;

    @GetMapping
    public List<Buchung> getAllBuchungen() {
        return buchungService.getAllBuchungen();
    }

    @GetMapping("/halbtaetig")
    public List<Buchung> getAllHalbTaetigBuchungen(@RequestParam(value = "active", defaultValue = "true") boolean active) {
        return buchungService.getAllHalbTaetigBuchungen(active);
    }

    @GetMapping("/{id}")
    public Buchung getBuchungById(@PathVariable Long id) {
        return buchungService.getBuchungById(id);
    }

    @PutMapping
    public Buchung updateBuchung(@RequestBody Buchung buchung) {
        return buchungService.updateBuchung(buchung);
    }

    @PostMapping
    public Buchung createBuchung(@RequestBody Buchung buchung) {
        return buchungService.createBuchung(buchung);
    }

    @DeleteMapping("/{id}")
    public void deleteBuchung(@PathVariable Long id) {
        buchungService.deleteBuchung(id);
    }


}
