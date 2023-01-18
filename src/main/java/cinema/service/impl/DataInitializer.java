package cinema.service.impl;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    private void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        adminRole = roleService.add(adminRole);
        userRole = roleService.add(userRole);
        User adminUser = new User();
        adminUser.setEmail("admin@i.ua");
        adminUser.setPassword("admin5678");
        adminUser.setRoles(Set.of(adminRole));
        userService.add(adminUser);
    }
}
