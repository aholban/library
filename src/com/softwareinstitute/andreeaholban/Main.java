package com.softwareinstitute.andreeaholban;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Member> members = new ArrayList<Member>();
        List<LibraryItem> items = new ArrayList<LibraryItem>();
        setupCollection(items);
        int terminate =0;
        while(terminate==0){

            System.out.println("Welcome to the Library! What do you want to do?");
            System.out.println("Type \"visitor\" if you are here as a visitor");
            System.out.println("Type \"add book\" if you want to add a book to the collection");
            System.out.println("Type \"leave\" if you wish to leave");
            String command = input.nextLine();
            switch (command){
                case "visitor":
                    Member visitor;
                    System.out.println("Hello! Are you new here? (yes/no)");
                    String isNew = input.nextLine();
                    if (isNew.equals("yes")) {
                        visitor = register(members);

                    }
                    else if(isNew.equals("no")){
                        System.out.println("What is your full name?");
                        String name = input.nextLine();
                        System.out.println("What is your card ID?");
                        String id = input.nextLine();
                        visitor = findMember(members, name, id);
                        if (visitor == null) {
                            System.out.println("It seems you are not in our record. Do you wish to register? (yes/no)");
                            String toRegister = input.nextLine();
                            if(toRegister.equals("yes")){
                                visitor = register(members);
                            }

                        }
                    }
                    else{
                        System.out.println("Incorrect input");
                        break;
                    }

                    int browsing =1;
                    do {
                        System.out.println("Do you wish to browse a section or are you looking for a specific item?");
                        System.out.println("Type \"section\" to view the genres available or \"item\" to look for a book.");
                        String toSearch = input.nextLine();
                        if (toSearch.equals("section")) {
                            System.out.println("Please choose from the following genres:");
                            System.out.println("Fantasy");
                            String section = input.nextLine();
                            List<LibraryItem> selection = visitor.search(items, "", "", section);
                            for (LibraryItem item : selection) {
                                System.out.println(item.getTitle() + " " + item.getAuthor() + " "+ item.getISBN());
                            }
                            if(selection.isEmpty()){
                                System.out.println("No items were found");
                            }
                        } else if (toSearch.equals("item")){
                            System.out.println("What is the title of the book? (First letter should be uppercase)");
                            System.out.println("Type \"unknown\" if you don't know");
                            String titleBook= input.nextLine();
                            if(titleBook.equals("unknown")) titleBook="";
                            System.out.println("Who is the author of the book? (Type \"unknown\" if you don't know)");
                            String authorBook = input.nextLine();
                            if(authorBook.equals("unknown")) authorBook="";
                            List<LibraryItem> itemsFound = visitor.search(items, titleBook, authorBook, "");
                            for (LibraryItem item : itemsFound) {
                                System.out.println(item.getTitle() + " " + item.getAuthor() + " " + item.getISBN());
                            }
                            if(itemsFound.isEmpty()){
                                System.out.println("No items were found");
                            }
                        }
                        browsing = 0;

                    }while(browsing == 1);


                    break;

                case "add book":
                    break;

                case "leave":
                    terminate = 1;
                    break;

            }

        }




    }


    public static Member findMember(List<Member> members, String name, String id){
        for(Member visitor : members){
            if(visitor.getName().equals(name) && visitor.getCardID().equals(id))
                return visitor;
        }

        return null;
    }

    public static String generateID(){
        String id = "";
        for(int i=0; i<7; i++){
            Random r = new Random();
            if(r.nextBoolean()) {
                char c = (char) (r.nextInt(26) + 'a');
                id = id + c;
            }
            else{
                int c = r.nextInt(10);
                id = id + c;
            }
        }

        return id;
    }

    public static Member register(List<Member> members){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your full name?");
        String name = input.nextLine();
        String id = generateID();
        Member visitor = new Member(name, id);
        members.add(visitor);
        System.out.println("Name: " + visitor.getName());
        System.out.println("Card ID: " + visitor.getCardID());

        return visitor;
    }

    public static void setupCollection(List<LibraryItem> items){
        LibraryItem book = new Book("Mistborn", "Brandon Sanderson", null, generateID(), Boolean.TRUE, "physical", "Fantasy", 1, 5, generateID(), "available");
        items.add(book);
        book = new Book("Harry Potter", "JK Rowling", null, generateID(), Boolean.TRUE, "physical", "Fantasy", 1, 5, generateID(), "available");
        items.add(book);
    }

    public static void addBook(List<LibraryItem> items){

    }
}
