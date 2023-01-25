package ch.bbw.rc.crudspringboot.Service;


import ch.bbw.rc.crudspringboot.model.GingerShot;
import ch.bbw.rc.crudspringboot.repository.GingerShotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GingershotService {
    @Autowired
    private final GingerShotRepository gingerShotRepository;


    public GingershotService(GingerShotRepository gingerShotRepository) {
        this.gingerShotRepository = gingerShotRepository;
    }


    public List<GingerShot> getAllGingerShots() {
        return gingerShotRepository.findAll();
    }

    public GingerShot getGingerShotById(Long id) {
        return gingerShotRepository.findById(id).orElse(null);
    }

    public GingerShot updateGingerShot(Long id, GingerShot gingerShot) {
        gingerShot.setId(id);
        return gingerShotRepository.save(gingerShot);
    }

    public GingerShot createGingerShot(GingerShot gingerShot) {
        return gingerShotRepository.save(gingerShot);
    }

    public void deleteGingerShot(Long id) {
        gingerShotRepository.deleteById(id);
    }
}
