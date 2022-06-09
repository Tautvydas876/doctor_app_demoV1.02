package com.example.doctorappdemo.dao;


import com.example.doctorappdemo.entity.Entries;
import com.example.doctorappdemo.entity.Pictures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntriesRepository extends JpaRepository<Entries, Long> {

    @Query("SELECT u FROM Entries u join u.picture")    //suranda viska
    List<Entries> findAll();

    @Query("SELECT u from Pictures u") //suranda visus url
    List<Pictures> findAllPictures();

    @Query("select u.pictureUrl  from  Pictures u join u.entries  where u.entries.id =:entries_id")  //suranda atitinkamo Entries visus url
    List<String> findAllPicturesOfEntriesById( @Param("entries_id") int id);


}
