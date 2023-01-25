package ch.bbw.rc.crudspringboot.Controller;

import ch.bbw.rc.crudspringboot.Service.GingershotService;
import ch.bbw.rc.crudspringboot.model.GingerShot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/gingershot")
public class GingershotController {

    @Autowired
    private GingershotService gingerShotService;

    @GetMapping
    public List<GingerShot> getAllGingerShots() {
        return gingerShotService.getAllGingerShots();
    }

    @GetMapping("/{id}")
    public GingerShot getGingerShotById(@PathVariable Long id) {
        return gingerShotService.getGingerShotById(id);
    }

    @PutMapping("/{id}")
    public GingerShot updateGingerShot(@PathVariable Long id, @RequestBody GingerShot gingerShot) {
        return gingerShotService.updateGingerShot(id, gingerShot);
    }

    @PostMapping
    public GingerShot createGingerShot(@RequestBody GingerShot gingerShot) {
        return gingerShotService.createGingerShot(gingerShot);
    }

    @DeleteMapping("/{id}")
    public void deleteGingerShot(@PathVariable Long id) {
        gingerShotService.deleteGingerShot(id);
    }
}
