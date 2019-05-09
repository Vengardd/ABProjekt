package com.vengard.aplikacje_bazodanowe_projekt.repository;

import com.vengard.aplikacje_bazodanowe_projekt.dao.Privilege;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegeRepository extends CrudRepository<Privilege, Long> {
}
