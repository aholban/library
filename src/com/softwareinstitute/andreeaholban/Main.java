package com.softwareinstitute.andreeaholban;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Member> members = new ArrayList<Member>();
        int terminate =0;
        while(terminate==0){
            System.out.println("Hello! Are you new here? (yes/no)");
            String isNew = input.nextLine();
            if (isNew.equals("yes")) {
                Member visitor = register(members);

            } else {
                System.out.println("What is your full name?");
                String name = input.nextLine();
                System.out.println("What is your card ID?");
                String id = input.nextLine();
                Member visitor = findMember(members, name, id);
                if (visitor == null) {
                    System.out.println("It seems you are not in our record. Do you wish to register? (yes/no)");
                    String toRegister = input.nextLine();
                    if(toRegister.equals("yes")){
                        visitor = register(members);
                    }

                }
            }

            terminate = 1;

        }

        Book book = new Book("Harry Potter", "JK Rowling", Boolean.TRUE, "available");


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
}
