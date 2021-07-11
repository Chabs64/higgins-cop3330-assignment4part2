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
1.The application shall manage a single list of items
        1.1 The list shall have the capacity to store at least 100 unique items
2. An item shall have a description --------
        2.1 A description shall be between 1 and 256 characters in length
3. An item shall have a due date ---------
        3.1 A due date shall be a valid date within the Gregorian Calendar
        3.2 A due date shall be displayed to users in the format: YYYY-MM-DD

4. A user shall be able to add a new item to the list ---------
5. A user shall be able to remove an item from the list
6. A user shall be able to clear the list of all items
7. A user shall be able to edit the description of an item within the list ---------
8. A user shall be able to edit the due date of an item within the list -----------
9. A user shall be able to mark an item in the list as either complete or incomplete ---------
10. A user shall be able to display all of the existing items in the list
11. A user shall be able to display only the incomplete items in the list
12. A user shall be able to display only the completed items in the list

13. A user shall be able to save the list (and all of its items) to external storage ----------
14. A user shall be able to load a list (and all of its items) from external storage ----------

15. The developer shall provide a help screen with directions on how to use the application.
    The help screen shall describe how to execute each behavioral requirement provided by the application
    (e.g. add an item, remove an item, edit an item, etc)
    The help screen shall include a dedication to "Rey"
    This help screen shall be provided as either a dedicated window within the application,
    or a markdown file called `readme.md` on your GitHub repository for the project.)
*/

class ToDoItemTest {

    @Test
    void getDateItemWill3() {
        //create new item
        ToDoItem Item = new ToDoItem("date", "desc");

        //call get method
        //assert it is the date gotten is what the you set the date to
        assertEquals("date", Item.getDate());
    }

    @Test
    void setDateItemWill3() {
        //create new item
        ToDoItem Item = new ToDoItem("date", "desc");

        //call set method with new date
        Item.setDate("new date");

        //assert it is the date gotten is what the you set the date to
        assertEquals("new date", Item.getDate());
    }

    @Test
    void getDescItemWill2() {
        //create new item
        ToDoItem Item = new ToDoItem("date", "desc");

        //call get method
        //assert it is the desc gotten is what the you set the desc to
        assertEquals("desc", Item.getDesc());
    }

    @Test
    void setDescItemWill2() {
        //create new item
        ToDoItem Item = new ToDoItem("date", "desc");

        //call set method
        Item.setDesc("new desc");

        //assert it is the desc gotten is what the you set the desc to
        assertEquals("new desc", Item.getDesc());
    }

    @Test
    void getDonePartOf11through15() {
        //create new item
        ToDoItem Item = new ToDoItem("date", "desc", "Completed");

        //call get method
        //assert Completed gotten is what the you set the Completed to
        assertEquals("Completed", Item.getDone());
    }

    @Test
    void setDoneUserCan9() {
        //create new item
        ToDoItem Item = new ToDoItem("date", "desc");

        //call set method, this should toggle from incomplete to complete
        Item.setDone();

        //assert Completed gotten is what the you set the Completed to
        assertEquals("Completed", Item.getDone());
    }
}