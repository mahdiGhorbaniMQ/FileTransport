package com.example.filetransport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.filetransport.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}