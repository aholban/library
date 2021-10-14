package com.softwareinstitute.andreeaholban;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Member> members = new ArrayList<Member>();

        System.out.println("Hello! Are you new here? (yes/no)");
        String isNew = input.nextLine();
        if(isNew.equals("yes")){
            System.out.println("What is your full name?");
            String name = input.nextLine();
            String id = generateID();
            Member visitor = new Member(name, id);
            members.add(visitor);
            System.out.println("Name: " +visitor.getName());
            System.out.println("Card ID: " + visitor.getCardID() );
        }
        else {
            System.out.println("What is your full name?");
            String name = input.nextLine();

        }

        Book book = new Book("Harry Potter", "JK Rowling", Boolean.TRUE, "available");

    }

    public static Member findMember(Member[] members, String name){
        for(Member visitor : members){
            if(visitor.getName().equals(name))
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
}
