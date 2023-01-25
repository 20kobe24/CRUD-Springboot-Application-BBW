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

}
