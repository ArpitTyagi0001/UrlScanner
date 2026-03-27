package com.arpit.urlScanner.repository;

import com.arpit.urlScanner.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUrl(String url);
}
