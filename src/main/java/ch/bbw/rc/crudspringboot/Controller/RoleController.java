package ch.bbw.rc.crudspringboot.Controller;

import ch.bbw.rc.crudspringboot.Service.RoleService;
import ch.bbw.rc.crudspringboot.model.Role;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/role")
public class RoleController {
    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @Operation(summary = "Get all Roles")
    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Long id) {
        return roleService.getRoleById(id);
    }

    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }

    @PutMapping("/{id}")
    public Role updateRole(@PathVariable Long id, @RequestBody Role role) {
        return roleService.updateRole(id, role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
    }

}
