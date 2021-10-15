package com.softwareinstitute.andreeaholban;

import java.time.LocalDate;


//Maps can be included in this class, maybe
public class Blueprint extends LibraryItem{
    ////////////////////////////////////Attributes///////////////////////////////////////////////////////////////////

    //////////////////////////////////Constructors////////////////////////////////////////////////////////////////////
    public Blueprint(String title, String author, LocalDate publicationDate, String ISBN, Boolean isBorrowable, String format, String section, int shelf, int copiesAvailable) {
        super(title, author, publicationDate, ISBN, isBorrowable, format, section, shelf, copiesAvailable);
    }

    ////////////////////////////////////Methods///////////////////////////////////////////////////////////////////////
}
