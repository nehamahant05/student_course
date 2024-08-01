package com.example.student_course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoom extends JpaRepository<ClassRoom,Long> {
}
