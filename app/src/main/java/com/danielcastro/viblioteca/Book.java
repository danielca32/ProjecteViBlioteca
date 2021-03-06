package com.danielcastro.viblioteca;

public class Book {

    private String ISBN;
    private String author;
    private String code;
    private String date;
    private String description;
    private String edition;
    private String genre;
    private String publisher;
    private String title;
    private String imageUrl;



    public Book(){

    }
    public Book(String ISBN, String author, String code, String date, String description, String edition, String genre, String publisher, String title, String imageUrl) {
        this.ISBN = ISBN;
        this.author = author;
        this.code = code;
        this.date = date;
        this.description = description;
        this.edition = edition;
        this.genre = genre;
        this.publisher = publisher;
        this.title = title;
        this.imageUrl = imageUrl;
    }
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
