package com.example.doctorappdemo.service;

import com.example.doctorappdemo.entity.Entries;
import com.example.doctorappdemo.entity.Pictures;

import java.util.List;

public interface EntriesService {

    List<Entries> findAll();
    List<Pictures> findAllPictures();

    List<String> findEntriesAllPictures(int id);
}
