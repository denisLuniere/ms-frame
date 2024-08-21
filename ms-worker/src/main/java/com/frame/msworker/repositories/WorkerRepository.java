package com.frame.msworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frame.msworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
