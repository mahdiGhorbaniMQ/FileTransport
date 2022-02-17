package com.example.filetransport.repository;

import com.example.filetransport.model.ZipFileDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ZipFileDBRepository  extends JpaRepository<ZipFileDB, String> {
}
