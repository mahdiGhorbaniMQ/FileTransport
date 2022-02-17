package com.example.filetransport.service;


import java.io.IOException;
import java.util.stream.Stream;

import com.example.filetransport.model.ZipFileDB;
import com.example.filetransport.repository.ZipFileDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.filetransport.model.FileDB;
import com.example.filetransport.repository.FileDBRepository;

@Service
public class FileStorageService {

    @Autowired
    private FileDBRepository fileDBRepository;

    @Autowired
    private ZipFileDBRepository zipFileDBRepository;

    @Autowired
    private ZipService zipService;

    public boolean store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileDB fileDB = new FileDB(fileName, file.getContentType(), file.getBytes(), "");
        fileDBRepository.save(fileDB);

        MultipartFile zipFile = zipService.zip(file);
        String zipFileName = StringUtils.cleanPath(zipFile.getOriginalFilename());
        ZipFileDB zipFileDB = new ZipFileDB(zipFileName, zipFile.getContentType(), zipFile.getBytes(), "");
        zipFileDB.setFileId(fileDB.getId());
        zipFileDBRepository.save(zipFileDB);

        fileDB.setZipFileId(zipFileDB.getId());

        fileDBRepository.save(fileDB);

        return true;
    }

    public FileDB getFile(String id) {
        return fileDBRepository.findById(id).get();
    }

    public ZipFileDB getZipFile(String id) {
        return zipFileDBRepository.findById(id).get();
    }

    public Stream<FileDB> getAllFiles() {
        return fileDBRepository.findAll().stream();
    }
}