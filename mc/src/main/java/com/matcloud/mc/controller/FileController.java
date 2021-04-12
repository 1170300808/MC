package com.matcloud.mc.controller;

import com.matcloud.mc.result.Result;
import com.matcloud.mc.result.ResultFactory;
import com.matcloud.mc.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FileController {
    @Autowired
    private FileService fileService;

    @GetMapping("/api/files/{user_id}/")
    public Result listFiles(@PathVariable("user_id") int user_id) {
        return ResultFactory.buildSuccessResult(fileService.listByUserId(user_id));
    }
}
