package com.example.doctorappdemo.controller;


import com.example.doctorappdemo.entity.Entries;
import com.example.doctorappdemo.entity.Pictures;
import com.example.doctorappdemo.service.EntriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EntriesController {

    @Autowired
    private EntriesService entriesService;


    @GetMapping("/blog")
    public String BlogForm(Model model) {
        List<Entries> entriesList = entriesService.findAll();
        model.addAttribute("entries", entriesList);

        for(Entries e : entriesList){
            System.out.println(e.toString());
        }


        return "blog";
    }
}
