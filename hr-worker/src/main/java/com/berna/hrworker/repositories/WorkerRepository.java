package com.berna.hrworker.repositories;

import com.berna.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {

}
