package com.matcloud.mc.entity;

import lombok.*;

@Data
public class File {
    private int id;
    private String name;
    private int user_id;
    private String created;
    private String last_modified;
    private String content;
}
