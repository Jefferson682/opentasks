package com.devnordestino.opentasks.repositories;

import com.devnordestino.opentasks.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
