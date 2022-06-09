package com.example.doctorappdemo.service;

import com.example.doctorappdemo.dao.EntriesRepository;
import com.example.doctorappdemo.entity.Entries;
import com.example.doctorappdemo.entity.Pictures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EntriesServiceImpl implements EntriesService{


    @Autowired
    private EntriesRepository entriesRepository;

    @Override
    public List<Entries> findAll() {
        return entriesRepository.findAll();
    }

    @Override
    public List<Pictures> findAllPictures() {
        return entriesRepository.findAllPictures();
    }

    @Override
    public List<String> findEntriesAllPictures(int id) {
        return entriesRepository.findAllPicturesOfEntriesById(id);
    }
}
