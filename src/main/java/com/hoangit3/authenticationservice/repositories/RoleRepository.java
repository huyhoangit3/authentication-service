package com.hoangit3.authenticationservice.repositories;

import java.util.Optional;

import com.hoangit3.authenticationservice.models.ERole;
import com.hoangit3.authenticationservice.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
