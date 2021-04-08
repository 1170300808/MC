package com.matcloud.mc.dao;

import com.matcloud.mc.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileDAO extends JpaRepository<File, Integer> {
    List<File> findAllByUserId(int user_id);
}
