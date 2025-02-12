package com.math012.santander_week_dev.domain.repository;

import com.math012.santander_week_dev.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
