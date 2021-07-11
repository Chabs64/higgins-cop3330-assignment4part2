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
    private int currentItem;

    public ToDoList() {
        this.ToDoItemList = new ArrayList<ToDoItem>();
    }

    public void newItem(String Date, String Desc)
    {
        ToDoItem item = new ToDoItem(Date, Desc);

        ToDoItemList.add(item);
    }

    public void newItem(String Date, String Desc, String Done) {

        ToDoItem item = new ToDoItem(Date, Desc);

        item.setDone();

        ToDoItemList.add(item);

    }

    public void nextItem()
    {
        if (currentItem < ToDoItemList.size()-1)
        {
            currentItem = currentItem+1;
        }
    }

    public void prevItem()
    {
        if (currentItem > 0)
        {
            currentItem = currentItem-1;
        }
    }

    public void editItemDate(String date)
    {
        //go to current item
        //call set date method

        ToDoItemList.get(currentItem).setDate(date);
    }

    public void editItemDesc(String Desc)
    {
        //go to current item
        //call set desc method

        ToDoItemList.get(currentItem).setDesc(Desc);
    }

    public void editItemDone()
    {
        ToDoItemList.get(currentItem).setDone();
    }

    public String getItem(int x)
    {
        //make sure ToDoItemList is not empty
        if(ToDoItemList.isEmpty())
        {
            return null;
        }

        //set ItemInfo to get a concat of
        //done, get desc and get date from item
        String ItemInfo = ToDoItemList.get(x).getDone() + "\n" +
                ToDoItemList.get(x).getDesc() + "\n" +
                ToDoItemList.get(x).getDate() + "\n";

        return ItemInfo;
    }

    public String getItem()
    {
        //make sure ToDoItemList is not empty
        if(ToDoItemList.isEmpty())
        {
            return null;
        }
        //set ItemInfo to get a concat of
        //done, get desc and get date from item
        String ItemInfo = ToDoItemList.get(currentItem).getDone() + "\n" +
                ToDoItemList.get(currentItem).getDesc() + "\n" +
                ToDoItemList.get(currentItem).getDate() + "\n";

        return ItemInfo;
    }

    public int ItemSize()
    {
        return ToDoItemList.size();
    }

    public boolean isDone(int x)
    {
        if("Completed".equals(ToDoItemList.get(x).getDone()))
        {
            return true;
        }
        return false;
    }

    public void removeItem()
    {
        if(!ToDoItemList.isEmpty()) {
            ToDoItemList.remove(currentItem);
            currentItem = ToDoItemList.size()-currentItem;
        }
    }

    public void clearItemList()
    {
        ToDoItemList.clear();
        currentItem = 0;
    }
}
