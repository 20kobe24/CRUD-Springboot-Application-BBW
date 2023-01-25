package ch.bbw.rc.crudspringboot.repository;

import ch.bbw.rc.crudspringboot.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
