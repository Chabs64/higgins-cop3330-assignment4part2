/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListTest {

    @Test
    void newItem() {

        //create new ToDoList

        //call newItem("desc", "MM-DD-YYYY")

        //Assert ToDoList.ToDoItem[1].getDesc , "desc"
        //Assert ToDoList.ToDoItem[1].getDate , "Date"

    }

    @Test
    void editItemDate() {

        //create new ToDoItem
        //setDate

        //call editItemDate("new date")
        //Assert getDate not equal to old date
    }

    @Test
    void editItemDesc() {

        //create new ToDoItem
        //setDesc

        //call editItemDesc("new desc")
        //Assert getDesc not equal to old desc
    }

    @Test
    void getItem() {

        //create New ToDoList, add new ToDoItem

        //Assert getItem equal "desc  date\n"
    }
}