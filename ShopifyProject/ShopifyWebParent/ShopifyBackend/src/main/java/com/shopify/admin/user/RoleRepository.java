package com.shopify.admin.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shopify.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
	
	

}
