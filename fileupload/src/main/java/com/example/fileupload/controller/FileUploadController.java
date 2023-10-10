package com.example.fileupload.controller;

import com.example.fileupload.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping
public class FileUploadController {
    @Autowired
    FileUploadService fileUploadService;
    @PostMapping
    public void uploadFile(@RequestParam("file")MultipartFile file) throws IOException {
        fileUploadService.uploadFile(file);
    }
}
