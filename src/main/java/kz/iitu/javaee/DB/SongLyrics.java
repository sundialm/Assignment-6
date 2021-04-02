package kz.iitu.javaee.DB;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SongLyrics {
    private Long id;
    private String title;
    private String short_content;
    private String content;
    private Timestamp post_date;
    private String picture_url;
    private Language language;
    private Publication publication;

    public SongLyrics()  {
    }

    public SongLyrics(Long id, String title, String short_content, String content, Timestamp post_date, String picture_url, Language language, Publication publication){
        this.id = id;
        this.title = title;
        this.short_content = short_content;
        this.content = content;
        this.post_date = post_date;
        this.picture_url = picture_url;
        this.language = language;
        this.publication = publication;
    }

    public String get_post_date_str() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date(getPost_date().getTime()));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShort_content() {
        return short_content;
    }

    public void setShort_content(String short_content) {
        this.short_content = short_content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getPost_date() {
        return post_date;
    }

    public void setPost_date(Timestamp post_date) {
        this.post_date = post_date;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String picture_url) {
        this.picture_url = picture_url;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }
}
