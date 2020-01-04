package com.uchiha.gearshop.repository;

import com.uchiha.gearshop.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Query(value = "select * from tbuser u where u.username = ?1", nativeQuery = true)
    UserEntity findByUsername(@Param("username") String username);
}
