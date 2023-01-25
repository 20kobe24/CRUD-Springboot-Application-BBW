package ch.bbw.rc.crudspringboot.repository;

import ch.bbw.rc.crudspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
