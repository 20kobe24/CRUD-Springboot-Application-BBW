package ch.bbw.rc.crudspringboot.Controller;

import ch.bbw.rc.crudspringboot.Service.RoleService;
import ch.bbw.rc.crudspringboot.model.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/role")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping
    public Role createROle(@RequestBody Role role){
        return roleService.createRole(role);

    }

}
