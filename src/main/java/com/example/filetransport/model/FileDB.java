package com.example.filetransport.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "files")
public class FileDB {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Getter
    private String id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String type;

    @Getter @Setter
    private String userId;

    @Lob
    @Getter @Setter
    private byte[] data;

    @Getter @Setter
    private String zipFileId;

    public FileDB() {
    }

    public FileDB(String name, String type, byte[] data, String userId) {
        this.name = name;
        this.type = type;
        this.data = data;
        this.userId = userId;
    }

}
