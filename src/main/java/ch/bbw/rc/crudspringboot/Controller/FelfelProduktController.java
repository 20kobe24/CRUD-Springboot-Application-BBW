package ch.bbw.rc.crudspringboot.Controller;

import ch.bbw.rc.crudspringboot.Service.FelfelProduktService;
import ch.bbw.rc.crudspringboot.model.FelfelProdukt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/felfelprodukt")
public class FelfelProduktController {
    @Autowired
    private FelfelProduktService felfelProduktService;


    @GetMapping
    public List<FelfelProdukt> getAllFelfelProdukts() {
        return felfelProduktService.getAllFelfelProdukts();
    }

    @GetMapping("/{id}")
    public FelfelProdukt getFelfelProduktById(@PathVariable Long id) {
        return felfelProduktService.getFelfelProduktById(id);
    }

    @PutMapping("/{id}")
    public FelfelProdukt updateFelfelProdukt(@PathVariable Long id, @RequestBody FelfelProdukt felfelProdukt) {
        return felfelProduktService.updateFelfelProdukt(id, felfelProdukt);
    }

    @PostMapping
    public FelfelProdukt createFelfelProdukt(@RequestBody FelfelProdukt felfelProdukt) {
        return felfelProduktService.createFelfelProdukt(felfelProdukt);
    }

    @DeleteMapping("/{id}")
    public void deleteFelfelProdukt(@PathVariable Long id) {
        felfelProduktService.deleteFelfelProdukt(id);
    }
}
