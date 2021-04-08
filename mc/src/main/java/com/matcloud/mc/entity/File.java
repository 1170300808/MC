package com.matcloud.mc.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.matcloud.mc.dao.FileDAO;
import lombok.*;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "file")
@ToString
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "created_time")
    private String createdTime;
    @Column(name = "modified_time")
    private String modifiedTime;
    private String content;


}
