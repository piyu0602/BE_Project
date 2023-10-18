package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.TaskModel;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Long>{

}
