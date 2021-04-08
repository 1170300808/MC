package com.matcloud.mc.service;

import com.matcloud.mc.dao.FileDAO;

import com.matcloud.mc.entity.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {
    @Autowired
    private FileDAO fileDAO;

    public List<File> listByUserId(int user_id) {
//        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return fileDAO.findAllByUserId(user_id);
    }
}
