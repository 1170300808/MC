package com.matcloud.mc.dao;

import com.matcloud.mc.entity.AdminPermission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Evan
 * @date 2019/11
 */
public interface AdminPermissionDAO extends JpaRepository<AdminPermission, Integer> {
    AdminPermission findById(int id);
}
