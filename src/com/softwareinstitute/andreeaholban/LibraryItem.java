package com.softwareinstitute.andreeaholban;

import java.time.LocalDate;

public abstract class LibraryItem implements Searchable{

    ///////////////////////////////////////Attributes//////////////////////////////////////////////////

    private String title;
    private String author;
    private LocalDate publicationDate;
    private double ISBN;
    private Boolean isBorrowable;
    private String format;
    private String section;
    private int shelf;
    private int copiesAvailable;

    ///////////////////////////////////////Constraints////////////////////////////////////////////////

    public LibraryItem(String title, String author, LocalDate publicationDate, double ISBN, Boolean isBorrowable, String format, String section, int shelf, int copiesAvailable){
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.ISBN = ISBN;
        this.isBorrowable = isBorrowable;
        this.format = format;
        this.section = section;
        this.shelf = shelf;
        this.copiesAvailable = copiesAvailable;
    }

    ///////////////////////////////////////Methods///////////////////////////////////////////////////


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public double getISBN() {
        return ISBN;
    }

    public void setISBN(double ISBN) {
        this.ISBN = ISBN;
    }

    public Boolean getBorrowable() {
        return isBorrowable;
    }

    public void setBorrowable(Boolean borrowable) {
        isBorrowable = borrowable;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String findLocation(){
        String location = "";
        if(format.equals("Digital")){
            location = "Check our digital catalogue on one of our computers.";
        }
        else{
            location = "You can find it in the " + section + " on the shelf " + shelf;
        }
        return location;
    }
}
