package com.example.filetransport.message;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

public class FileRequest {
    private String key = "file";

    @Getter @Setter private MultipartFile file;

    public FileRequest(){}
    public FileRequest(MultipartFile file){
        this.key = "key";
        this.file = file;
    }
}
