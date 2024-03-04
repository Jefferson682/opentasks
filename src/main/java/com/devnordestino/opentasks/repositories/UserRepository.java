package com.devnordestino.opentasks.repositories;

import com.devnordestino.opentasks.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
