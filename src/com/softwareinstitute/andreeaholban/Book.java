package com.softwareinstitute.andreeaholban;

import java.time.LocalDate;

public class Book extends LibraryItem implements Searchable{
    ////////////////////////////////////////////Attributes//////////////////////////////////////////////////////////////
    private String refNumber;
    private String status;

    ////////////////////////////////////////////Constructors////////////////////////////////////////////////////////////

    public Book(String title, String author, Boolean isBorrowable, String status){
        this(title, author, null, "" , isBorrowable, "Physical", "unknown", 1, 5, "", status);
    }

    public Book(String title, String author, LocalDate publicationDate, String ISBN, Boolean isBorrowable, String format, String section, int shelf, int copiesAvailable, String refNumber, String status){
        super(title, author, publicationDate, ISBN, isBorrowable, format, section, shelf, copiesAvailable);
        this.refNumber = refNumber;
        this.status = status;
    }
    /////////////////////////////////////////////Methods///////////////////////////////////////////////////////////////




    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
