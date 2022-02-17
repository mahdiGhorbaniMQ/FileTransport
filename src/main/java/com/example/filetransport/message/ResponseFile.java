package com.example.filetransport.message;

import lombok.Getter;
import lombok.Setter;

public class ResponseFile {
    @Getter @Setter private String fileName;
    @Getter @Setter private String fileUrl;
    @Getter @Setter private String fileType;
    @Getter @Setter private long fileSize;

    @Getter @Setter private String zipFileName;
    @Getter @Setter private String zipFileUrl;
    @Getter @Setter private String zipFileType;
    @Getter @Setter private long zipFileSize;

    public ResponseFile(String fileName, String fileUrl, String fileType, long fileSize, String zipFileName, String zipFileUrl, String zipFileType, long zipFileSize) {
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.fileType = fileType;
        this.fileSize = fileSize;

        this.zipFileName = zipFileName;
        this.zipFileUrl = zipFileUrl;
        this.zipFileType = zipFileType;
        this.zipFileSize = zipFileSize;
    }
}