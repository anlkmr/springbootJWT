package com.anil.jwtExample.repository;

import com.anil.jwtExample.models.ERole;
import com.anil.jwtExample.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(ERole name);
}