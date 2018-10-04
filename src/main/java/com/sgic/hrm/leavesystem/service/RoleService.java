package com.sgic.hrm.leavesystem.service;

import java.util.Optional;
import java.util.List;

import com.sgic.hrm.leavesystem.entity.Role;

public interface RoleService {
	Optional<Role> getRoleById(Integer id);

  boolean addRole(Role role);

	List<Role> getAllRoles();

	boolean editRole(Role role, Integer id);
}
