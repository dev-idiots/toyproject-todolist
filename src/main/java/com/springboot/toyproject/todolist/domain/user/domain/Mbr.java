package com.springboot.toyproject.todolist.domain.user.domain;

import com.springboot.toyproject.todolist.domain.todo.domain.Todo;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "mbr_base")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mbr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    private String email;
    
    private String password;
    
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime sysRegDtime;

    @Column(nullable = false)
    private String sysRegId;

    @LastModifiedDate
    @Column(updatable = false)
    private LocalDateTime sysModDtime;

    private String sysModId;
    
    private LocalDateTime sysDtlTime;
    
    @Builder
    public Mbr(@NonNull String name, @NonNull String email, @NonNull String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
