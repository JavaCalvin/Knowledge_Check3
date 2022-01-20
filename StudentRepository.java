package com.example.springWebapp.repository;

import com.example.springWebapp.Entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students,Integer> {



}
