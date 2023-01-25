package ch.bbw.rc.crudspringboot.repository;

import ch.bbw.rc.crudspringboot.model.Buchung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuchungRepository extends JpaRepository<Buchung, Long> {
    List<Buchung> findByHalbTaetigAndStatus(boolean halbTaetig, boolean status);

}
