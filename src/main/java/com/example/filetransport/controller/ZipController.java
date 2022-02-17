package com.example.filetransport.controller;

import com.example.filetransport.message.ResponseMessage;
import com.example.filetransport.model.FileDB;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ZipController {

    @PostMapping("hello")
    public String hello(@RequestBody String name){
        System.out.println("salam");
        return "hello "+name;
    }

    @PostMapping("/zip")
    public ResponseEntity<byte[]> getZipFile(@RequestParam("file") MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
                .body(file.getBytes());
    }
}
