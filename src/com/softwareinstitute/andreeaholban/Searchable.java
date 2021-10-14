package com.softwareinstitute.andreeaholban;

import java.util.List;

public interface Searchable {

    default LibraryItem search(List<LibraryItem> items, String title){
        LibraryItem itemFound = null;
        for(LibraryItem item : items){
            if(item.getTitle().equals(title)) itemFound = item;
        }

        return itemFound;
    };
}
