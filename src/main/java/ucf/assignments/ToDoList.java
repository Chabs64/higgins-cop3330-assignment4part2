/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import java.util.ArrayList;

public class ToDoList {

    private String Title;
    private ArrayList<ToDoItem> ToDoItem;
    private int CurrentItem;

    public String Date;
    public String Desc;

    public ToDoList(){

        //set title
    }

    public String getTitle(){ return Title;}
    public void setTitle(String title){

        //Title = title;
    };

    private boolean dateChecker(String Date) {

        //if Date match format MM-DD-YEAR //use .matchs
        //return ture;

        return false;
    }


    public void newItem(String Date, String Desc)
    {
        //call toDoitem item = new item

        //call date checker while loop
        //if bad get new call get userinput date

        //set item date
        //set item Desc

        //add it to list
    }

    public void editItemDate(int listNumber, String date)
    {

        //go to item with listNumber

        //call date checker while loop
        //if bad get new call get userinput date

        //call set date method
    }

    public void editItemDesc(String Desc)
    {

        //go to item with listNumber

        //call set Desc method
    }

    public String getItem()
    {
        String ItemInfo;

        //find item in list with listNumber

        //set ItemInfo to get a concat of
        // get desc and get date from item

        //return ItemInfo;
        return "";
    }

    public void SortItemsByDate()
    {

        //call collection.sort() on the ArrayList of Items
        // .compareTo the year, then compareTo the month, then compareTo the day.
    }


}
