package com.example.udong.repository;

import com.example.udong.model.StudentBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentBean, Long> {

}