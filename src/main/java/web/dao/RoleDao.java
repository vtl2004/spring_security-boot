package web.dao;

import web.model.Role;

import java.util.List;

public interface RoleDao {

    List<Role> findAllRoles();
    Role findRole(long id);
    Role getRoleByName(String role);

}
