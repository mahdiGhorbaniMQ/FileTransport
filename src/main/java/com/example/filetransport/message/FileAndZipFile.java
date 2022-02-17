package com.example.filetransport.message;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

public class FileAndZipFile {

    @Getter @Setter
    private String id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String type;

    @Getter @Setter
    private byte[] data;


    @Getter @Setter
    private String zipId;

    @Getter @Setter
    private String zipName;

    @Getter @Setter
    private String zipType;

    @Getter @Setter
    private byte[] zipData;

    public FileAndZipFile() {
    }

    public FileAndZipFile(String name, String type, byte[] data, String zipName, String zipType, byte[] zipData) {
        this.name = name;
        this.type = type;
        this.data = data;

        this.zipName = zipName;
        this.zipType = zipType;
        this.zipData = zipData;
    }
}
