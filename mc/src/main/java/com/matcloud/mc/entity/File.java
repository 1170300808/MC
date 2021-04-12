package com.matcloud.mc.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

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
