package com.springboot.toyproject.todolist.domain.user.dao;

import com.springboot.toyproject.todolist.domain.user.domain.Mbr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MbrRepsoitory extends JpaRepository<Mbr, Long> {    
}
