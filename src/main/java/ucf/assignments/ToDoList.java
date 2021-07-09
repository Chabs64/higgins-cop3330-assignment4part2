/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import java.util.ArrayList;

public class ToDoList {

    private ArrayList<ToDoItem> ToDoItemList;

    public ToDoList() {
        ToDoItemList = new ArrayList<ToDoItem>();
    }

    public void newItem(String Date, String Desc)
    {
        ToDoItem item = new ToDoItem(Date, Desc);

        ToDoItemList.add(item);
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
        //call set Desc method
    }

    public String getItem()
    {
        String ItemInfo;

        //set ItemInfo to get a concat of
        // get desc and get date from item

        //return ItemInfo;
        return "";
    }

    public void clearItemList()
    {
        ToDoItemList.clear();
    }

}
