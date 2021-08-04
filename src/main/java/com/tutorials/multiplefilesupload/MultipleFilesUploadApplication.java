package com.tutorials.multiplefilesupload;

import com.tutorials.multiplefilesupload.service.FileStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class MultipleFilesUploadApplication implements CommandLineRunner {

    @Resource
    FileStorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(MultipleFilesUploadApplication.class, args);
    }

    @Override
    public void run(String... arg) throws Exception {
//        storageService.deleteAll();
        storageService.init();
    }

}
