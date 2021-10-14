package com.softwareinstitute.andreeaholban;

import java.time.LocalDate;

public class Book extends LibraryItem implements Searchable{
    ////////////////////////////////////////////Attributes//////////////////////////////////////////////////////////////
    private double refNumber;
    private String status;

    ////////////////////////////////////////////Constructors////////////////////////////////////////////////////////////

    public Book(String title, String author, Boolean isBorrowable, String status){
        this(title, author, null, 80002 , isBorrowable, "Physical", "unknown", 1, 5, 1994, status);
    }

    public Book(String title, String author, LocalDate publicationDate, double ISBN, Boolean isBorrowable, String format, String section, int shelf, int copiesAvailable, double refNumber, String status){
        super(title, author, publicationDate, ISBN, isBorrowable, format, section, shelf, copiesAvailable);
        this.refNumber = refNumber;
        this.status = status;
    }
    /////////////////////////////////////////////Methods///////////////////////////////////////////////////////////////


    public double getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(double refNumber) {
        this.refNumber = refNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
