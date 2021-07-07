/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Chad Higgins
 *
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
6. A user shall be able to add a new todo list
7. A user shall be able to remove an existing todo list
8. A user shall be able to edit the title of an existing todo list
9. A user shall be able to add a new item to an existing todo list
10.A user shall be able to remove an item from an existing todo list
11. A user shall be able to edit the description of an item within an existing todo list
12. A user shall be able to edit the due date of an item within an existing todo list
13. A user shall be able to mark an item in a todo list as complete
14. A user shall be able to display all of the existing items in a todo list
15. A user shall be able to display only the incompleted items in a todo list
16. A user shall be able to display only the completed items in a todo list
17. A user shall be able to save all of the items in a single todo list to external storage
18. A user shall be able to save all of the items across all of the todo lists to external storage
19. A user shall be able to load a single todo list that was previously saved to external storage
20. A user shall be able to load multiple todo lists that were previous saved to external storage
 */
class ToDoListTest {

    @Test
    void getTitle() {

        //given a ToDoList
        //when call get
        //assert is get equal to set

    }

    @Test
    void setTitle() {

        //given a ToDoList
        //when call set
        //assert is set equal to get
    }

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

    @Test
    void sortItemsByDate() {

        //create new ToDoList, add several new ToDoItems, Hard code dates

        //call List to File

        //create and HardCode Sort File

        //Assert File1 equal to HardCode File2
    }
}