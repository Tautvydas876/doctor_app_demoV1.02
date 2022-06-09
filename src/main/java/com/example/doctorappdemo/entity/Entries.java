package com.example.doctorappdemo.entity;


import javax.persistence.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.List;

@Entity
@Table(name = "entries")
public class Entries {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @Column(name = "date")
    String data = new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new java.util.Date());

    @Column(name = "title", length = 512)
    private String title = (String.valueOf(StandardCharsets.UTF_8));

    @Column(name = "entry" , columnDefinition = "text")
    private String entry;


    @OneToMany()
    @JoinColumn(name = "picture_id") //FK
    private List<Pictures> picture;



    public Entries() {
    }

    public Entries(int id, String data, String title, String entry, List<Pictures> picture) {
        this.id = id;
        this.data = data;
        this.title = title;
        this.entry = entry;
        this.picture = picture;
    }

    public Entries(String data, String title, String entry, List<Pictures> picture) {
        this.data = data;
        this.title = title;
        this.entry = entry;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public List<Pictures> getPicture() {
        return picture;
    }

    public void setPicture(List<Pictures> picture) {
        this.picture = picture;
    }


    @Override
    public String toString() {
        return "Entries{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", title='" + title + '\'' +
                ", entry='" + entry + '\'' +
                ", picture=" + picture +
                '}';
    }
}
