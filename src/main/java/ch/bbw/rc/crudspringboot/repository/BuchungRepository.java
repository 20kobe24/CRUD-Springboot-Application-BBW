package ch.bbw.rc.crudspringboot.repository;

import ch.bbw.rc.crudspringboot.model.Buchung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuchungRepository extends JpaRepository<Buchung, Long> {
}
