package com.softwareinstitute.andreeaholban;

import java.time.LocalDate;

public class Member {
    ////////////////////////////////////////////Attributes/////////////////////////////////////////////////////

    private String name;
    private double cardNumber;
    private LocalDate issuedDate;
    private int numberBooksBorrowed;

    ////////////////////////////////////////////Constructors//////////////////////////////////////////////////


    ////////////////////////////////////////////Methods///////////////////////////////////////////////////////



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(double cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public int getNumberBooksBorrowed() {
        return numberBooksBorrowed;
    }

    public void setNumberBooksBorrowed(int numberBooksBorrowed) {
        this.numberBooksBorrowed = numberBooksBorrowed;
    }
}
