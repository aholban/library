package com.softwareinstitute.andreeaholban;

import java.time.LocalDate;
import java.util.List;

//Scientific papers can be included in this class
public class Document extends LibraryItem{
    //////////////////////////////////////////////Attributes/////////////////////////////////////////////////////////////////////

    private int citationsNumber;
    private List<String> references;

    ///////////////////////////////////////////////Constructors/////////////////////////////////////////////////////////////////
    public Document(String title, String author, LocalDate publicationDate, String ISBN, Boolean isBorrowable, String format, String section, int shelf, int copiesAvailable) {
        super(title, author, publicationDate, ISBN, isBorrowable, format, section, shelf, copiesAvailable);
    }

    ////////////////////////////////////////////////Methods//////////////////////////////////////////////////////////////////////

    public int getCitationsNumber() {
        return citationsNumber;
    }

    public void setCitationsNumber(int citationsNumber) {
        this.citationsNumber = citationsNumber;
    }

    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }
}
