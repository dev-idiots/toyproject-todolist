package com.springboot.toyproject.todolist.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/postgres")
@RequiredArgsConstructor
public class PostgresTestController {

    private final DataSource dataSource;
    private final JdbcTemplate jdbcTemplate;

    @GetMapping("/insert/{id}")
    public String insert(@PathVariable Long id){
        String result = "Success Insert Query";

        String sql = "insert into star values(" + id + ", 'name', 'plateer')";
        try {
            jdbcTemplate.execute(sql);
        }catch (Exception e){
            result = "Fail Insert Query";
        }

        return result;
    }
}
