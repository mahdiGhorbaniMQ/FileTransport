package com.example.filetransport.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "zip_files")
public class ZipFileDB {
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
    private String fileId;

    public ZipFileDB() {
    }

    public ZipFileDB(String name, String type, byte[] data, String userId) {
        this.name = name;
        this.type = type;
        this.data = data;
        this.userId = userId;
    }

}
