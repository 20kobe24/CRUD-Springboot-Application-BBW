package ch.bbw.rc.crudspringboot.Controller;


import ch.bbw.rc.crudspringboot.Service.BuchungService;
import ch.bbw.rc.crudspringboot.model.Buchung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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



}