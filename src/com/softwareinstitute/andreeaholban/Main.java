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
            System.out.println("Type \"visitor\" if there is a visitor");
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
                    else {
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
                    Book book = new Book("Harry Potter", "JK Rowling", Boolean.TRUE, "available");

                    List<LibraryItem> book2 = visitor.search(items, "", "", "Fantasy");

                    for(LibraryItem item : book2){
                        System.out.println(item.getTitle()+" "+ item.getAuthor());
                    }
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
