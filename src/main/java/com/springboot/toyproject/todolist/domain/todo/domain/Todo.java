package com.springboot.toyproject.todolist.domain.todo.domain;

import com.springboot.toyproject.todolist.domain.model.TodoStatus;
import com.springboot.toyproject.todolist.domain.user.domain.Mbr;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "todo_base")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    
    @Enumerated(EnumType.STRING)
    private TodoStatus status;
    
    @ManyToOne
    @JoinColumn(name = "mbr_id")
    private Mbr mbr;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime sysRegDtime;

    @Column(nullable = false)
    private String sysRegId;

    @LastModifiedDate
    @Column(updatable = false)
    private LocalDateTime sysModDtime;
    
    private String sysModId;
    
    @Builder
    public Todo(@NonNull Mbr mbr, TodoStatus status, String title) {
        this.mbr = mbr;
        this.status = status;
        this.title = title;
    }
}
