package com.matcloud.mc.service;

import com.matcloud.mc.dao.FileDAO;

import com.matcloud.mc.entity.File;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {
    @Autowired
    private FileDAO fileDAO;
    @Autowired
    UserService userService;

    public List<File> listByUserId() {
//        Sort sort = new Sort(Sort.Direction.DESC, "id");
        String username = SecurityUtils.getSubject().getPrincipal().toString();
        int user_id = userService.findByUsername(username).getId();
        return fileDAO.findAllByUserId(user_id);
    }
}
