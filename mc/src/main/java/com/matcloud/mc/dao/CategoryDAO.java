package com.matcloud.mc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matcloud.mc.entity.Category;

/**
 * @author Evan
 * @date 2019/4
 */
public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
