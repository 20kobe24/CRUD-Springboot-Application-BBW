package ch.bbw.rc.crudspringboot.Service;

import ch.bbw.rc.crudspringboot.repository.RoleRepository;

import ch.bbw.rc.crudspringboot.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(Role role){
        return roleRepository.save(role);

    }
}
