package com.vengard.aplikacje_bazodanowe_projekt.repository;

import com.vengard.aplikacje_bazodanowe_projekt.dao.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
