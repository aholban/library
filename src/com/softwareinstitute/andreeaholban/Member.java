package com.softwareinstitute.andreeaholban;

import java.time.LocalDate;

public class Member implements Searchable{
    ////////////////////////////////////////////Attributes/////////////////////////////////////////////////////

    private String name;
    private double cardNumber;
    private LocalDate issuedDate;
    private int numberBooksBorrowed;

    ////////////////////////////////////////////Constructors//////////////////////////////////////////////////

    public Member(String name){
        this(name, 0, LocalDate.now(), 0);
    }
    public Member(String name, double cardNumber, LocalDate issuedDate, int numberBooksBorrowed){
        this.name = name;
        this.cardNumber = cardNumber;
        this.issuedDate = issuedDate;
        this.numberBooksBorrowed = numberBooksBorrowed;
    }

    ////////////////////////////////////////////Methods///////////////////////////////////////////////////////

    public String borrow(LibraryItem book){
        String result = "";
        if(book.getBorrowable()){
            if(this.numberBooksBorrowed<5 && book.getCopiesAvailable()>0){
                if(!book.getFormat().equals("Digital")) {
                    book.setCopiesAvailable(book.getCopiesAvailable() - 1);
                }
                result = "Succesfully borrowed";
            }
            else if (this.numberBooksBorrowed>=5){
                result = "You have reached the maximum amount of books you can borrow at once";

            }
            else if(book.getCopiesAvailable()==0){
                result = "No copies of this item are currently available";
            }

        }
        else{
            result = "Item can't be borrowed";
        }
        return result;
    }

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
